package srl.neotech.corsojava.albero;

public class Albero {
	private int eta;
	private double altezza;
	private double diametro;
	private boolean isFruttifero;
	
	public Albero(int eta, double altezza, double diametro, boolean isFruttifero) {
		setEta(eta);
		setAltezza(altezza);
		setDiametro(diametro);
		setFruttifero(isFruttifero);
	}
	
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	public double getAltezza() {
		return altezza;
	}
	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}
	public double getDiametro() {
		return diametro;
	}
	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	public boolean isFruttifero() {
		return isFruttifero;
	}
	public void setFruttifero(boolean isFruttifero) {
		this.isFruttifero = isFruttifero;
	}
	
	public boolean isRaccoglibile() {
		if(altezza<2 && isFruttifero)
			return true;
		else return false;		
	}
	
}
