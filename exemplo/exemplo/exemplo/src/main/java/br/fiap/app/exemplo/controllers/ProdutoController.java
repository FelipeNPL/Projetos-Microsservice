package br.fiap.app.exemplo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.fiap.app.exemplo.models.Produto;

@Controller
@RequestMapping("/produto") //igual pagina da web, todos metodos estaram em produto
public class ProdutoController {
	
	@GetMapping("") //padroniza requisições dos metodos get()
	public ModelAndView get() {
		ModelAndView model = new ModelAndView("produto/index"); //colocamos o arquivo que queremos mapear
		List<Produto> listaProduto = new ArrayList<>();
		
		Produto produtoUm = new Produto();
		produtoUm.setId(new Long(1));
		produtoUm.setNome("Nike Lebrom");
		
		Produto produtoDois = new Produto();
		produtoDois.setId(new Long(2));
		produtoDois.setNome("Nike do Naldo");
		
		listaProduto.add(produtoUm); 
		listaProduto.add(produtoDois);
		
		//isso seria como se esivessemos pegando dados do banco e mandando pela model 
		
		model.addObject("produtos", listaProduto); //label do objeto + conteudo
		return model;
	}
	

}
