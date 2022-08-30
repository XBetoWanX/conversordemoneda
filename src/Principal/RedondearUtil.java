package Principal;

public class RedondearUtil {
	
	private double resultado;
	
	
	public double redondear(double cantidad) {
		return this.resultado = (double) Math.round(cantidad * 100d)/100;
		
	}
}
