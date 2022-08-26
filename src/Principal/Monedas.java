package Principal;

public class Monedas {
	
	
	public String convertirPesoADolar(double MXN) {
		double resultado = MXN * 0.050;
		return resultado + " USD";
	}
	
	public String convertirPesoALibraEsterlina(double MXN) {
		double resultado = MXN * 0.042;
		return resultado + " GBP";
	}
	
	public String convertirPesoAYen(double MXN) {
		double resultado = MXN * 6.86;
		return resultado + " JPY";
	}
	public String convertirPesoAWon(double MXN) {
		double resultado = MXN * 66.98;
		return resultado + " KRW";
	}
	public String convertirDolarAPeso(double USD) {
		double resultado = USD / 0.050;
		return resultado + " MXN";
	}
	public String convertirLibraEsterlinaAPeso(double GBP) {
		double resultado = GBP / 0.042;
		return resultado + " MXN";
	}
	public String convertirYenAPeso(double JPY) {
		double resultado = JPY / 6.86;
		return resultado + " MXN";
	}
	public String convertirWonAPeso(double KRW) {
		double resultado = KRW / 66.98;
		return resultado + " MXN";
	}
}
