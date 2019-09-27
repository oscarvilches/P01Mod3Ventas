package p01mod3ventas.modelos;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Oscar Vilches
 */
public class ColeccionVentasTest {

    public ColeccionVentasTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of listar method, of class ColeccionVentas.
     */
    @Test
    public void testListar() {
        System.out.println("listar");
        ColeccionVentas instance = new ColeccionVentas();
        ArrayList<Venta> expResult = new ArrayList<>();
        ArrayList<Venta> result = instance.listar();
        assertEquals(expResult, result);
    }

    /**
     * Test of agregar method, of class ColeccionVentas.
     */
    @Test
    public void testAgregar() {
        System.out.println("agregar");
        Venta venta = new Venta("001", 500, 2);
        ColeccionVentas instance = new ColeccionVentas();
        boolean expResult = true;
        boolean result = instance.agregar(venta);
        assertEquals(expResult, result);
    }

    /**
     * Test of modificar method, of class ColeccionVentas.
     */
    @Test
    public void testModificar() {
        System.out.println("modificar");
        Venta venta = new Venta("001", 500, 2);
        ColeccionVentas instance = new ColeccionVentas();
        instance.agregar(venta);
        boolean expResult = true;
        boolean result = instance.modificar(venta);
        assertEquals(expResult, result);

    }

    /**
     * Test of eliminar method, of class ColeccionVentas.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        Venta venta = new Venta("001", 500, 2);
        String codigo = "001";
        ColeccionVentas instance = new ColeccionVentas();
        instance.agregar(venta);
        boolean expResult = true;
        boolean result = instance.eliminar(codigo);
        assertEquals(expResult, result);
    }

    /**
     * Test of subTotal method, of class ColeccionVentas.
     */
    @Test
    public void testSubTotal() {
        System.out.println("subTotal");
        Venta v = new Venta("001", 500, 2);
        ColeccionVentas instance = new ColeccionVentas();
        int expResult = 1000;
        int result = instance.subTotal(v);
        //assertEquals(expResult, result);
        assertTrue(result == expResult);
    }

}
