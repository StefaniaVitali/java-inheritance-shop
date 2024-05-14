package org.inheritance.java.shop;

import java.util.Scanner;

public class Carrello {
	
	public static void main (String [] args) {
		
//		System.out.println("Prova");
		
		Scanner input1 = new Scanner(System.in);
		
		System.out.println("Che cosa desideri comprare oggi? \nScegli tra smartphone televisore e cuffie");
		
	    String tipoProdotto = input1.nextLine();
	    System.out.println(tipoProdotto);
		
		Prodotto p1 = null;
		
		//CON IF ELSE
		//SE IL PRODOTTO E' UNO SMARTPHONE CREA UN PRODOTTO-SMARTPHONE
//		if (tipoProdotto == "smartphone" ) {
//			p1 = new Smartphone (12564,"s23","Samsung", 140.85f, 1250485145, "8GB");
//		} else if (tipoProdotto == "televisore") {
//			
//			p1 = new Televisori(54582, "New Vision", "LG", 2500.00f, 50.00f , true);
//		} else if (tipoProdotto == "cuffie") {
//			p1 = new Cuffie(34245, "Real Sound", "Sony", 250.65f, "red", true, false);
//		} else {
//			System.out.println("Siamo Spiacenti, ma il tipo di prodotto da te scelto non è  presente nello shop");
//		}
		
		//SWITCH 
		switch (tipoProdotto) {
		case "smartphone":
			p1 = new Smartphone (12564,"s23","Samsung", 140.85f, 1250485145, "8GB");
			System.out.println(p1.toString());
			break;	
			
		case "televisore":
			p1 = new Televisori(54582, "New Vision", "LG", 2500.00f, 50.00f , true);
			System.out.println(p1.toString());
			break;
		
		case "cuffie":
			p1 = new Cuffie(34245, "Real Sound", "Sony", 250.65f, "red", true, false);
			System.out.println(p1.toString());
			break;
			default:
			  System.out.println("Siamo Spiacenti, ma il tipo di prodotto da te scelto non è  presente nello shop");	
		
		}
		
		
		
		
		input1.close();
		
		
	}

}
