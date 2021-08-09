package com.zss.commande.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zss.commande.entity.Commande;
import com.zss.commande.service.facade.CommandeService;
import com.zss.commande.templateVo.CommandeResponseTemplate;

@RestController
@RequestMapping("/api/commande")
public class CommandeRest {
	@Autowired
	private CommandeService commandeService;
	
	@GetMapping("/details/{ref}")
	public CommandeResponseTemplate findCommandeWithDetailsByRef(@PathVariable String ref) {
		return commandeService.findCommandeWithDetailsByRef(ref);
	}

	@GetMapping("/ref/{ref}")
	public Commande findByRef(@PathVariable String ref) {
		return commandeService.findByRef(ref);
	}

	@PostMapping("/")
	public int createCommande(@RequestBody Commande commande) {
		return commandeService.createCommande(commande);
	}
	
	@GetMapping("/")
	public List<Commande> findAll() {
		return commandeService.findAll();
	}
}
