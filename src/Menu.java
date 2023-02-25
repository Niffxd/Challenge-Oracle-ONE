import javax.swing.JOptionPane;

public class Menu {
	public static double inputValue(double amount, int op) {
		Object[] messages = {
			"Ingrese la cantidad de dinero que deseas convertir",
			"Ingrese el valor de la temperatura de que deseas convertir"
		};
		
		try {
			amount = Double
					.parseDouble(JOptionPane.showInputDialog(messages[op]));
		}

		catch (NumberFormatException excep) {
			amount = -1;
			JOptionPane.showMessageDialog(null, "Valor no válido", "Message", JOptionPane.INFORMATION_MESSAGE);
		}
		
		catch (NullPointerException excep) {
			JOptionPane.showMessageDialog(null, "Gracias por utilizar el sistema.", "Message", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}

		return amount;
	}

	public static int startMenu() {
		Object[] menuOptions = { "Conversor de Moneda", "Conversor de Temperatura" };

		Object selectedValue = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menu",
				JOptionPane.PLAIN_MESSAGE, null, menuOptions, menuOptions[0]);

		double amount = -1;

		if (selectedValue == menuOptions[0]) {
			while (amount < 0) {
				amount = inputValue(amount, 0);
			}
			Currency newExchange = new Currency(amount);
			JOptionPane.showMessageDialog(null, "Tienes $" + newExchange.getResultMessage());
		} else if(selectedValue == menuOptions[1]) {
			while (amount < 0) {
				amount = inputValue(amount, 1);
			}
			Temperature newExchange = new Temperature(amount);
			JOptionPane.showMessageDialog(null, newExchange.getResultMessage());
		} else {
			JOptionPane.showMessageDialog(null, "Gracias por utilizar el sistema.", "Message", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
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
