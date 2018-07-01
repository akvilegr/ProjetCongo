package metier;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;

import dao.ICongoDao;
import net.application.congo.entities.Centre;
import net.application.congo.entities.Client;
import net.application.congo.entities.Commande;
import net.application.congo.entities.Drone;
import net.application.congo.entities.Employe;
import net.application.congo.entities.Fournisseur;
import net.application.congo.entities.Produit;


@Transactional
public class CongoMetierImpl implements ICongoMetier {

	private ICongoDao dao; 		// création du Couplage faible avec la couche DAO
	
	public void setDao(ICongoDao dao) {			// on a juste besoin d'ajouter un setter seulement, puisqu'on fait l'injection de dependances apres
		this.dao = dao;
	}

	@Override
	public Employe addEmploye(Employe e, int idCentre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employe addEmployeToCentre(int idEmploye, int idCentre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Commande addCommande(Commande cmd, int idClient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Commande consulterCommande(int idCommande) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Commande> getAllCommandes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Commande> consulterListCmdByClient(int idClient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Centre addCentre(Centre c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client addClient(Client clt) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Drone addDrone(Drone d, int idCentre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addDroneToCentre(int idDrone, int idCentre) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Fournisseur addFournisseur(Fournisseur f) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimerCommande(int idCommande) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerEmploye(int idEmploye) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerDrone(int idDrone) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employe> getAllEmployes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produit addProduitToProdStock(int idCentre, Produit prd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> detailCommande(int idCommande) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> rechercherClientsParMotCle(String motCle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> listAllClients() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client consulterClient(int idClient) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
