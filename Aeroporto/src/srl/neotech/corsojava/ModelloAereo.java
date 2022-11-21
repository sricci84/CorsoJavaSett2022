package srl.neotech.corsojava;

import java.util.Random;

public class ModelloAereo {
	
	Random r=new Random();
	
	private String costruttore;
	private String codiceModello;
	private Integer capienzaNumPasseggeri;
	
	public String getCostruttore() {
		return costruttore;
	}
	public void setCostruttore() {
		String []costruttore = {"Boeing","Airbus"};
		this.costruttore = costruttore[r.nextInt(2)];
	}
	public String getCodiceModello() {
		return codiceModello;
	}
	public void setCodiceModello(String codiceModello) {
		this.codiceModello = codiceModello;
	}
	public Integer getCapienzaNumPasseggeri() {
		return capienzaNumPasseggeri;
	}
	public void setCapienzaNumPasseggeri(Integer capienzaNumPasseggeri) {
		this.capienzaNumPasseggeri = capienzaNumPasseggeri;
	}
	
	

	@Override
	public String toString() {
		return "[costruttore=" + costruttore + ", codiceModello=" + codiceModello
				+ ", capienzaNumPasseggeri=" + capienzaNumPasseggeri + "]";
	}
	
	
}
