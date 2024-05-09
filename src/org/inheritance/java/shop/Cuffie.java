package org.inheritance.java.shop;

public class Cuffie extends Prodotto{
	
	private String colore;
	private boolean wireless;
	private boolean cablate;

	public Cuffie(int codice, String nome, String marca, float prezzo) {
		super(codice, nome, marca, prezzo);
	}
	

}
