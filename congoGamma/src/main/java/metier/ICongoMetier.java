package metier;

import java.util.List;

import net.application.congo.entities.Centre;
import net.application.congo.entities.Client;
import net.application.congo.entities.Commande;
import net.application.congo.entities.Drone;
import net.application.congo.entities.Employe;
import net.application.congo.entities.Fournisseur;
import net.application.congo.entities.Produit;

public interface ICongoMetier {
	

	public Employe addEmploye(Employe e, int idCentre);
	
	public Employe addEmployeToCentre(int idEmploye, int idCentre);
	
	public Commande addCommande(Commande cmd, int idClient);
	
	public Commande consulterCommande(int idCommande);
	
	public List<Commande> getAllCommandes();
	
	public List<Commande> consulterListCmdByClient(int idClient);
	
	public Centre addCentre(Centre c);
	
	public Client addClient(Client clt);
	
	public Drone addDrone(Drone d, int idCentre);
	
	public void addDroneToCentre(int idDrone, int idCentre);
	
	public Fournisseur addFournisseur(Fournisseur f);
	
	public void supprimerCommande(int idCommande);
	
	public void supprimerEmploye(int idEmploye);		// Renommer en licencierEmploye par empSuperieur ? ===>> IDResponsable !!! ---> Couche Metier !
	
	public void supprimerDrone(int idDrone);
	
	public List<Employe> getAllEmployes();	
	
	public Produit addProduitToProdStock(int idCentre, Produit prd);		// Dans couche metier : rajouter et gerer parametre quantite ? ou ici...? Produit existant ou nouveau ?
	
	public List<Produit> detailCommande(int idCommande);
	
	public List<Client> rechercherClientsParMotCle(String motCle)	;
	
	public List<Client> listAllClients();
	
	public Client consulterClient(int idClient);
	
	//public void supprimerClient(int idClient);		Si commande en cours ?
	
	// public Employe setResponsable(int idEmploye, int idResponsable);		Ajouter idResponsable ? dans class responsable, idLivreur, etc...
	
		
		

}
