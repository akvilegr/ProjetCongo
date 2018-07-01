package net.application.congo.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="DRONE")
public class Drone implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idDrone;
	private double chargeMaxDrone;
	private double porteeMaxDrone;
	private int disponibiliteDrone;
	
	
	@ManyToOne
	@JoinColumn(name="leCentre")
	private Centre leCentre;
	//private Collection<Centre> centres;
	
	
	@OneToMany(mappedBy="livreurDrone")
	private Collection<LivraisonDrone> livColisDrone;

	public Drone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Drone(double chargeMaxDrone, double porteeMaxDrone, int disponibiliteDrone) {
		super();
		this.chargeMaxDrone = chargeMaxDrone;
		this.porteeMaxDrone = porteeMaxDrone;
		this.disponibiliteDrone = disponibiliteDrone;
	}

	public int getIdDrone() {
		return idDrone;
	}

	public void setIdDrone(int idDrone) {
		this.idDrone = idDrone;
	}

	public double getChargeMaxDrone() {
		return chargeMaxDrone;
	}

	public void setChargeMaxDrone(double chargeMaxDrone) {
		this.chargeMaxDrone = chargeMaxDrone;
	}

	public double getPorteeMaxDrone() {
		return porteeMaxDrone;
	}

	public void setPorteeMaxDrone(double porteeMaxDrone) {
		this.porteeMaxDrone = porteeMaxDrone;
	}

	public int getDisponibiliteDrone() {
		return disponibiliteDrone;
	}

	public void setDisponibiliteDrone(int disponibiliteDrone) {
		this.disponibiliteDrone = disponibiliteDrone;
	}

	public Centre getLeCentre() {
		return leCentre;
	}

	public void setLeCentre(Centre leCentre) {
		this.leCentre = leCentre;
	}
	
	/*
	public Collection<Centre> getCentres() {
		return centres;
	}

	public void setCentres(Collection<Centre> centres) {
		this.centres = centres;
	}
	
	*/
	

}
