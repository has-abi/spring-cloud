package com.zss.commande.service.facade;

import java.util.List;

import com.zss.commande.entity.Commande;
import com.zss.commande.templateVo.CommandeResponseTemplate;

public interface CommandeService {
	CommandeResponseTemplate findCommandeWithDetailsByRef(String ref);
	
	Commande findByRef(String ref);
	
	int createCommande(Commande commande);
	
	List<Commande> findAll();
}
