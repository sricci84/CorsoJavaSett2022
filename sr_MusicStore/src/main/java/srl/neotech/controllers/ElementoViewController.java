package srl.neotech.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import srl.neotech.model.Elemento;
import srl.neotech.services.ElementoService;

@Controller
public class ElementoViewController {

    @Autowired
    ElementoService elementoService;

    //Rotta per la getListMusic
    @RequestMapping(value="/listmusic", method = RequestMethod.GET)
    public String getListMusic() {
        return "getListMusic";
    }
    
    
    //Rotta per la getCount
    @RequestMapping(value="/musicdetail", method = RequestMethod.GET)
    public String getMusicDetail() {
        return "getMusicDetail";
    }


	//Rotta per la insertData
	@RequestMapping(value="/insertData", method = RequestMethod.GET)
	public String insertData() {
	    return "insert";
	}

	//Rotta per la insertData
		@RequestMapping(value="/getDetail/{id}", method = RequestMethod.GET)
		public String getDetail(@PathVariable("id") Integer id, ModelMap map) {
			Elemento elem=elementoService.getElemento(id);
			map.addAttribute("elemento", elem);
		    return "getDetail";
		}


}
