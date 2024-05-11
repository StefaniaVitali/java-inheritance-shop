package org.inheritance.java.shop;

public class Smartphone extends Prodotto{
	
	private long Imeicodex;
	private String ramGb;
	

	public Smartphone(int codice, String nome, String marca, float prezzo) {
		super(codice, nome, marca, prezzo);
	}
	
	public String getRamGb() {
		
		return ramGb;
	}

	public void setRamGb(String ramGb) {
		this.ramGb = ramGb;
	}

	public long getImeicodex() {
		return Imeicodex;
	}

	public void setImeicodex(long imeicodex) {
		Imeicodex = imeicodex;
	}
	
}
