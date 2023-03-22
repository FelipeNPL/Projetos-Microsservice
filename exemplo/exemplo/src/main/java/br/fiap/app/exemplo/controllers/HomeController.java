package br.fiap.app.exemplo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //posso mapear os metodos para que eles possam ser expostos para web(?)
public class HomeController {
	
	@RequestMapping("/") // "/" mapeia o primeiro metodo a ser acidonado ao acessar o site
	public String home(Model model) {
		model.addAttribute("mensagem", "Enviada pelo servidor"); //adicionando atributos aonde? metodo?
		model.addAttribute("nome", "Felipe Leite");
		
		return "home";
	}
}
