package com.zss.commande.service.facade;

import java.util.List;

import com.zss.commande.entity.Commande;
import com.zss.commande.entity.CommandeItem;

public interface CommandeItemService {
	List<CommandeItem> findByCommandeRef(String ref);

	int createCommandeItems(List<CommandeItem> commandeItems,Commande commande);
}
