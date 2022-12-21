package ISO_C01_G01.YearBisiesto;
	
public class Excepcion extends Exception {
	
	private static final long serialVersionUID = 1L;

	Excepcion (String cadena){
		super();
		System.out.println(cadena);
	}

	@Override
	public String toString() {
		return "fecha invalida";
				
	}
}

