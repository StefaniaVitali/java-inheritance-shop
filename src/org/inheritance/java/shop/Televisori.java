package org.inheritance.java.shop;

public class Televisori extends Prodotto{
	
	private float dimensione;
	private boolean smart;
	
	public Televisori(int codice, String nome, String marca, float prezzo,float dimensione, boolean smart) {
		super(codice, nome, marca, prezzo);
		this.dimensione = dimensione;
		this.smart = smart;
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
