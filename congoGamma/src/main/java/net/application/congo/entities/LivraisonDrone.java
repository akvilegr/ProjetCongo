package net.application.congo.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/*@Entity
@Table(name="LivraisonDrone")
@AssociationOverrides({
	@AssociationOverride( name="pk.colis",
			joinColumns=@JoinColumn(name="IdColis")),
	@AssociationOverride(name="pk.drone",
			joinColumns=@JoinColumn(name="idDrone"))})*/

@Entity
@Table(name="LIVRAISON_DRONE")
public class LivraisonDrone implements Serializable{
	
	private Date dateHeureDepart;
	private Date dateHeureLivraison;
	private Date dateHeureRetour;
	
	@Id
	private int idDrone;
	@Id
	private int idColis;
	
	@ManyToOne
	@JoinColumn(name="livColisDrone")
	private Colis deliveryDrone;
	
	@ManyToOne
	@JoinColumn(name="livColisDrone")
	private Drone livreurDrone;
	
	// private Colis unColis;
	
	
	public LivraisonDrone() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public LivraisonDrone(Date dateHeureDepart, Date dateHeureLivraison, Date dateHeureRetour) {
		super();
		this.dateHeureDepart = dateHeureDepart;
		this.dateHeureLivraison = dateHeureLivraison;
		this.dateHeureRetour = dateHeureRetour;
	}



	public Date getDateHeureDepart() {
		return dateHeureDepart;
	}

	public void setDateHeureDepart(Date dateHeureDepart) {
		this.dateHeureDepart = dateHeureDepart;
	}

	public Date getDateHeureLivraison() {
		return dateHeureLivraison;
	}

	public void setDateHeureLivraison(Date dateHeureLivraison) {
		this.dateHeureLivraison = dateHeureLivraison;
	}

	public Date getDateHeureRetour() {
		return dateHeureRetour;
	}

	public void setDateHeureRetour(Date dateHeureRetour) {
		this.dateHeureRetour = dateHeureRetour;
	}

	
	

}
