import javax.swing.JOptionPane;

public class Temperature {
	private String resultMessage;

	private Object[] temperaturesOptions = { "Grados Celcius a Grados Farenheit", "Grados Celcius a Kelvin",
			"Grados Farenheit a Grados Celcius", "Grados Farenheit a Kelvin", "Kelvin a Grados Celcius",
			"Kelvin a Grados Farenheit" };

	public Temperature(double amount) {
		Object selectedExchange = JOptionPane.showInputDialog(null,
				"Elija una opción para convertir", "Temperatura", JOptionPane.PLAIN_MESSAGE, null,
				this.temperaturesOptions, this.temperaturesOptions[0]);
		
		if(selectedExchange == null) {
			JOptionPane.showMessageDialog(null, "Gracias por utilizar el sistema.", "Message", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}

		switch (selectedExchange.toString()) {
		case "Grados Celcius a Grados Farenheit":
			this.resultMessage = String.format("%.2f", amount) + " Grados Celcius son "
					+ String.format("%.2f", ((amount * 9 / 5) + 32)) + " Grados Farenheit";
			break;

		case "Grados Celcius a Kelvin":
			this.resultMessage = String.format("%.2f", amount) + " Grados Celcius son "
					+ String.format("%.2f", (amount + 273.15)) + " Kelvin";
			break;

		case "Grados Farenheit a Grados Celcius":
			this.resultMessage = String.format("%.2f", amount) + " Grados Farenheit son "
					+ String.format("%.2f", ((amount - 32) * 5 / 9)) + " Grados Celcius";
			break;

		case "Grados Farenheit a Kelvin":
			this.resultMessage = String.format("%.2f", amount) + " Grados Farenheit son "
					+ String.format("%.2f", ((amount - 32) * 5 / 9) + 273.15) + " Kelvin";
			break;

		case "Kelvin a Grados Celcius":
			this.resultMessage = String.format("%.2f", amount) + " Kelvin son "
					+ String.format("%.2f", (amount - 273.15)) + " Grados Celcius";
			break;

		case "Kelvin a Grados Farenheit":
			this.resultMessage = String.format("%.2f", amount) + " Kelvin son "
					+ String.format("%.2f", (((amount - 273.15) * 9 / 5) + 32)) + " Grados Celcius";
			break;

		default:
			break;
		}
	}

	public String getResultMessage() {
		return this.resultMessage;
	}
}
