package net.application.congo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="DETAIL_COLIS")
public class DetailColis implements Serializable {

	
	private int quantite;
	@Id
	private int idProduit;
	@Id
	private int idColis;
	
	@ManyToOne
	@JoinColumn(name="detailsColis")
	private Produit produit;
	
	@ManyToOne
	@JoinColumn(name="detailsColis")
	private Colis colis;
	

	public DetailColis() {
		}

	public DetailColis(int quantite, Produit produit, Colis colis) {
		
		this.quantite = quantite;
		this.produit = produit;
		this.colis = colis;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public Colis getColis() {
		return colis;
	}

	public void setColis(Colis colis) {
		this.colis = colis;
	}
	
	
}
