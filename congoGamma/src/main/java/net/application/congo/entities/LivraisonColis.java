package net.application.congo.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/*
@Entity
@Table(name="LivraisonColis")
@AssociationOverrides({
	@AssociationOverride( name="pk.employe",
			joinColumns=@JoinColumn(name="IdEmploye")),
	@AssociationOverride(name="pk.colis",
			joinColumns=@JoinColumn(name="idColis"))})
			
			*/
@Entity
@Table(name="LIVRAISON_COLIS")
public class LivraisonColis {
	
	private Date dateHeureLivraison;
	
	@Id
	private int idEmploye;
	@Id
	private int idColis;
	
	@ManyToOne
	@JoinColumn(name="livColis")
	private Employe employelivreur;
	
	@ManyToOne
	@JoinColumn(name="livColis")
	private Colis delivery;
	
	
	
	public LivraisonColis() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LivraisonColis(Date dateHeureLivraison) {
		super();
		this.dateHeureLivraison = dateHeureLivraison;
	}

	public Date getDateHeureLivraison() {
		return dateHeureLivraison;
	}

	public void setDateHeureLivraison(Date dateHeureLivraison) {
		this.dateHeureLivraison = dateHeureLivraison;
	}
	
	

}
