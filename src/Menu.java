import javax.swing.JOptionPane;

public class Menu {
	public static double inputValue(double amount) {
		try {
			amount = Double
					.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de dinero que desea convertir:"));
		}

		catch (NumberFormatException excep) {
			amount = -1;
			JOptionPane.showMessageDialog(null, "Valor no válido", "Message", JOptionPane.INFORMATION_MESSAGE);
		}

		return amount;
	}

	public static int startMenu() {
		Object[] menuOptions = { "Conversor de Moneda", "Conversor de Temperatura" };

		Object selectedValue = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menu",
				JOptionPane.PLAIN_MESSAGE, null, menuOptions, menuOptions[0]);

		double amount = -1;
		while (amount < 0) {
			amount = inputValue(amount);
		}

		if (selectedValue == menuOptions[0]) {
			Currency newExchange = new Currency(amount);
			JOptionPane.showMessageDialog(null, "Tienes $" + newExchange.getResultMessage());
		} else {
			Temperature newExchange = new Temperature(amount);
			JOptionPane.showMessageDialog(null, newExchange.getResultMessage());
		}

		int continueValue = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Select an Option",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

		return continueValue;
	}

	public static void main(String[] args) {
		int continueValue = 0;

		while (continueValue == 0) {
			continueValue = startMenu();
		}
		JOptionPane.showMessageDialog(null, "Programa terminado", "Message", JOptionPane.INFORMATION_MESSAGE);
	}
}
