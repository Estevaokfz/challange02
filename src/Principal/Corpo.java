package Principal;

import ConversorMoedas.ConverterParaReal;
import ConversorMoedas.ConverterDeReal;
import ConversorTemperatura.ConverterDeCelsius;
import ConversorTemperatura.ConverterParaCelsius;

public class Corpo {

	public static void main(String[] args) {
		int repet = 0;
		do {
	
		ConverterParaReal ConverterParaReal = new ConverterParaReal();
		ConverterDeReal ConverterDeReal = new ConverterDeReal();
		ConverterParaCelsius ConverterParaCelsius = new ConverterParaCelsius();
		ConverterDeCelsius ConverterDeCelsius = new ConverterDeCelsius();
		
		String respostaPergunta1 = Perguntas.Pergunta1();

		if (respostaPergunta1 == "Conversor De moedas") {
			String conversorMoedaEscolhido = Perguntas.escolhaConversorMoeda();
			if (conversorMoedaEscolhido == "Converter Para Real") {
				String moedaEscolhida = ConverterParaReal.escolherMoeda();
				double valorInformado = ConverterParaReal.informeValor(moedaEscolhida);
				ConverterParaReal.coversor(valorInformado, moedaEscolhida);

			} else {
				double valorInformado = ConverterDeReal.informeValor();
				ConverterDeReal.coversor(valorInformado);
			}

		} else {
			String ConversorTemperaturaEscolhido = Perguntas.escolhaConversorTemperatura();
			if (ConversorTemperaturaEscolhido == "Converter de graus celsius para outra temperatura") { 
				String temperaturaEscolhida = ConverterDeCelsius.escolhaTemperatura();
				double valorIformado = ConverterDeCelsius.informeValor(temperaturaEscolhida);
				ConverterDeCelsius.conversor(valorIformado, temperaturaEscolhida);
			} else {
				String temperaturaEscolhida = ConverterDeCelsius.escolhaTemperatura();
				double valorIformado = ConverterDeCelsius.informeValor(temperaturaEscolhida);
				ConverterParaCelsius.conversor(valorIformado, temperaturaEscolhida);

			}
		}
		}while(repet <=9999);
	}
		
	}

