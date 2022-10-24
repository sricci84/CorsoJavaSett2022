package srl.neotech.corsojava.ereditarieta;

public class Prodotto {
	
	private String codiceBarre;
	private String descrizione;
	private double prezzoUnitario;
	public String getCodiceBarre() {
		return codiceBarre;
	}
	public void setCodiceBarre(String codiceBarre) {
		this.codiceBarre = codiceBarre;
		System.out.println(codiceBarre);
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
		System.out.println(descrizione);

	}
	public double getPrezzoUnitario() {
		return prezzoUnitario;
	}
	public void setPrezzoUnitario(double prezzoUnitario) {
		this.prezzoUnitario = prezzoUnitario;
		double sconto=applicaSconto(prezzoUnitario);
		System.out.println(prezzoUnitario+" prezzo scontato: "+sconto);

	}
	
	public double applicaSconto(double prezzo) {
		double prezzoScontato;
		prezzoScontato=prezzo-((prezzo/100)*5);
		return prezzoScontato;
	}

}
