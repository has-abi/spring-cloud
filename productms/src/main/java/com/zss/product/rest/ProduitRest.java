package com.zss.product.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zss.product.entity.Produit;
import com.zss.product.service.facade.produitService;

@RestController
@RequestMapping("/api/produit")
public class ProduitRest {
	@Autowired
	private produitService produitService;
	@GetMapping("/id/{id}")
	public Produit findProduitById(@PathVariable Long id) {
		return produitService.findProduitById(id);
	}

	@PostMapping("/")
	public int createProduit(@RequestBody Produit produit) {
		return produitService.createProduit(produit);
	}
	
	@GetMapping("/")
	public List<Produit> findAll() {
		return produitService.findAll();
	}
}
