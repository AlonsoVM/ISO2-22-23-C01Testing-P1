//clase para testing
package ISO_C01_G01.YearBisiesto;
import static org.junit.Assert.*;

import org.junit.Test;


public class bisiestosTest 
{
	@Test
    public void testsgetters() {
    	FechaP fecha = new FechaP(2, 2, 2004);
    	assertEquals(fecha.getDia(), 2);
    	assertEquals(fecha.getMes(), 2);
    	
    }
	@Test
	public void testsetter() {
    	FechaP fecha = new FechaP(2, 2, 2004);
    	fecha.setAnno(1);
    	fecha.setDia(1);
    	fecha.setMes(1);
    	assertEquals(fecha.getDia(), 1);
    	assertEquals(fecha.getMes(), 1);
    	assertEquals(fecha.getAnno(), 1);
	}
	@Test
    public void tests1() {
    	FechaP fecha = new FechaP(2, -1, 2004);
    	assertEquals(BuscadorFechasBisiestos.comprobarDatos(fecha), "mes negativo");
    }
	@Test
    public void tests2() {
    	FechaP fecha = new FechaP(-1, -1, 2004);
    	assertEquals(BuscadorFechasBisiestos.comprobarDatos(fecha), "dia negativo");
    }
	@Test
    public void tests3() {
    	FechaP fecha = new FechaP(2, 2, -1);
    	assertEquals(BuscadorFechasBisiestos.comprobarDatos(fecha), "año negativo");
    }
	@Test
    public void tests4() {
    	FechaP fecha = new FechaP(2, 2, 2004);
    	assertEquals(BuscadorFechasBisiestos.comprobarDatos(fecha), "es Bisiesto");
    }
	@Test
    public void tests5() {
    	FechaP fecha = new FechaP(2, 2, 2005);
    	assertEquals(BuscadorFechasBisiestos.comprobarDatos(fecha), "no Bisiesto");
    }
}