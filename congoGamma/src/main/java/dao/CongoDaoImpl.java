package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import net.application.congo.entities.Centre;
import net.application.congo.entities.Client;
import net.application.congo.entities.Commande;
import net.application.congo.entities.Drone;
import net.application.congo.entities.Employe;
import net.application.congo.entities.Fournisseur;
import net.application.congo.entities.Produit;
import net.application.congo.entities.ProduitStock;

public class CongoDaoImpl implements ICongoDao {

	@PersistenceContext					// Specifier PersistenceContext pour configurer JPA avec Spring	
	private EntityManager em;			// pour gerer la persistence, on utilise JPA --->>> Objet EntityManager 
	
	@Override
	public Employe addEmploye(Employe e) {			// Ajouter nouvel employe... A voir, quel methode garder, selon.. idCentre, idResponsable
		em.persist(e);
		return e;
	}
	
	
	@Override
	public Employe addEmploye(Employe e, int idCentre) {		// Est ce qu'on joute un idResposanble dans Classe Responsable ? 
		Centre c = em.find(Centre.class, idCentre);				// pour pouvoir ajouter dans la methode addEmploye un setResponsable ?
		e.setLeCentre(c);
		em.persist(e);
		return e;
	}

	@Override
	public Employe addEmployeToCentre(int idEmploye, int idCentre) {
		Employe e =em.find(Employe.class, idEmploye);
		Centre c = em.find(Centre.class, idCentre);
		c.getEmployes().add(e);
		em.persist(e);
		return e;
	}

	@Override
	public List<Employe> getAllEmployes() {
		Query req = em.createQuery("select e from Employe");
		return req.getResultList();
	}

	@Override
	public void supprimerEmploye(int idEmploye) {
		Employe emp = em.find(Employe.class, idEmploye);
		em.remove(emp);

	}

	@Override
	public Drone addDrone(Drone d, int idCentre) {
		Centre c = em.find(Centre.class, idCentre);
		d.setLeCentre(c);
		em.persist(d);
		return d;
	}

	@Override
	public void addDroneToCentre(int idDrone, int idCentre) {
		Drone dr = em.find(Drone.class, idDrone);
		Centre c = em.find(Centre.class, idCentre);
		c.getDrones().add(dr);
		
	}

	@Override
	public void supprimerDrone(int idDrone) {
		Drone dr = em.find(Drone.class, idDrone);
		em.remove(dr);

	}

	@Override
	public Centre addCentre(Centre c) {
		em.persist(c);
		return c;
	}

	@Override
	public Commande addCommande(Commande cmd, int idClient) {
		em.persist(cmd);
		return cmd;
	}

	@Override
	public Client addClient(Client clt) {
		em.persist(clt);
		return clt;
	}

	@Override
	public Fournisseur addFournisseur(Fournisseur f) {
		em.persist(f);
		return f;
	}

	@Override
	public Commande consulterCommande(int idCommande) {
		Commande cmd = em.find(Commande.class, idCommande);
		if (cmd == null) throw new RuntimeException("Commande Introuvable !!!");
		return cmd;
	}

	@Override
	public List<Commande> consulterListCmdByClient(int idClient) {
		Query req = em.createQuery("select c from Commande c where c.client.idClient =:x");		// Query de javax.persistence : JPA
		req.setParameter("x", idClient);
		return req.getResultList();
	}

	@Override
	public Client consulterClient(int idClient) {
		Client cl = em.find(Client.class, idClient);
		if (cl == null) throw new RuntimeException("Client Introuvable !!!");
		return cl;
	}

	@Override
	public List<Client> listAllClients() {
		Query req = em.createQuery("select c from Client");
		return req.getResultList();
	}

	@Override
	public List<Commande> getAllCommandes() {
		Query req = em.createQuery("select c from Commande");
		return req.getResultList();
	}

	@Override
	public List<Client> rechercherClientsParMotCle(String motCle) {
		Query req = em.createQuery("select c from Client c where c.nomClient like : x");
		req.setParameter("x", "%"+motCle+"%");
		return req.getResultList();
	}

	@Override
	public void supprimerCommande(int idCommande) {
		Commande cmd = em.find(Commande.class, idCommande);
		em.remove(cmd);
	}

	@Override
	public Produit addProduitToProdStock(int idCentre, Produit prd) {
		ProduitStock prdStk = em.find(ProduitStock.class, prd);
		
		//prdStk.getIdCentre().add(prd);
		return null;
	}

	@Override
	public List<Produit> detailCommande(int idCommande) {
		
		return null;
	}


}
