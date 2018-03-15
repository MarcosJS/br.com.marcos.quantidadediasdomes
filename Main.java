package br.com.marcos.quantidadediasdomes;

public class Main {
	
	public static void main(String[] args) {
		
		QuantidadeDiasDoMes calendarioSimples = new QuantidadeDiasDoMes();
		
		for(int i = 1; i <=  calendarioSimples.mes.length; i++) {
			
			System.out.println("O mês "+i+" tem "+calendarioSimples.obterDiasMes(i)+" dias");
			
		}
	}
	
}
