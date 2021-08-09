package com.zss.product.service.facade;

import java.util.List;

import com.zss.product.entity.Produit;

public interface produitService {
	int createProduit(Produit produit);
	
	List<Produit> findAll();
	
	Produit findProduitById(Long id);
}
