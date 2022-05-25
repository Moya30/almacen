package interfaz;



import java.sql.ResultSet;

public interface AlmacenInterface <Objeto> {
    public void insertar(Objeto objObjeto) throws Exception;
    public void update(Objeto objObjeto) throws Exception;
    public void delete(Objeto objObjeto) throws Exception;
    
    public ResultSet buscar(Object objObject) throws Exception;

}
