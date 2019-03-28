package paquete1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class UsuarioTest {
    
    public UsuarioTest() {
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
     * Test of solicitaSube method, of class Usuario.
     */
   /* @Test
    public void testSolicitaSube() {
        System.out.println("solicitaSube");
        Usuario instance = new Usuario();
        instance.solicitaSube();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    /**
     * Test of realizarViaje method, of class Usuario.
     */
    @Test
    public void testRealizarViaje() {
        System.out.println("realizarViaje");
        MedioTransporte colectivo = new MedioTransporte(20);
        Usuario usuario1 = new Usuario();
        usuario1.solicitarSube();
        usuario1.cargarSaldo(25);
        usuario1.realizarViaje(colectivo);
        int saldoEsperado = 5;
        int saldoReal = usuario1.preguntarSaldo();
        assertEquals(saldoEsperado,saldoReal);
    }
    
    @Test(expected = NoPuedePagarException.class)
    public void testNoPuedeRealizarViaje() {
        System.out.println("No puede realizar viaje");
        MedioTransporte colectivo = new MedioTransporte(22);
        Usuario usuario1 = new Usuario();
        usuario1.solicitarSube();
        usuario1.realizarViaje(colectivo);
    }
    
     @Test
    public void testRealizarViajeYQuedarEnNegativoEnLaSube() {
        System.out.println("testRealizarViajeYQuedarEnNegativoEnLaSube");
        MedioTransporte colectivo = new MedioTransporte(20);
        Usuario usuario1 = new Usuario();
        usuario1.solicitarSube();
        usuario1.realizarViaje(colectivo);
        int saldoEsperado = -20;
        int saldoReal = usuario1.preguntarSaldo();
        assertEquals(saldoEsperado,saldoReal);
    }
    

    /**
     * Test of pagarServicio method, of class Usuario.
     */
  /*  @Test
    public void testPagarServicio() {
        System.out.println("pagarServicio");
        Servicio servicio = null;
        Usuario instance = new Usuario();
        instance.pagarServicio(servicio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    /**
     * Test of solicitarNuevaTarjeta method, of class Usuario.
     */
  /*  @Test
    public void testSolicitarNuevaTarjeta() {
        System.out.println("solicitarNuevaTarjeta");
        Usuario instance = new Usuario();
        instance.solicitarNuevaTarjeta();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    /**
     * Test of solicitarSube method, of class Usuario.
     */
  /*  @Test
    public void testSolicitarSube() {
        System.out.println("solicitarSube");
        Usuario instance = new Usuario();
        instance.solicitarSube();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    /**
     * Test of cargarSaldo method, of class Usuario.
     */
    @Test
    public void testCargarSaldo() {
        System.out.println("cargarSaldo");
        int plata = 150;
        Usuario usuario1 = new Usuario();
        usuario1.solicitarSube();
        usuario1.cargarSaldo(150);
        assertEquals("No se cargo el saldo esperado",plata,usuario1.preguntarSaldo());
    }

    /**
     * Test of preguntarSaldo method, of class Usuario.
     */
   /* @Test
    public void testPreguntarSaldo() {
        System.out.println("preguntarSaldo");
        Usuario instance = new Usuario();
        int expResult = 0;
        int result = instance.preguntarSaldo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
}
