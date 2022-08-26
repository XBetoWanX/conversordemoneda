package Principal;

import javax.swing.*;

public class VentanaPrincipal extends JFrame{
		
	public void mostrarResultado(String resultado) {
		JOptionPane.showInternalMessageDialog(null, "El valor de la conversión es de " + resultado,
				"Information", JOptionPane.INFORMATION_MESSAGE);
	}
}
