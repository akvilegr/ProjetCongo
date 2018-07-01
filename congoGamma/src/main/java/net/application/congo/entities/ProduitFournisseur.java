package net.application.congo.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="PRODUIT_FOURNISSEUR")
public class ProduitFournisseur implements Serializable {
	
	private int quantite;
	private Date dateLivraison;
	
	@Id
	private int idFournisseur;
	@Id
	private int idProduit;
	
	@ManyToOne
	@JoinColumn(name="listPrdFour")
	private Produit product;
	
	@ManyToOne
	@JoinColumn(name="listPrdFour")
	private Fournisseur provider;
	
	public ProduitFournisseur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProduitFournisseur(int quantite, Date dateLivraison) {
		super();
		this.quantite = quantite;
		this.dateLivraison = dateLivraison;
	}
	
	
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public Date getDateLivraison() {
		return dateLivraison;
	}
	public void setDateLivraison(Date dateLivraison) {
		this.dateLivraison = dateLivraison;
	}
	public int getIdFournisseur() {
		return idFournisseur;
	}
	public void setIdFournisseur(int idFournisseur) {
		this.idFournisseur = idFournisseur;
	}
	public int getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}
	
	

}
