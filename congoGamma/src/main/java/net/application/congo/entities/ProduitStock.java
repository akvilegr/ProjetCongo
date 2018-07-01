package net.application.congo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="PRODUIT_STOCK")
public class ProduitStock implements Serializable {
	
	private int quantite;
	@Id
	private int idCentre;
	@Id
	private int idProduit;
	
	@ManyToOne
	@JoinColumn(name="lesStocks")
	private Produit produitStocke; 
	
	
	@ManyToOne
	@JoinColumn(name="lesStocks")
	private Centre centreDeStock;
	
	
	public ProduitStock() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProduitStock(int quantite) {
		super();
		this.quantite = quantite;
	}

	
	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public int getIdCentre() {
		return idCentre;
	}

	public void setIdCentre(int idCentre) {
		this.idCentre = idCentre;
	}

	public int getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}
	
	
	
	

}
