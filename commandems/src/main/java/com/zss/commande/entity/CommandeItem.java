package com.zss.commande.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
public class CommandeItem {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long commandeItemId;
	private double montant;
	private int quantite;
	private Long produitId;
	@JsonProperty(access = Access.WRITE_ONLY)
	@ManyToOne
	private Commande commande;
	
	public Long getCommandeItemId() {
		return commandeItemId;
	}
	public void setCommandeItemId(Long commandeItemId) {
		this.commandeItemId = commandeItemId;
	}
	
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public Long getProduitId() {
		return produitId;
	}
	public void setProduitId(Long produitId) {
		this.produitId = produitId;
	}
	public Commande getCommande() {
		return commande;
	}
	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	@Override
	public String toString() {
		return "CommandeItem [commandeItemId=" + commandeItemId + ", montant=" + montant + ", quantite=" + quantite
				+ ", produitId=" + produitId + ", commande=" + commande + "]";
	}
	
	
}
