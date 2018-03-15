package br.com.marcos.quantidadediasdomes;

public class QuantidadeDiasDoMes {
	byte[] mes = new byte[12];
	
	QuantidadeDiasDoMes() {
		mes[0] = 31;
		mes[1] = 28;
		mes[2] = 31;
		mes[3] = 30;
		mes[4] = 31;
		mes[5] = 30;
		mes[6] = 31;
		mes[7] = 31;
		mes[8] = 30;
		mes[9] = 31;
		mes[10] = 30;
		mes[11] = 31;
	}
	
	QuantidadeDiasDoMes(int bixeto) {
		this();
		mes[1] += bixeto;
	}
	
	int obterDiasMes(int mes) {
		return this.mes[mes - 1];
	}
}
