package net.application.congo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="DETAIL_COMMANDE")
public class DetailCommande implements Serializable {
	

	private int quantité;
	
	@Id
	private int idProduit;
	@Id
	private int idCommande;
	
	
	@ManyToOne
	@JoinColumn(name="detailsCommande")
	private Produit produit;
	
	@ManyToOne
	@JoinColumn(name="detailsCommande")
	private Commande commande;
	
	

	public DetailCommande() {
		
	}

	public DetailCommande(int quantité, Produit produit, Commande commande) {
		this.quantité = quantité;
		this.produit = produit;
		this.commande = commande;
	}

	public int getQuantité() {
		return quantité;
	}

	public void setQuantité(int quantité) {
		this.quantité = quantité;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	

}
