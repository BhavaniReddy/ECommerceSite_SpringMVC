package fr.adaming.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class LigneCommande implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "idproduit")
	private Produit produit;

	private int quantite;
	private double prix;

	// Cosntructeurs
	/**
 * 
 */
	public LigneCommande() {
		super();
	}

	/**
	 * @param quantite
	 * @param prix
	 */
	public LigneCommande(int quantite, double prix) {
		super();
		this.quantite = quantite;
		this.prix = prix;
	}

	/**
	 * @param id
	 * @param quantite
	 * @param prix
	 */
	public LigneCommande(Long id, int quantite, double prix) {
		super();
		this.id = id;
		this.quantite = quantite;
		this.prix = prix;
	}

	// Getters et Setters

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the produit
	 */
	public Produit getProduit() {
		return produit;
	}

	/**
	 * @param produit
	 *            the produit to set
	 */
	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	/**
	 * @return the quantite
	 */
	public int getQuantite() {
		return quantite;
	}

	/**
	 * @param quantite
	 *            the quantite to set
	 */
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	/**
	 * @return the prix
	 */
	public double getPrix() {
		return prix;
	}

	/**
	 * @param prix
	 *            the prix to set
	 */
	public void setPrix(double prix) {
		this.prix = prix;
	}

}