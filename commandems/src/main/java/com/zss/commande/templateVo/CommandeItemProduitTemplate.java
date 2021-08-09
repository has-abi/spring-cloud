package com.zss.commande.templateVo;

import com.zss.commande.entity.CommandeItem;

public class CommandeItemProduitTemplate {
	private CommandeItem  commandeItem;
	private ProduitVo produitVo;
	public CommandeItem getCommandeItem() {
		return commandeItem;
	}
	public void setCommandeItem(CommandeItem commandeItem) {
		this.commandeItem = commandeItem;
	}
	public ProduitVo getProduitVo() {
		return produitVo;
	}
	public void setProduitVo(ProduitVo produitVo) {
		this.produitVo = produitVo;
	}
	
	
}
