package hh.swd20.autoprojekti.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hh.swd20.autoprojekti.domain.Auto;

@Controller
public class AutoController {

	//palauttaa autolistauksen
	@RequestMapping(value = "/cars", method = RequestMethod.GET)
	public String getAutot(Model model) {
		//ei haeta vielä tietokannasta autoja
		List<Auto> autot = new ArrayList<Auto>(); //luodaan tyhjä lista
		autot.add(new Auto("BMW", 2020));
		autot.add(new Auto("Toyota", 1994));
		System.out.println(autot);
		//lisätään autolista model-olion mappiin avainarvolla templatea varten
		model.addAttribute("autot", autot); //1.keyword for mat 2.dataobject
	
		return "autolista"; //Palautetaan autolista.html-templaten nimi DispacherServletille
	}
}
