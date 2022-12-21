package ISO_C01_G01.YearBisiesto;
import static org.junit.Assert.*;

import org.junit.Test;


public class bisiestosTest 
{
	@Test
    public void testsgetters() {
    	fechaP fecha = new fechaP(2, 2, 2004);
    	assertEquals(fecha.getDia(), 2);
    	assertEquals(fecha.getMes(), 2);
    	
    }
	@Test
	public void testsetter() {
    	fechaP fecha = new fechaP(2, 2, 2004);
    	fecha.setAnno(1);
    	fecha.setDia(1);
    	fecha.setMes(1);
    	assertEquals(fecha.getDia(), 1);
    	assertEquals(fecha.getMes(), 1);
    	assertEquals(fecha.getAnno(), 1);
	}
	@Test
    public void tests1() {
    	fechaP fecha = new fechaP(2, -1, 2004);
    	assertEquals(calculoBisiesto.comprobarDatos(fecha), "mes negativo");
    }
	@Test
    public void tests2() {
    	fechaP fecha = new fechaP(-1, -1, 2004);
    	assertEquals(calculoBisiesto.comprobarDatos(fecha), "dia negativo");
    }
	@Test
    public void tests3() {
    	fechaP fecha = new fechaP(2, 2, -1);
    	assertEquals(calculoBisiesto.comprobarDatos(fecha), "año negativo");
    }
	@Test
    public void tests4() {
    	fechaP fecha = new fechaP(2, 2, 2004);
    	assertEquals(calculoBisiesto.comprobarDatos(fecha), "es Bisiesto");
    }
	@Test
    public void tests5() {
    	fechaP fecha = new fechaP(2, 2, 2005);
    	assertEquals(calculoBisiesto.comprobarDatos(fecha), "no Bisiesto");
    }
}