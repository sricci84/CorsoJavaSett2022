package srl.neotech.model;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Automobile {

	private Integer id;
	private String targa;
	private ECostruttore costruttore;
	private String modello;
	private EAlimentazione alimentazione;
	private Integer annoCostruzione;
	private EColore colore;
	private BigDecimal costo;
	private ArrayList<Accessorio> accessori=new ArrayList<Accessorio>();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTarga() {
		return targa;
	}
	public void setTarga(String targa) {
		this.targa = targa;
	}
	public ECostruttore getCostruttore() {
		return costruttore;
	}
	public void setCostruttore(ECostruttore costruttore) {
		this.costruttore = costruttore;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public EAlimentazione getAlimentazione() {
		return alimentazione;
	}
	public void setAlimentazione(EAlimentazione alimentazione) {
		this.alimentazione = alimentazione;
	}
	public Integer getAnnoCostruzione() {
		return annoCostruzione;
	}
	public void setAnnoCostruzione(Integer annoCostruzione) {
		this.annoCostruzione = annoCostruzione;
	}
	public EColore getColore() {
		return colore;
	}
	public void setColore(EColore colore) {
		this.colore = colore;
	}
	public BigDecimal getCosto() {
		return costo;
	}
	public void setCosto(BigDecimal costo) {
		this.costo = costo;
	}
	public ArrayList<Accessorio> getAccessori() {
		return accessori;
	}
	public void setAccessori(ArrayList<Accessorio> accessori) {
		this.accessori = accessori;
	}
	@Override
	public String toString() {
		return "Automobile [id=" + id + ", targa=" + targa + ", costruttore=" + costruttore + ", modello=" + modello
				+ ", alimentazione=" + alimentazione + ", annoCostruzione=" + annoCostruzione + ", colore=" + colore
				+ ", costo=" + costo + ", accessori=" + accessori + "]";
	}
	
	
	
	
}
