package net.application.congo.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="FOURNISSEUR")
public class Fournisseur implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idFournisseur;
	private String nomFournisseur;
	
	private Collection<ProduitFournisseur> listPrdFour;
	
	
	public Fournisseur(String nomFournisseur) {
		super();
		this.nomFournisseur = nomFournisseur;
	}
	
	
	public int getIdFournisseur() {
		return idFournisseur;
	}

	public void setIdFournisseur(int idFournisseur) {
		this.idFournisseur = idFournisseur;
	}

	public String getNomFournisseur() {
		return nomFournisseur;
	}

	public void setNomFournisseur(String nomFournisseur) {
		this.nomFournisseur = nomFournisseur;
	}

	public Fournisseur() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
