package com.zss.commande.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Commande {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long commandeId;
	private String ref;
	private double totale;
	@OneToMany(mappedBy = "commande")
	private List<CommandeItem> commandeItems;
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
	public List<CommandeItem> getCommandeItems() {
		return commandeItems;
	}
	public void setCommandeItems(List<CommandeItem> commandeItems) {
		this.commandeItems = commandeItems;
	}
	@Override
	public String toString() {
		return "Commande [commandeId=" + commandeId + ", ref=" + ref + ", totale=" + totale + ", commandeItems="
				+ commandeItems + "]";
	}
	
	
}
