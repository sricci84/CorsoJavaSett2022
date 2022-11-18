package srl.neotech.corsojava;

public class Excelsior extends Passeggero{
	
	private Boolean hasChampagne=true;

	public Boolean getHasChampagne() {
		return hasChampagne;
	}

	public void setHasChampagne(Boolean hasChampagne) {
		this.hasChampagne = hasChampagne;
	}
	
	public Excelsior() {
		super();
		this.setTipoPasseggero(TipoPasseggero.EXCELSIOR);
	}

	@Override
	public String toString() {
		return super.toString()+"Excelsior [hasChampagne=" + hasChampagne + "]";
	}
	
	
}
