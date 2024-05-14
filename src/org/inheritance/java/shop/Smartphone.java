package org.inheritance.java.shop;

public class Smartphone extends Prodotto{
	
	private long imeiCodex;
	private String ramGb;
	

	public Smartphone(int codice, String nome, String marca, float prezzo,long imeiCodex, String ramGb) {
		super(codice, nome, marca, prezzo);
		this.imeiCodex = imeiCodex;
		this.ramGb = ramGb;
	}
	
	public String getRamGb() {
		
		return ramGb;
	}

	public void setRamGb(String ramGb) {
		this.ramGb = ramGb;
	}

	public long getImeiCodex() {
		return imeiCodex;
	}

	public void setImeiCodex(long imeiCodex) {
		this.imeiCodex = imeiCodex;
	}
	
	@Override
	public String toString() {
		return super.toString() + " con codice IMEI n' " + this.getImeiCodex()  + " e con " + this.getRamGb(); 
		 
	}
	
}
