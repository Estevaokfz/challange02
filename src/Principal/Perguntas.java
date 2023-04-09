package Principal;

import javax.swing.JOptionPane;

public class Perguntas {
	
	
	public static String Pergunta1() {
		String[] conversoes = { "Conversor De moedas", "Conversor De Temperatura" };

		String conversorEscolhido = (String) JOptionPane.showInputDialog(null, "Qual coversor você escolhe :",
				"Conversoes :", JOptionPane.QUESTION_MESSAGE, null, conversoes, conversoes[0]);
		return conversorEscolhido;
	}
	
	public static String escolhaConversorMoeda() {
		String[] conversoresMoedas = { "converter Para Real", "Coverter De Real" };
		String conversorMoedaEscolhido = (String) JOptionPane.showInputDialog(null,
				"Deseja fazer qual conversão de moeda :", "Conversoes :", JOptionPane.QUESTION_MESSAGE, null,
				conversoresMoedas, conversoresMoedas[0]);
		return conversorMoedaEscolhido;
	}
	
	public static String escolhaConversorTemperatura() {
		String[] conversoresTemperatura = { "Converter de graus celsius para outra temperatura",
		"Coverter de uma temperatura para Celsius" };
		String conversoreTemperaturaEscolhido = (String) JOptionPane.showInputDialog(null,
				"Deseja fazer qual conversão de Temperatura :", "Conversoes :", JOptionPane.QUESTION_MESSAGE, null,
				conversoresTemperatura, conversoresTemperatura[0]);
		
		return conversoreTemperaturaEscolhido;
	}
}
