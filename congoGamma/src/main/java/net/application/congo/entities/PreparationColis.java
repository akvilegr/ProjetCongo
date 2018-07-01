package net.application.congo.entities;

import java.util.Date;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/*@Entity
@Table(name="PreparationColis")
@AssociationOverrides({
	@AssociationOverride( name="pk.employe",
			joinColumns=@JoinColumn(name="IdEmploye")),
	@AssociationOverride(name="pk.colis",
			joinColumns=@JoinColumn(name="idColis"))})
			*/

@Entity
public class PreparationColis {
	
	private Date dateHeurePrep;
	
	@Id
	private int idColis;
	@Id
	private int idEmploye;
	
	
	@ManyToOne
	@JoinColumn(name="listPrep")
	private Colis deliveryPrep;
	
	
	@ManyToOne
	@JoinColumn(name="listPrep")
	private Employe empprep;
	
	
	
	

	public PreparationColis() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PreparationColis(Date dateHeurePrep) {
		super();
		this.dateHeurePrep = dateHeurePrep;
	}

	public Date getDateHeurePrep() {
		return dateHeurePrep;
	}

	public void setDateHeurePrep(Date dateHeurePrep) {
		this.dateHeurePrep = dateHeurePrep;
	}
	
	

}
