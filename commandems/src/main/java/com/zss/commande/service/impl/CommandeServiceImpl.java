package com.zss.commande.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zss.commande.FeignClient.ProduitClient;
import com.zss.commande.dao.CommandeDao;
import com.zss.commande.entity.Commande;
import com.zss.commande.entity.CommandeItem;
import com.zss.commande.service.facade.CommandeItemService;
import com.zss.commande.service.facade.CommandeService;
import com.zss.commande.templateVo.CommandeItemProduitTemplate;
import com.zss.commande.templateVo.CommandeResponseTemplate;
import com.zss.commande.templateVo.ProduitVo;
import com.zss.commande.utils.CommandeUtils;

@Service
public class CommandeServiceImpl implements CommandeService{

	@Autowired
	private CommandeDao commandeDao;
	@Autowired
	private CommandeItemService commandeItemService;
	@Autowired
	private ProduitClient produitClient;

	@Override
	public CommandeResponseTemplate findCommandeWithDetailsByRef(String ref) {
		Commande foundedCommande =  commandeDao.findByRef(ref);
		return commandeToCommandeVo(foundedCommande);
	}

	@Override
	public Commande findByRef(String ref) {
		return commandeDao.findByRef(ref);
	}

	@Override
	public int createCommande(Commande commande) {
		Commande foundedCommande = findByRef(commande.getRef());
		if(foundedCommande != null) {
			return -1;
		}else {
			commande.setTotale(CommandeUtils.caluclerTotale(commande.getCommandeItems()));
			Commande savedCommande = commandeDao.save(commande);
			commandeItemService.createCommandeItems(commande.getCommandeItems(), savedCommande);
			return 1;
		}
	}

	@Override
	public List<Commande> findAll() {
		return commandeDao.findAll();
	}
	
	private CommandeResponseTemplate commandeToCommandeVo(Commande commande) {
		CommandeResponseTemplate crt = new CommandeResponseTemplate();
		crt.setCommandeId(commande.getCommandeId());
		crt.setRef(commande.getRef());
		crt.setTotale(commande.getTotale());
		List<CommandeItemProduitTemplate> commandeItemProduitTemplates = new ArrayList<>();
		
		for (CommandeItem commandeItem: commande.getCommandeItems()) {
			CommandeItemProduitTemplate cipt = new CommandeItemProduitTemplate();
			ProduitVo p = produitClient.getProduitById(commandeItem.getProduitId());
			cipt.setProduitVo(p);
			cipt.setCommandeItem(commandeItem);
			commandeItemProduitTemplates.add(cipt);
		}
		crt.setCommandeItemProduitTemplate(commandeItemProduitTemplates);
		return crt;
	}

}
