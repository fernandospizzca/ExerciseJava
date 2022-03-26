package com.desenv.metodos;

public class AprovaPJ {
	
	private Proposta proposta;
	
	
	
	public AprovaPJ(Proposta proposta) {
		this.proposta = proposta;
	}


	public String aprovaProp() {
		if(this.proposta.getPcAprova() >= 50  && this.proposta.getVlrAprova() <= this.proposta.getVlrMaxAp()) {
			return "AP";
		}
		else {
			return "NE";
		}
	}
	
	
	public Proposta getProposta() {
		return proposta;
	}

	public void setProposta(Proposta proposta) {
		this.proposta = proposta;
	}

}
