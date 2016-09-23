package fr.adaming.service;

import fr.adaming.model.Produit;

public interface IAdminProduitMetier extends InternauteBoutiqueMetier {
	public Long ajouterProduit(Produit p, Long idCat);
	public void supprimerProduit(Long idP);
	public void modifierProduit(Produit p);
}
