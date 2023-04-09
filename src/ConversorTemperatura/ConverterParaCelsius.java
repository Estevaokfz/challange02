package ConversorTemperatura;

import javax.swing.JOptionPane;

public class ConverterParaCelsius {
	public String escolhaTemperatura() {
		String[] temperaturas = { "fahrenheit", "Kelvin" };
		String temperaturaEscolhida = (String) JOptionPane.showInputDialog(null,
				"Qual é a temperatura que deseja converter ?", "Temperaturas :", JOptionPane.QUESTION_MESSAGE, null,
				temperaturas, temperaturas[0]);
		return temperaturaEscolhida;
	}

	public double informeValor(String temperaturaEscolhida) {
		String valorConversor = (String) JOptionPane.showInputDialog(null,
				"Qual em Celsius que deseja ?" + temperaturaEscolhida);
		double valorInformado = Integer.parseInt(valorConversor);
		return valorInformado;

	}

	public void conversor(double valorInformado, String temperaturaEscolhida) {
		double valorFinal;
		String[] temperaturas = { "fahrenheit", "Kelvin" };
		double[] valor = { (double) 1.8, (double) 273.15, };
		for (int i = 0; i <= temperaturas.length; i++) {
			if (temperaturas[0] == temperaturaEscolhida) {
				valorFinal = (valorInformado - 32) / valor[0];
				JOptionPane.showMessageDialog(null, "o valor final é de" + valorFinal + "Celsius");
				break;

			} else if (temperaturas[1] == temperaturaEscolhida) {
				valorFinal = valor[1] - valorInformado;
				JOptionPane.showMessageDialog(null, "o valor final é de" + valorFinal + "Celsius");
				break;
			}
		}

	}

}
