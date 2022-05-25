
package logica;

import conexion.ConMySQL;
import entity.CEProducto;
import interfaz.AlmacenInterface;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.CallableStatement;
import entity.CEProducto;

public class ProductoDAO implements AlmacenInterface<CEProducto> {

    @Override
    public void insertar(CEProducto objObjeto) throws Exception {
        Connection cn = ConMySQL.getInstance().getConnection();
        String sql = "CALL sp_insert_producto(?,?,?);";
        CallableStatement cs = cn.prepareCall(sql);
        cs.setString(1, objObjeto.getCodiEmpl());
        cs.setString(2, objObjeto.getDescProd());
     //   cs.setString(3, objObjeto.getObsvprod());
        cs.execute();
    }

    @Override
    public void update(CEProducto objObjeto) throws Exception {
        Connection cn = ConMySQL.getInstance().getConnection();
        String sql = "CALL sp_update_producto(?,?,?,?);";
        CallableStatement cs = cn.prepareCall(sql);
        //cs.setInt(1, objObjeto.getIdproducto());
       // cs.setString(2, objObjeto.getNombprod());
      //  cs.setDouble(3, objObjeto.getPrecprod());
       // cs.setString(4, objObjeto.getObsvprod());
        cs.execute();
    }

    @Override
    public void delete(CEProducto objObjeto) throws Exception {
        Connection cn = ConMySQL.getInstance().getConnection();
        String sql = "CALL sp_delete_producto(?);";
        CallableStatement cs = cn.prepareCall(sql);
        //cs.setInt(1, objObjeto.getIdproducto());
        cs.execute();

    }

    @Override
    public ResultSet buscar(Object objObject) throws Exception {
        Connection cn = ConMySQL.getInstance().getConnection();
        String nombre = "%" + objObject + "%";
        String sql = "select * from vproducto where nombprod like ?";
        PreparedStatement ps = cn.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ps.setString(1, nombre);
        ResultSet rs = ps.executeQuery();
        return rs;
    }

}
