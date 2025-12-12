package ej1validaciones;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CuentaBancariaTest {
    private CuentaBancaria validacion;

    @BeforeEach
    public void setUp() {
        validacion = new CuentaBancaria(1000);
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Prueba completada");
    }

    @Test
    public void testCuentaBancaria() {
        assertEquals(1000,validacion.getSaldo());
    }

    @Test
    public void testSaldoInicialNegativo() {
        assertThrows(IllegalArgumentException.class,()->new CuentaBancaria(-500));
    }

    @Test
    public void testDepositar() {
        validacion.depositar(500);
        assertEquals(1500,validacion.getSaldo());
    }

    @Test
    public void testRetirar() {
        validacion.retirar(200);
        assertEquals(800,validacion.getSaldo());
    }

    @Test
    public void testDepositoMontoInvalido() {
        assertThrows(IllegalArgumentException.class,()->validacion.depositar(-10));
    }

    @Test
    public void testRetirarMontoInvalido() {
        assertThrows(IllegalArgumentException.class,()->validacion.retirar(-200));
    }

    @Test
    public void testRetirarFondoInsuficiente() {
        assertThrows(IllegalStateException.class,()->validacion.retirar(2000));
    }

}
