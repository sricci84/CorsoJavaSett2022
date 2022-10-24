package srl.neotech.corsojava.ereditarieta;

public class NonAlimentare extends Prodotto{
	
	private String materiale;

	public String getMateriale() {
		return materiale;
	}

	public void setMateriale(String materiale) {
		this.materiale = materiale;
		System.out.println(materiale);
	}
	

}
