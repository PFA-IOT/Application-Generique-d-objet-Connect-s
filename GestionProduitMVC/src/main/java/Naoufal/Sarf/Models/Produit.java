package Naoufal.Sarf.Models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Produit implements Serializable
{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NotNull
	@Size(min=5,max=70,message="La taille doit etre entre 5 et 70 !!")
	private String designation;
	@Min(value = 18, message = "price should not be less than 18")
	private double prix;
	private int quantite;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String ddesignation) {
		designation = ddesignation;
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
	public Produit(String ddesignation, double prix, int quantite) {
		super();
		designation = ddesignation;
		this.prix = prix;
		this.quantite = quantite;
	}
	
	public Produit(Long id, String ddesignation, double prix, int quantite) {
		super();
		this.id = id;
		designation = ddesignation;
		this.prix = prix;
		this.quantite = quantite;
	}
	public Produit()
	{ 
		super();
	}

}
