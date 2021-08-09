package com.zss.product.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zss.product.dao.ProduitDao;
import com.zss.product.entity.Produit;
import com.zss.product.service.facade.produitService;

@Service
public class ProduitServiceImpl implements produitService{
	
	@Autowired
	private ProduitDao produitDao;

	@Override
	public int createProduit(Produit produit) {
		if(produit.getNom() == null && produit.getNom() == "" || produit.getPrix() == 0) {
			return -1;
		}else{
			produitDao.save(produit);
			return 1;
		}
	}

	@Override
	public List<Produit> findAll() {
		return produitDao.findAll();
	}

	@Override
	public Produit findProduitById(Long id) {
		return produitDao.findById(id).get();
	}

}
