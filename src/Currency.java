import javax.swing.JOptionPane;

public class Currency {
	private String resultMessage;

	private Object[] currenciesOptions = { "De Pesos a Dolar", "De Pesos a Euros", "De Pesos a Libras Esterlinas",
			"De Pesos a Yen Japones", "De Pesos a Won sul-coreano", "De Dolar a Pesos", "De Euros a Pesos",
			"De Libras Esterlinas a Pesos", "De Yen Japones a Pesos", "De Won sul-coreano a Pesos", };

	public Currency(double amount) {
		Object selectedExchange = JOptionPane.showInputDialog(null,
				"Elije la moneda a la que deseas convertir tu dinero", "Monedas", JOptionPane.PLAIN_MESSAGE, null,
				this.currenciesOptions, this.currenciesOptions[0]);
		
		if(selectedExchange == null) {
			JOptionPane.showMessageDialog(null, "Gracias por utilizar el sistema.", "Message", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}

		switch (selectedExchange.toString()) {
		case "De Pesos a Dolar":
			this.resultMessage = (String.format("%.2f", amount / 379.05)) + " Dolares";
			break;

		case "De Pesos a Euros":
			this.resultMessage = (String.format("%.2f", amount / 403.65)) + " Euros";
			break;

		case "De Pesos a Libras Esterlinas":
			this.resultMessage = (String.format("%.2f", amount / 450.33)) + " Libras Esterlinas";
			break;

		case "De Pesos a Yen Japones":
			this.resultMessage = (String.format("%.2f", amount / 2.76)) + " Yen Japones";
			break;

		case "De Pesos a Won sul-coreano":
			this.resultMessage = (String.format("%.2f", amount / 0.29)) + " Won sul-coreano";
			break;

		case "De Dolar a Pesos":
			this.resultMessage = (String.format("%.2f", amount * 379.05)) + " Pesos";
			break;

		case "De Euros a Pesos":
			this.resultMessage = (String.format("%.2f", amount * 403.65)) + " Pesos";
			break;

		case "De Libras Esterlinas a Pesos":
			this.resultMessage = (String.format("%.2f", amount * 450.33)) + " Pesos";
			break;

		case "De Yen Japones a Pesos":
			this.resultMessage = (String.format("%.2f", amount * 2.76)) + " Pesos";
			break;

		case "De Won sul-coreano a Pesos":
			this.resultMessage = (String.format("%.2f", amount * 0.29)) + " Pesos";
			break;

		default:
			break;
		}
	}

	public String getResultMessage() {
		return this.resultMessage;
	}
}
