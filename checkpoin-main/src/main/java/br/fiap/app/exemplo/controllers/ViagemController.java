package br.fiap.app.exemplo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import br.fiap.app.exemplo.models.Categoria;
import br.fiap.app.exemplo.models.Produto;
import br.fiap.app.exemplo.models.Viagem;
import br.fiap.app.exemplo.repositories.ViagemRepository;

@RequestMapping("/viagem")
@Controller
public class ViagemController {

	@Autowired
	private ViagemRepository viagemRepository;

	@GetMapping("")
	public ModelAndView Get() {
		ModelAndView model = new ModelAndView("viagem/index");
		List<Viagem> objViagem = viagemRepository.findAll();
		model.addObject("viagens", objViagem);
		return model;
	}

	@GetMapping("/create")
	public ModelAndView Create() {
		ModelAndView model = new ModelAndView("viagem/create");
		return model;
	}

	@PostMapping("/create")
	public String Create(@ModelAttribute("viagem") Viagem objViagem) {
		viagemRepository.save(objViagem);
		return "redirect:/viagem";
	}
	

	
	@GetMapping("/categoria/{id}")
	@ResponseBody
	public List<Viagem> getViagemByList(@PathVariable("id")Integer id){
		List<Viagem> viagems = viagemRepository.findByIdViagems(id);
		return viagems;
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id")Long id) {
		viagemRepository.deleteById(id);
		return "redirect:/viagem";
	}
	
}
