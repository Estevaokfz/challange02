package ConversorMoedas;

import javax.swing.JOptionPane;

public class ConverterParaReal {
	
	public String escolherMoeda() {
		String[] moedas = { "Dolár", "Euro", "Libras Esterlinas", "Peso Argentino", " Peso Chileno" };
		String moedaEscolhida = (String) JOptionPane.showInputDialog(null,
				"Selecione qual sera moeda para qual sera convertido o Real", "Moedas :",
				JOptionPane.QUESTION_MESSAGE, null, moedas, moedas[0]);
		
		return moedaEscolhida;
	}
	
	public double informeValor(String moedaEscolhida) {
		String valorConversor = (String) JOptionPane.showInputDialog(null,
				"Qual é o valor em " + moedaEscolhida + " que deseja converter para reais ?");
		double valorInformado = Integer.parseInt(valorConversor);
		return valorInformado;
		
	}
	
	 public void coversor(double valorInformado, String moedaEscolhida) {
		   double valorFinal;
		   String[] moedas = {"Dolár","Euro","Libras Esterlinas","Peso Argentino"," Peso Chileno"};
			 double [] valor = {(double) 5.25,(double) 5.66,(double) 6.42,(double) 0.026,(double) 0.0065};
			 for(int i = 0; i<=moedas.length;i++) {
				 if(moedaEscolhida == moedas[i]) {
				 valorFinal = valorInformado * valor[i];
				 
				JOptionPane.showMessageDialog(null, "O resultado é de : R$" +valorFinal+  " reais.");
			 }
				 
	   }
	   }

}
