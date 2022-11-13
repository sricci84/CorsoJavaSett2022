package srl.neotech.corsojava.biblioteca;

import java.util.ArrayList;
import java.util.Random;

import com.github.javafaker.Faker;



public class Associato {

	static Random r=new Random();
	
	Faker f=new Faker();
	
	private Integer idAssociato;
	private String nominativo;
	static ArrayList<Integer>listaIdLibriPresi = new ArrayList<Integer>();
	
	public enum Stato{ Attivo, Disattivo};
	public Stato getStato() {
		return Stato.values()[r.nextInt(Stato.values().length)];
	}
	
	public Integer getIdAssociato() {
		return idAssociato;
	}
	public void setIdAssociato(Integer idAssociato) {
		this.idAssociato = idAssociato;
	}
	public String getNominativo() {
		return nominativo;
	}
	public void setNominativo() {
		this.nominativo = f.name().fullName();
	}

	@Override
	public String toString() {
		return "Associato [idAssociato=" + idAssociato + ", nominativo=" + nominativo
				+ ", listaIdLibriPresi=" + listaIdLibriPresi + ", getStato()=" + getStato() + "]"+"\n";
	}
}
