package org.inheritance.java.shop;

public class Televisori extends Prodotto{
	
	private float dimensione;
	private boolean smart;
	
	public Televisori(int codice, String nome, String marca, float prezzo) {
		super(codice, nome, marca, prezzo);
	
	}

	public float getDimensione() {
		return dimensione;
	}

	public void setDimensione(float dimensione) {
		this.dimensione = dimensione;
	}

	public boolean isSmart() {
		return smart;
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
	}

}
