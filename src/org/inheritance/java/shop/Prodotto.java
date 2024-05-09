package org.inheritance.java.shop;

/*
 * Nel progetto java-inheritance-shop
Creare la classe Prodotto che gestisce i prodotti dello shop.
Un prodotto è caratterizzato da:
- codice (numero intero)
- nome
- marca
- prezzo
- iva
Usate opportunamente i livelli di accesso (public, private), 
i costruttori, X
i metodi getter e setter ed eventuali X
altri metodi di “utilità” per fare in modo che: X
- il codice prodotto sia accessibile solo in lettura X
- gli altri attributi siano accessibili sia in lettura che in scrittura X
Lo shop gestisce diversi tipi di prodotto:
- Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
- Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
- Cuffie, caratterizzate dal colore e se sono wireless o cablate
Utilizzate l’ereditarietà per riutilizzare il codice di Prodotto nella stesura delle classi che gestiscono i vari sotto tipi di prodotto.
 * 
 * 
 * */

public class Prodotto {
	
	private int codice;
	private String nome;
	private String marca;
	private float prezzo;
	private final float IVA22 = 0.22f;
	
	
	//COSTRUTTORE
	public Prodotto (int codice, String nome, String marca, float prezzo){
		
		this.codice = codice;
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
		
	}
	
    
	//METODI GETTER E SETTER 
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public float getPrezzo() {
		return prezzo;
	}


	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}


	public int getCodice() {
		return codice;
	}


	public float getIVA22() {
		return IVA22;
	}
	
	
	
	
	
	
	
	
	

}






