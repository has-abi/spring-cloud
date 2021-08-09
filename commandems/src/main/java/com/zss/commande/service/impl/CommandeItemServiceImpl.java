package com.zss.commande.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zss.commande.dao.CommandeItemDao;
import com.zss.commande.entity.Commande;
import com.zss.commande.entity.CommandeItem;
import com.zss.commande.service.facade.CommandeItemService;

@Service
public class CommandeItemServiceImpl implements CommandeItemService{

	@Autowired
	private CommandeItemDao commandeItemDao;
	
	@Override
	public List<CommandeItem> findByCommandeRef(String ref) {
		return commandeItemDao.findByCommandeRef(ref);
	}

	@Override
	public int createCommandeItems(List<CommandeItem> commandeItems, Commande commande) {
		if(commandeItems == null || commandeItems.isEmpty()) {
			return -1;
		}else {
			for (CommandeItem commandeItem : commandeItems) {
				commandeItem.setCommande(commande);
				commandeItemDao.save(commandeItem);
			}
			return 1;
		}
		
	}

	

}
