package org.lessons.java.shop;

public class Prodotto {

	private static final int PAD_LENGHT = 8;
	private int maxCode=999999;
	private int minCode=0;
	private int codice;
	private String nome;
	private String descrizione;
	private double prezzo;
	private double iva;
	

	public Prodotto() {
		this.codice = (int) (Math.random()* (maxCode - minCode + 1)) + minCode;
	}
	public Prodotto(String nome, String descrizione , double prezzo, double iva) {
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.iva = iva;
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
	public double getIva() {
		return iva;
	}
	public void setIva(int iva) {
		this.iva = iva;
	}
	public String prezzoBase() {
		return String.valueOf(prezzo);
	}
	public double prezzoComprensivoIvaNumber() {
		return this.prezzo + this.iva;
	}
	public String prezzoComprensivoIvaText() {
		return String.valueOf(this.prezzo + this.iva);
	}
	public String descrizioneMatricola() {
		return "Prodotto: "+codice+"-"+nome;
	}
    public static String padLeft(int code) {  
    	return String.format("%0"+PAD_LENGHT+"d",code);
    }  
}
