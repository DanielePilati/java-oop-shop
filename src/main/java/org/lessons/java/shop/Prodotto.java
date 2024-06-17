package org.lessons.java.shop;

public class Prodotto {


	private int maxCode=999999;
	private int minCode=0;
	private int codice;
	private String nome;
	private String descrizione;
	private double prezzo;
	private int iva;
	

	public Prodotto() {
		this.codice = (int) (Math.random()* (maxCode - minCode + 1)) + minCode;
	}
	
	
	public int getCodice() {
		return this.codice;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public int getIva() {
		return iva;
	}
	public void setIva(int iva) {
		this.iva = iva;
	}
	public String prezzoBase() {
		return String.valueOf(prezzo);
	}
	
}
