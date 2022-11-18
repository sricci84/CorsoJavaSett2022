package srl.neotech.corsojava;

public class ModelloAereo extends Aereo{
	
	private String costruttore;
	private String codiceModello;
	private Integer capienzaNumPasseggeri;
	
	public String getCostruttore() {
		return costruttore;
	}
	public void setCostruttore(String costruttore) {
		this.costruttore = costruttore;
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
	
	
	public ModelloAereo(String costruttore, String codiceModello, Integer capienzaNumPasseggeri) {
		super();
		this.costruttore = costruttore;
		this.codiceModello = codiceModello;
		this.capienzaNumPasseggeri = capienzaNumPasseggeri;
		this.setModello(this);
	}
	@Override
	public String toString() {
		return super.toString()+"ModelloAereo [costruttore=" + costruttore + ", codiceModello=" + codiceModello
				+ ", capienzaNumPasseggeri=" + capienzaNumPasseggeri + "]";
	}
	
	
}
