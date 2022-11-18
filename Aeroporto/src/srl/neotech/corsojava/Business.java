package srl.neotech.corsojava;

public class Business extends Passeggero{
	
	private Boolean hasGiornale=true;

	public Boolean getHasGiornale() {
		return hasGiornale;
	}

	public void setHasGiornale(Boolean hasGiornale) {
		this.hasGiornale = hasGiornale;
	}

	public Business() {
		super();
		this.setTipoPasseggero(TipoPasseggero.BUSINESS);
	}

	@Override
	public String toString() {
		return super.toString()+"Business [hasGiornale=" + hasGiornale + "]";
	}

	
	
	

}
