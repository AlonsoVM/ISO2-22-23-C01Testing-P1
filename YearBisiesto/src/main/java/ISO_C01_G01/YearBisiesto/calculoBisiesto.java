package ISO_C01_G01.YearBisiesto;

public class calculoBisiesto {
	public static String comprobarDatos(fechaP datos){
		 
		
			if (datos.getDia() <= 0 || datos.getDia() > 31){
				return "dia negativo";
			}
			if (datos.getMes() <= 0 || datos.getMes() > 12) {
				return "mes negativo";
			}
			if (datos.getAnno() <= 0 ) {
				return "año negativo";
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


	

