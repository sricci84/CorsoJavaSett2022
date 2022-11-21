package srl.neotech.corsojava;

import java.util.Random;

import com.github.javafaker.Faker;

public class Startup {

	public static void main(String[] args) {
		Aeroporto aeroporto = new Aeroporto();
		Random r = new Random();
		Faker faker=new Faker();
		
				//Creazione di 1000 passeggeri random 
				for (Integer i=0; i<10;i++) {
					Passeggero p=new Passeggero();
					Integer tipo=r.nextInt(3);
					if (tipo==0) p=new Business();
					else if (tipo==1) p=new Excelsior();
					else p=new Turista();
					p.setIdUnivoco(i+1);
					//maschio/femmina
					Integer mof=r.nextInt(0, 2);
					if (mof==0) {
						p.setMF('F');
						p.setHasFiore(true);}
					else if (mof==1) {
						p.setMF('M');
						p.setHasFiore(false);
					}
					p.setEta(r.nextInt(1,100));
					Integer bagaglio=r.nextInt(1, 3);
					if (bagaglio==1) p.setHasBagagli(false);
					else p.setHasBagagli(true);		
					aeroporto.getListaPasseggeri().add(p);
					System.out.println(p.toString());			
				}
				System.out.println(aeroporto.getListaPasseggeri().size());
				//creazione 300 aerei
				for (int j=0; j<10;j++) {
					Aereo a=new Aereo();
					ModelloAereo modello = new ModelloAereo();
					if (j<5) {
						//voli in partenza
						a.setIdUnivoco(j+1);
						a.setDistanzaDallAeroporto(0);
						a.setOrario(r.nextInt(1, 19)*10);
						a.setVelocita(0);
						a.setStatoAereo(StatoAereo.IN_PARTENZA);
						a.setCompagniaAerea();
						modello.setCapienzaNumPasseggeri(r.nextInt(5,15));
						modello.setCostruttore();
						modello.setCodiceModello(faker.aviation().aircraft());
						a.setModello(modello);							
						aeroporto.getListaAereiInPartenza().add(a);		
				System.out.println(a.toString());
				System.out.println();
					}
					else if (j>=5) {
						//voli in arrivo
						a.setIdUnivoco(j+1);
						a.setDistanzaDallAeroporto(r.nextInt(20,200));
						a.setOrario(r.nextInt(1, 19)*10);
						a.setVelocita(r.nextInt(1, 10));
						a.setCompagniaAerea();
						modello.setCapienzaNumPasseggeri(r.nextInt(5,10));
						modello.setCostruttore();
						modello.setCodiceModello(faker.aviation().aircraft());
						if (a.getDistanzaDallAeroporto()>100) { a.setStatoAereo(StatoAereo.FUORI_SPAZIO_AEREO);}
						else {a.setStatoAereo(StatoAereo.IN_AVVICINAMENTO);}
						a.setModello(modello);
						aeroporto.getListaAereiInAvvicinamento().add(a);
						for(int ii =0;ii<aeroporto.getListaAereiInAvvicinamento().size();ii++) {
							while(a.getDistanzaDallAeroporto()>0) {
								a.setDistanzaDallAeroporto(a.getDistanzaDallAeroporto()-a.getVelocita());
								System.out.println(aeroporto.atterraggio(a));
							}
						}
						for(int z=0;z<modello.getCapienzaNumPasseggeri();z++) {
							Passeggero p=null;
							Integer tipo=r.nextInt(3);
							if (tipo==0)p=new Business();
							else if (tipo==1) p=new Excelsior();
							else p=new Turista();			
							p.setIdUnivoco(z+1);
							
							Integer mof=r.nextInt(0, 2);
							if (mof==0) {
								p.setMF('F');
								p.setHasFiore(true);}
							else if (mof==1) {
								p.setMF('M');
								p.setHasFiore(false);
							}
							p.setEta(r.nextInt(1,100));
							Integer bagaglio=r.nextInt(1, 3);
							if (bagaglio==1) p.setHasBagagli(false);
							else p.setHasBagagli(true);
							aeroporto.getListaPasseggeriInArrivo().add(p);
							System.out.println(aeroporto.checkout(p));
						}
						System.out.println();
					}
				}
					//Far decollare ogni Aereo in arereiInPartenza finchè non siano tutti partiti e fuori dal raggio d'azione
					for(Aereo a:aeroporto.getListaAereiInPartenza()) {	
						System.out.println(a);
						for(Passeggero p:aeroporto.getListaPasseggeri()) {	
							System.out.println(aeroporto.checkin(p));		
						}					
						a.setVelocita(r.nextInt(1, 10));
						aeroporto.decollo(a);
						System.out.println();
						}
					}
				}
						

		
	
	
					
			
					
				
		
