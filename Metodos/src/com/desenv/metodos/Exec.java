package com.desenv.metodos;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Exec {

	public static void main(String[] args) {

		DecimalFormat Formato = new DecimalFormat("#,##0.00");
		// Proposta p1 = new Proposta(75.00, 7000.00, 8000.00);
		ArrayList<Proposta> prop = new ArrayList<Proposta>();

		prop.add(new Proposta(75.00, 7000.00, 8000.00));
		prop.add(new Proposta(75.00, 15000.00, 8000.00));

		AprovaPJ aprovaPJ;
		long numprop = 0;

		for (Proposta proposta : prop) {
			aprovaPJ = new AprovaPJ(proposta);
			numprop++;
			
			System.out.printf("\n%s%d\n", "Avaliacao : ", numprop);
			System.out.printf("%s%s\n", "Resultado da avaliacao: ", aprovaPJ.aprovaProp());
			System.out.printf("%s%s\n", "Valor da Prposta: ", Formato.format(proposta.getVlrProposta()));
			System.out.printf("%s%s\n", "Percentual Aprovado: ", Formato.format(proposta.getPcAprova()));
			System.out.printf("%s%s\n", "Valor Aprovado: ", Formato.format(proposta.getVlrAprova()));
			System.out.printf("%s%s\n", "Valor Maximo de Aprovacao: ", Formato.format(proposta.getVlrMaxAp()));
			
		}

	}

}
