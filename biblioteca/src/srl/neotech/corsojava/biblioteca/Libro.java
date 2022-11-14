package srl.neotech.corsojava.biblioteca;

import java.util.Random;

import com.github.javafaker.Faker;

public class Libro {
	
	static Random r = new Random();
	Faker f = new Faker();
	
	private Integer idLibro;
	private String titolo;
	private String autore;
	private Integer scaffale;
	
	public Sezione getSezione() {
		return Sezione.values()[r.nextInt(Sezione.values().length)];	
	}
	
	public Integer getIdLibro() {
		return idLibro;
	}
	public void setIdLibro(Integer idLibro) {
		this.idLibro = idLibro;
	}
	
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo() {
		this.titolo = f.shakespeare().hamletQuote();
	}
	
	public String getAutore() {
		return autore;
	}
	public void setAutore() {
		
		this.autore = f.name().fullName();
	}
	
	
	public Integer getScaffale() {
		return scaffale;
	}

	public void setScaffale(Integer scaffale) {
		this.scaffale = scaffale;
	}
	
	

	@Override
	public String toString() {
		return "Libro [idLibro=" + idLibro + ", titolo=" + titolo + ", autore=" + autore + ", scaffale=" + scaffale
				+ ", sezione=" + getSezione()+"]"+"\n";
	}

}
