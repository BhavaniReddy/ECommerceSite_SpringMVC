package fr.adaming.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;

@Entity
public class Client implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idClient;
	
	private String nomClient;
	private String adresse;
	private String email;
	private String tel;
	
	@OneToMany(mappedBy = "client")
	private Collection<Commande> commandes;
	
	
	// Cosntructeur 
	/**
	 * 
	 */
	public Client() {

	}


	/**
	 * @param nomClient
	 * @param adresse
	 * @param email
	 * @param tel
	 */
	public Client(String nomClient, String adresse, String email, String tel) {
		super();
		this.nomClient = nomClient;
		this.adresse = adresse;
		this.email = email;
		this.tel = tel;
	}


	/**
	 * @param idClient
	 * @param nomClient
	 * @param adresse
	 * @param email
	 * @param tel
	 */
	public Client(Long idClient, String nomClient, String adresse,
			String email, String tel) {
		super();
		this.idClient = idClient;
		this.nomClient = nomClient;
		this.adresse = adresse;
		this.email = email;
		this.tel = tel;
	}


	// Getters et Setters
	/**
	 * @return the idClient
	 */
	public Long getIdClient() {
		return idClient;
	}


	/**
	 * @param idClient the idClient to set
	 */
	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}


	/**
	 * @return the nomClient
	 */
	public String getNomClient() {
		return nomClient;
	}


	/**
	 * @param nomClient the nomClient to set
	 */
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}


	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}


	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @return the tel
	 */
	public String getTel() {
		return tel;
	}


	/**
	 * @param tel the tel to set
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}


	/**
	 * @return the commandes
	 */
	public Collection<Commande> getCommandes() {
		return commandes;
	}


	/**
	 * @param commandes the commandes to set
	 */
	public void setCommandes(Collection<Commande> commandes) {
		this.commandes = commandes;
	}
	

	
	
	
	
	


	
	
	
}