package ISO_C01_G01.YearBisiesto;

import java.util.InputMismatchException;


public class calculoBisiesto {
	public static void main(String [] args) throws Excepcion {
		//fechaP datosMes = new fechaP(2, -1, 2000);
		//comprobarDatos(datosMes);
		
	
	}
	public static String comprobarDatos(fechaP datos){
		 
		try {
			if (datos.getDia() <= 0 || datos.getDia() > 31){
				return "dia negativo";
			}
			if (datos.getMes() <= 0 || datos.getMes() > 12) {
				return "mes negativo";
			}
			if (datos.getAnno() <= 0 ) {
				return "año negativo";
			}
		}catch (InputMismatchException e){
			System.err.print(e);
		}
		String a = comprobarBisiesto(datos);
		return a;
	}	
	
	public static String comprobarBisiesto(fechaP datos){
			
			if ( ( (datos.getAnno() % 4) == 0) && 
			( (datos.getAnno() % 100) != 0) || 
			( (datos.getAnno() % 400) == 0) ){

				return "es Bisiesto";
			}else {
				return "no Bisiesto";
			}
	}
}


	

