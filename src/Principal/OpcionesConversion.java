package Principal;

import javax.swing.JOptionPane;

public class OpcionesConversion extends RuntimeException {

	public void conversorMonedas() {

		Object[] possibleValues = { "Pesos MXN a Dolares USD", "Pesos MXN a Libras Esterlinas GBP",
				"Pesos MXN a Yen JPY", "Pesos MXN a Won sur-coreano KRW", "Dolares USD a Pesos MXN",
				"Libras Esterlinas GBP a Pesos MXN", "Yen JPY a Pesos MXN", "Won sur-coreano KRW a Pesos MXN" };

		Object selectedValue = JOptionPane.showInputDialog(null, "Seleccione la divisa a convertir", "Input",
				JOptionPane.INFORMATION_MESSAGE, null, possibleValues, possibleValues[0]);

		String valorSeleccionado = selectedValue.toString();
		try {
			String inputValue = JOptionPane.showInputDialog("Ingrese la cantidad");

			double cantidad = Double.parseDouble(inputValue);

			Monedas conversion = new Monedas();
			VentanaPrincipal ventanaConversor = new VentanaPrincipal();

			switch (valorSeleccionado) {
			case "Pesos MXN a Dolares USD":
				ventanaConversor.mostrarResultado(conversion.convertirPesoADolar(cantidad));
				break;
			case "Pesos MXN a Libras Esterlinas GBP":
				ventanaConversor.mostrarResultado(conversion.convertirPesoALibraEsterlina(cantidad));
				break;
			case "Pesos MXN a Yen JPY":
				ventanaConversor.mostrarResultado(conversion.convertirPesoAYen(cantidad));
				break;
			case "Pesos MXN a Won sur-coreano KRW":
				ventanaConversor.mostrarResultado(conversion.convertirPesoAWon(cantidad));
				break;
			case "Dolares USD a Pesos MXN":
				ventanaConversor.mostrarResultado(conversion.convertirDolarAPeso(cantidad));
				break;
			case "Libras Esterlinas GBP a Pesos MXN":
				ventanaConversor.mostrarResultado(conversion.convertirLibraEsterlinaAPeso(cantidad));
				break;
			case "Yen JPY a Pesos MXN":
				ventanaConversor.mostrarResultado(conversion.convertirYenAPeso(cantidad));
				break;
			case "Won sur-coreano KRW a Pesos MXN":
				ventanaConversor.mostrarResultado(conversion.convertirWonAPeso(cantidad));
				break;
			}
		}catch(NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "Debe escribir solamente numeros", "alert", JOptionPane.ERROR_MESSAGE);
		}

	}

	public void conversorDistancia() {
		Object[] possibleValues = { "Kilometros a Millas", "Kilometros a Yardas", "Kilometros a Pies",
				"Millas a Kilometros", "Yardas a Kilometros", "Pies a Kilometros" };

		Object selectedValue = JOptionPane.showInputDialog(null, "Seleccione la divisa a convertir", "Input",
				JOptionPane.INFORMATION_MESSAGE, null, possibleValues, possibleValues[0]);

		String valorSeleccionado = selectedValue.toString();
		try {
			String inputValue = JOptionPane.showInputDialog("Ingrese la cantidad");
			double cantidad = Double.parseDouble(inputValue);

			Distancia conversion = new Distancia();
			VentanaPrincipal ventanaConversor = new VentanaPrincipal();
			switch (valorSeleccionado) {
			case "Kilometros a Millas":
				ventanaConversor.mostrarResultado(conversion.convertirKmAMille(cantidad));
				break;
			case "Kilometros a Yardas":
				ventanaConversor.mostrarResultado(conversion.convertirKmAYd(cantidad));
				break;
			case "Kilometros a Pies":
				ventanaConversor.mostrarResultado(conversion.convertirKmAFt(cantidad));
				break;
			case "Millas a Kilometros":
				ventanaConversor.mostrarResultado(conversion.convertirMilleAKM(cantidad));
				break;
			case "Yardas a Kilometros":
				ventanaConversor.mostrarResultado(conversion.convertirYdAKm(cantidad));
				break;
			case "Pies a Kilometros":
				ventanaConversor.mostrarResultado(conversion.convertirFtAKm(cantidad));
			}
		}catch(NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "Debe escribir solamente numeros", "alert", JOptionPane.ERROR_MESSAGE);
		}
		
	}
}
