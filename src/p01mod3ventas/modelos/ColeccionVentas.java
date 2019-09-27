package p01mod3ventas.modelos;

import java.util.ArrayList;

/**
 * @author Oscar Vilches
 */
public class ColeccionVentas {

    private ArrayList<Venta> base;

    public ColeccionVentas() {
        this.base = new ArrayList<Venta>();
    }

    public ArrayList<Venta> listar() {
        return this.base;
    }

    public boolean agregar(Venta venta) {
        return this.base.add(venta);
    }

    public boolean modificar(Venta venta) {
        for (int i = 0; i < this.base.size(); i++) {
            if (this.base.get(i).getCodigo().equals(venta.getCodigo())) {
                this.base.get(i).setCodigo(venta.getCodigo());
                this.base.get(i).setPrecio(venta.getPrecio());
                this.base.get(i).setCantidad(venta.getCantidad());
                return true;
            }
        }
        return false;
    }

    public boolean eliminar(String codigo) {
        for (int i = 0; i < this.base.size(); i++) {
            if (this.base.get(i).getCodigo().equals(codigo)) {
                this.base.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public int subTotal(Venta v){
        return v.getPrecio()*v.getCantidad();
    }
}
