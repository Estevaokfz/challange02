package ConversorTemperatura;

import javax.swing.JOptionPane;

public class ConverterDeCelsius {

	public String escolhaTemperatura() {
		String[] temperaturas = { "fahrenheit", "Kelvin" };
		String temperaturaEscolhida = (String) JOptionPane.showInputDialog(null,
				"De qual temperatura estamos falando ?", "Temperaturas :", JOptionPane.QUESTION_MESSAGE, null,
				temperaturas, temperaturas[0]);
		return temperaturaEscolhida;
	}

	public double informeValor(String temperaturaEscolhida) {
		String valorConversor = (String) JOptionPane.showInputDialog(null,
				"Qual e a quantidade em graus Celsius que deseja converter ?" + temperaturaEscolhida);
		double valorInformado = Integer.parseInt(valorConversor);
		return valorInformado;
		

	}

	public void conversor(double valorInformado, String temperaturaEscolhida) {
		double valorFinal;
		String[] temperaturas = { "fahrenheit", "Kelvin" };
		double[] valor = { (double) 1.8, (double) 273.15, };
		for (int i = 0; i <= temperaturas.length; i++) {
			if (temperaturas[0] == temperaturaEscolhida) {
				valorFinal = (valor[0] * valorInformado) + 32;
				JOptionPane.showMessageDialog(null, "o valor final é de" + valorFinal + "fahrenheit");
				break;

			} else if (temperaturas[1] == temperaturaEscolhida) {
				valorFinal = valor[1] + valorInformado;
				JOptionPane.showMessageDialog(null, "o valor final é de" + valorFinal + "Kelvin");
				break;
			}

		}

	}
}
