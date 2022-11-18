package srl.neotech.corsojava;

public class Turista extends Passeggero{
	
	private Boolean hasAnimale=true;

	public Boolean getHasAnimale() {
		return hasAnimale;
	}

	public void setHasAnimale(Boolean hasAnimale) {
		this.hasAnimale = hasAnimale;
	}
	
	public Turista() {
		super();
		this.setTipoPasseggero(TipoPasseggero.TURISTA);
	}

	@Override
	public String toString() {
		return super.toString()+"Turista [hasAnimale=" + hasAnimale + "]";
	}
	
}
