package p01mod3ventas;

import java.util.ArrayList;
import p01mod3ventas.modelos.ColeccionVentas;
import p01mod3ventas.modelos.Venta;

/**
 * @author Oscar Vilches
 */
public class Main {

    public static void listarVentas(ArrayList<Venta> lista) {
        for (Venta obj : lista) {
            System.out.println("Codigo: " + obj.getCodigo());
            System.out.println("Precio: " + obj.getPrecio());
            System.out.println("Cantidad: " + obj.getCantidad());
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        ColeccionVentas lista = new ColeccionVentas();
        Venta venta;
        //String codigo;

        venta = new Venta("001", 500, 2);
        lista.agregar(venta);

        System.out.println("*--Listar--*");
        listarVentas(lista.listar());
        System.out.println("*--SubTotal--*");
        System.out.println(lista.subTotal(venta));
    }

}
