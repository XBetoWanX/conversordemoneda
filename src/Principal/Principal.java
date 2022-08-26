package Principal;

import javax.swing.*;

public class Principal {
	
	public static void main(String[] args) {
		
		OpcionesConversion tipo = new OpcionesConversion();
		boolean continuar = true;
		
		
		while(continuar) {
			String opciones = JOptionPane.showInputDialog(null, "Seleccione el tipo de conversión", "Menu", JOptionPane.PLAIN_MESSAGE, null,
					new Object[] {"Conversor de moneda", "Conversor de distancia"}, "Seleccionar").toString();
			switch(opciones) {
			case "Conversor de moneda":
				tipo.conversorMonedas();
				break;
			case "Conversor de distancia":
				tipo.conversorDistancia();
				break;
			}
			
			int salir = JOptionPane.showInternalConfirmDialog(null,
					"¿Desea hacer otra conversión?", "information",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
			if(salir >= 1) {
				continuar = false;
			}
			
		}
		JOptionPane.showInternalMessageDialog(null, "Programa Terminado",
				"information", JOptionPane.INFORMATION_MESSAGE);
	}
}
