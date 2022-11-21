package srl.neotech.corsojava;

import java.util.ArrayList;

public class Aeroporto {
	
	
	private ArrayList<Passeggero>listaPasseggeri=new ArrayList<Passeggero>();
	private ArrayList<Passeggero>listaPasseggeriInArrivo=new ArrayList<Passeggero>();
	private ArrayList<Aereo>listaAereiInPartenza=new ArrayList<Aereo>();
	private ArrayList<Aereo>listaAereiInAvvicinamento=new ArrayList<Aereo>();
	
	final Integer RAGGIODIAZIONE=100;
		
	
	public ArrayList<Aereo> getListaAereiInPartenza() {
		return listaAereiInPartenza;
	}
	public void setListaAereiInPartenza(ArrayList<Aereo> listaAereiInPartenza) {
		this.listaAereiInPartenza = listaAereiInPartenza;
	}
	
	public ArrayList<Aereo> getListaAereiInAvvicinamento() {
		return listaAereiInAvvicinamento;
	}
	public void setListaAereiInAvvicinamento(ArrayList<Aereo> listaAereiInAvvicinamento) {
		this.listaAereiInAvvicinamento = listaAereiInAvvicinamento;
	}
	

	public ArrayList<Passeggero> getListaPasseggeri() {
		return listaPasseggeri;
	}
	public void setListaPasseggeri(ArrayList<Passeggero> listaPasseggeri) {
		this.listaPasseggeri = listaPasseggeri;
	}

	//atterraggio
	public Aereo atterraggio(Aereo a) {

			if(a.getDistanzaDallAeroporto()<=100) {
				a.setStatoAereo(StatoAereo.IN_AVVICINAMENTO);
			}
			if(a.getDistanzaDallAeroporto()<=0) {
				a.setStatoAereo(StatoAereo.ATTERRATO);				
			}				
		return a;
	}
	//decollo
	public Aereo decollo(Aereo a) {
		while(a.getDistanzaDallAeroporto()<RAGGIODIAZIONE) {
			a.setDistanzaDallAeroporto(a.getDistanzaDallAeroporto()+a.getVelocita());
			if(a.getDistanzaDallAeroporto()>=1) {
				a.setStatoAereo(StatoAereo.DECOLLATO);
			}
			if(a.getDistanzaDallAeroporto()>=100) {
				a.setStatoAereo(StatoAereo.FUORI_SPAZIO_AEREO);
			}
				System.out.println(a);
		}
		return a;
	}
	//checkin
	public Passeggero checkin(Passeggero p) {
		System.out.println("in checkin: ");
		return p;
	}
	//checkout
	public Passeggero checkout(Passeggero p) {
		System.out.println("in checkout: ");
		return p;
	}
	
	public ArrayList<Passeggero> getListaPasseggeriInArrivo() {
		return listaPasseggeriInArrivo;
	}
	public void setListaPasseggeriInArrivo(ArrayList<Passeggero> listaPasseggeriInArrivo) {
		this.listaPasseggeriInArrivo = listaPasseggeriInArrivo;
	}
}
	
