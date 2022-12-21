package ISO_C01_G01.YearBisiesto;
import static org.junit.Assert.*;


public class bisiestosTest 
{
	public void testAdd() throws Excepcion {	
		fechaP datos = new fechaP(24, 04, 2004);
		datos.setDia(24);
		datos.setMes(4);
		datos.setAnno(2004);
		//hago cobertura de los metodos set
		fechaP bisi = new fechaP(datos.getDia(),datos.getMes(),datos.getAnno());
		fechaP bisi6 = new fechaP(1, 1, 100);
		fechaP bisi7 = new fechaP(-1, -1, 100);
		fechaP bisi8 = new fechaP(1, -1, 100);
		fechaP bisi9 = new fechaP(24, 4, -100);
		fechaP bisi10 = new fechaP('a', 1, 100);
		
		//casos de prueba que nos dan
		calculoBisiesto.comprobarDatos(bisi6);
		calculoBisiesto.comprobarDatos(bisi7);
		calculoBisiesto.comprobarDatos(bisi8);
		calculoBisiesto.comprobarDatos(bisi9);
		calculoBisiesto.comprobarDatos(bisi10);
		
		//subo cobertura de las comprobaciones de mes y año///
		fechaP bisi11 = new fechaP(2, -1, 2000);//> mes
		fechaP bisi12 = new fechaP(2, 2, 200);//< mes
		
		calculoBisiesto.comprobarDatos(bisi11);
		calculoBisiesto.comprobarDatos(bisi12);
	
		
	    boolean actual = calculoBisiesto.comprobarBisiesto(bisi);
	    boolean expected = true;
	    assertEquals(expected, actual);
	}
}