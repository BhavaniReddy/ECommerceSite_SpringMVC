package fr.adaming.model;

import java.io.Serializable;
import java.util.*;

import javax.persistence.*;

@Entity
public class Commande implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idCommande;
	
	private Date dateCommande;
	
	@ManyToOne
	@JoinColumn(name = "idClient")
	private Client client;
	
	@OneToMany
	@JoinColumn(name = "idCommande")
	private Collection<LigneCommande> ligneCommandes;
	
	// Cosntructeurs
	/**
	 * 
	 */
	public Commande() {
		super();
	}
	/**
	 * @param dateCommande
	 * @param client
	 */
	public Commande(Date dateCommande) {
		super();
		this.dateCommande = dateCommande;
	}
	/**
	 * @param idCommande
	 * @param dateCommande
	 */
	public Commande(Long idCommande, Date dateCommande) {
		super();
		this.idCommande = idCommande;
		this.dateCommande = dateCommande;
	}
	

	// Getters et Setters
	/**
	 * @return the idCommande
	 */
	public Long getIdCommande() {
		return idCommande;
	}
	/**
	 * @param idCommande the idCommande to set
	 */
	public void setIdCommande(Long idCommande) {
		this.idCommande = idCommande;
	}
	/**
	 * @return the dateCommande
	 */
	public Date getDateCommande() {
		return dateCommande;
	}
	/**
	 * @param dateCommande the dateCommande to set
	 */
	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}
	/**
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}
	/**
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}
	/**
	 * @return the ligneCommandes
	 */
	public Collection<LigneCommande> getLigneCommandes() {
		return ligneCommandes;
	}
	/**
	 * @param ligneCommandes the ligneCommandes to set
	 */
	public void setLigneCommandes(Collection<LigneCommande> ligneCommandes) {
		this.ligneCommandes = ligneCommandes;
	}
	
	
	
}