package fr.adaming.model;

import java.io.Serializable;

import javax.persistence.*;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Produit implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProduit;
	
	@NotEmpty
	private String designation;
	private double prix;
	private int quantite;
	
	@ManyToOne
	@JoinColumn(name = "ID_CAT")
	private Categorie categorie;
	
	
	// Cosntructeur
	/**
	 * Constructeur vide
	 */
	public Produit() {
		super();
	}


	/**
	 * @param designation
	 * @param prix
	 * @param quantite
	 */
	public Produit(String designation, double prix, int quantite) {
		super();
		this.designation = designation;
		this.prix = prix;
		this.quantite = quantite;
	}


	/**
	 * @param idProduit
	 * @param designation
	 * @param prix
	 * @param quantite
	 */
	public Produit(Long idProduit, String designation, double prix, int quantite) {
		super();
		this.idProduit = idProduit;
		this.designation = designation;
		this.prix = prix;
		this.quantite = quantite;
	}

	// Getters et Setters
	public Long getIdProduit() {
		return idProduit;
	}


	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public double getPrix() {
		return prix;
	}


	public void setPrix(double prix) {
		this.prix = prix;
	}


	public int getQuantite() {
		return quantite;
	}


	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}


	public Categorie getCategorie() {
		return categorie;
	}


	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}


	
	
}
