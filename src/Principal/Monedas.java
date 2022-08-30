package Principal;

public class Monedas {
	
	private RedondearUtil util;
	
	public Monedas() {
		this.util = new RedondearUtil();
	}
	
	public String convertirPesoADolar(double MXN) {
		double resultado = MXN * 0.050;
		resultado = this.util.redondear(resultado);
		return resultado + " USD";
	}
	
	public String convertirPesoALibraEsterlina(double MXN) {
		double resultado = MXN * 0.042;
		resultado = this.util.redondear(resultado);
		return resultado + " GBP";
	}
	
	public String convertirPesoAYen(double MXN) {
		double resultado = MXN * 6.86;
		resultado = this.util.redondear(resultado);
		return resultado + " JPY";
	}
	public String convertirPesoAWon(double MXN) {
		double resultado = MXN * 66.98;
		resultado = this.util.redondear(resultado);
		return resultado + " KRW";
	}
	public String convertirDolarAPeso(double USD) {
		double resultado = USD / 0.050;
		resultado = this.util.redondear(resultado);
		return resultado + " MXN";
	}
	public String convertirLibraEsterlinaAPeso(double GBP) {
		double resultado = GBP / 0.042;
		resultado = this.util.redondear(resultado);
		return resultado + " MXN";
	}
	public String convertirYenAPeso(double JPY) {
		double resultado = JPY / 6.86;
		resultado = this.util.redondear(resultado);
		return resultado + " MXN";
	}
	public String convertirWonAPeso(double KRW) {
		double resultado = KRW / 66.98;
		resultado = this.util.redondear(resultado);
		return resultado + " MXN";
	}
}
