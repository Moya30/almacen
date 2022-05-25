package vista;

import entity.CEProducto;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import logica.CLProducto;

public class Producto {

    public static void main(String[] args) {

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        String dateToStr = dateFormat.format(date);

        CLProducto obj = new CLProducto();
        //obj.insertar("SKU01", "AZUCAR", "RUBIA", "INSUMO", 20, 4.2, "KG", date, "BARRANCA", "ALAMCEN", 12, 20, "GUSTAVO");

        CEProducto prod = new CEProducto();
        prod.toString();
    }
}
