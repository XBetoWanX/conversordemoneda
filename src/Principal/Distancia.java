package Principal;

public class Distancia extends RuntimeException {

	public String convertirKmAMille(double KM) {
		double resultado = KM * 0.6214;
		if (resultado == 1) {
			return resultado + " mile";
		} else {
			return resultado + " miles";
		}

	}
	
	public String convertirKmAYd(double KM) {
		double resultado = KM * 1093.61;
		return resultado + " Yd";
	}
	
	public String convertirKmAFt(double KM) {
		double resultado = KM * 3280.84;
		return resultado + " Ft";
	}
	
	

	public String convertirMilleAKM(double Mille) {
		double resultado = Mille * 0.6214;
		return resultado + " KM";
	}
	
	public String convertirYdAKm(double Yd) {
		double resultado = Yd / 1093.61;
		return resultado + " Ft";
	}
	public String convertirFtAKm(double Ft) {
		double resultado = Ft / 3280.84;
		return resultado + " Ft";
	}
	

}
