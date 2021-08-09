package com.zss.commande.templateVo;

import java.util.List;

public class CommandeResponseTemplate {
	private Long commandeId;
	private String ref;
	private double totale;
	private List<CommandeItemProduitTemplate> commandeItemProduitTemplate;
	public Long getCommandeId() {
		return commandeId;
	}
	public void setCommandeId(Long commandeId) {
		this.commandeId = commandeId;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public double getTotale() {
		return totale;
	}
	public void setTotale(double totale) {
		this.totale = totale;
	}
	public List<CommandeItemProduitTemplate> getCommandeItemProduitTemplate() {
		return commandeItemProduitTemplate;
	}
	public void setCommandeItemProduitTemplate(List<CommandeItemProduitTemplate> commandeItemProduitTemplate) {
		this.commandeItemProduitTemplate = commandeItemProduitTemplate;
	}
	
}
