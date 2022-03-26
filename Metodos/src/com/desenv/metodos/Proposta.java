package com.desenv.metodos;

public class Proposta {

	private Double pcAprova;
	private Double vlrProposta;
	private Double vlrMaxAp;
	private Double vlrAprova;
	
	
	
	
	public Proposta(Double pcAprova, Double vlrProposta, Double vlrMaxAp) {
		this.pcAprova = pcAprova;
		this.vlrProposta = vlrProposta;
		this.vlrMaxAp = vlrMaxAp;
	}

	public Double getPcAprova() {
		return pcAprova;
	}
	public void setPcAprova(Double pcAprova) {
		this.pcAprova = pcAprova;
	}
	public Double getVlrProposta() {
		return vlrProposta;
	}
	public void setVlrProposta(Double vlrProposta) {
		this.vlrProposta = vlrProposta;
	}
	public Double getVlrMaxAp() {
		return vlrMaxAp;
	}
	public void setVlrMaxAp(Double vlrMaxAp) {
		this.vlrMaxAp = vlrMaxAp;
	}
	public Double getVlrAprova() {
		setVlrAprova(this.vlrAprova);
		return this.vlrAprova;
	}
	public void setVlrAprova(Double vlrAprova) {
		this.vlrAprova = this.vlrProposta * this.pcAprova/100;
	}
	
	
	
}
