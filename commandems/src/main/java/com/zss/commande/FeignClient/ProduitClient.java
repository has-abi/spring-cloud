package com.zss.commande.FeignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.zss.commande.templateVo.ProduitVo;

@FeignClient("PRODUIT-SERVICE")
public interface ProduitClient {
	@GetMapping("/api/produit/id/{id}")
	public ProduitVo getProduitById(@PathVariable("id") Long produitId);
}
