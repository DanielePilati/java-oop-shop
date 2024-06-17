package org.lessons.java.shop;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prodotto prodotto1 = new Prodotto("ciccio","ciaccio",22.3,12);
		Prodotto prodotto2 = new Prodotto("gino","ciaccio",30,12);
		
		System.out.println("codice " + prodotto1.getCodice());
		System.out.println("ivato " + prodotto1.prezzoComprensivoIvaNumber());
		System.out.println("base " + prodotto1.prezzoBase());
		
		System.out.println("codice " + prodotto2.getCodice());
		System.out.println("ivato " + prodotto2.prezzoComprensivoIvaNumber());
		System.out.println("base " + prodotto2.prezzoBase());
		
		System.out.println(Prodotto.padLeft(prodotto1.getCodice()));
	}

}
