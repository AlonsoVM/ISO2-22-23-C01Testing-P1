//clase para calcular los bisiestos
package ISO_C01_G01.YearBisiesto;

public class BuscadorFechasBisiestos {
	public static String comprobarDatos(FechaP datos){
		 
			String cadena = "";
			String cadenaBIS = "";
			
			if (datos.getDia() <= 0 || datos.getDia() > 31){
				cadena = "dia negativo";
				System.out.println(cadena);
			}
			if (datos.getMes() <= 0 || datos.getMes() > 12) {
				cadena = "mes negativo";
				System.out.println(cadena);
			}
			if (datos.getAnno() <= 0 ) {
				cadena = "año negativo";
				System.out.println(cadena);
			}
		
		cadenaBIS = comprobarBisiesto(datos);
		return cadenaBIS;
	}	
	
	public static String comprobarBisiesto(FechaP datos){
			
			if ( ( (datos.getAnno() % 4) == 0) && 
			( (datos.getAnno() % 100) != 0) || 
			( (datos.getAnno() % 400) == 0) ){

				return "es Bisiesto";
			}else {
				return "no Bisiesto";
			}
	}
}


	

