package com.zss.commande.utils;

import java.util.List;

import com.zss.commande.entity.CommandeItem;

public class CommandeUtils {
	public static double caluclerTotale(List<CommandeItem> commandeItems) {
		double t = 0;
		if(commandeItems != null && !commandeItems.isEmpty()) {
			for (CommandeItem commandeItem : commandeItems) {
				t += commandeItem.getMontant()*commandeItem.getQuantite();
			}
		}
		return t;
	}
}
