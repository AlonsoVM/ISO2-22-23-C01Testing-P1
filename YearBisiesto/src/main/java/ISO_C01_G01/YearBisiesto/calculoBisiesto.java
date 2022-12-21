package ISO_C01_G01.YearBisiesto;

import java.util.InputMismatchException;


public class calculoBisiesto {
	public static void main(String [] args) throws Excepcion {
		//fechaP datosMes = new fechaP(2, -1, 2000);
		//comprobarDatos(datosMes);
		
	
	}
	public static void comprobarDatos(fechaP datos)throws Excepcion{
		 
		try {
			if (datos.getDia() <= 0 || datos.getDia() > 31){
				throw new Excepcion("dia negativa");
			}
			if (datos.getMes() <= 0 || datos.getMes() > 12) {
				throw new Excepcion("mes negativo");
			}
			if (datos.getAnno() <= 0 ) {
				throw new Excepcion("año negativo");
			}
		}catch (InputMismatchException e){
			System.err.print(e);
		}
		comprobarBisiesto(datos);
	}	
	
	public static boolean comprobarBisiesto(fechaP datos){
		boolean esBisiesto = false;
			
			if ( ( (datos.getAnno() % 4) == 0) && 
			( (datos.getAnno() % 100) != 0) || 
			( (datos.getAnno() % 400) == 0) ){
				System.out.println("Es bisiesto");
				esBisiesto = true;
			}else {
				System.out.println("No es bisiesto");
				esBisiesto = false;
			}
			return esBisiesto;
	}
}


	

