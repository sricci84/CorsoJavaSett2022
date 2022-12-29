package srl.neotech.services;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class HomeService {

	
	public String getImmagine() {
		String urlImmagine="";
		Random rnd=new Random();
		int valore=rnd.nextInt(3);
		if(valore==0) urlImmagine="https://wallpaper-mania.com/wp-content/uploads/2018/09/High_resolution_wallpaper_background_ID_77700222901.jpg";
		if(valore==1) urlImmagine="https://wallpaper-mania.com/wp-content/uploads/2018/09/High_resolution_wallpaper_background_ID_77700222915.jpg";
		if(valore==2) urlImmagine="https://wallpaper-mania.com/wp-content/uploads/2018/09/High_resolution_wallpaper_background_ID_77700223013.jpg";
	return urlImmagine;	
	}
	
	
}
