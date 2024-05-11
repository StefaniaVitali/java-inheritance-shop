package org.inheritance.java.shop;

public class Cuffie extends Prodotto{
	
	private String colore;
	private boolean wireless;
	private boolean cablate;

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public boolean isWireless() {
		return wireless;
	}

	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}

	public boolean isCablate() {
		return cablate;
	}

	public void setCablate(boolean cablate) {
		this.cablate = cablate;
	}

	public Cuffie(int codice, String nome, String marca, float prezzo) {
		super(codice, nome, marca, prezzo);
	}
	

}
