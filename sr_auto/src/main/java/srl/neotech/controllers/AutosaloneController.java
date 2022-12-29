package srl.neotech.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import srl.neotech.model.Automobile;
import srl.neotech.model.Autosalone;
import srl.neotech.model.EAlimentazione;
import srl.neotech.model.EColore;
import srl.neotech.model.ECostruttore;

@Controller
public class AutosaloneController {

	@Autowired
	Autosalone autoSalone;
	
	@GetMapping("/listAuto")
	public String getListaAuto(ModelMap modelMap) {
		
		modelMap.addAttribute("listaAuto",autoSalone.getAutomobili());
		return "listaAuto";
	}
	
	@GetMapping("/addAuto")
	public String getAddAuto(ModelMap modelMap) {
		Automobile automobile = new Automobile();
		modelMap.addAttribute("automobile", automobile);
		return "addAuto";
	}
	
	@PostMapping("/addAuto")
	public String postAuto(@ModelAttribute("automobile") Automobile automobile,ModelMap modelMap) {
		System.out.println(automobile);
		autoSalone.getAutomobili().add(automobile);
		return "redirect:listAuto";
	}
	
}
