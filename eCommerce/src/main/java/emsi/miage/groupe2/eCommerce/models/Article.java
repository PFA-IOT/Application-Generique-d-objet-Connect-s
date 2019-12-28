package emsi.miage.groupe2.eCommerce.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor @ToString
public class Article {

   @Id @GeneratedValue(strategy = GenerationType.AUTO)
   private Long idArticle;
   @Size(min=5,message = "le nom d'article doit depasser 5 caractere")
   private String nomArticle;
   @NotNull(message = "ce champ est obligatoire ! ")
   private String description;

   private Byte image;
   @DecimalMin(value = "0.0", inclusive = false)
   private double prix;

   private int quantite;

   private int appreciation;
   @ManyToOne
   private Personne personne;
   @ManyToOne
   private Panier panier;

   @ManyToOne
   private TypeArticle typeArticle;

   public Article(@Size(min = 5, message = "le nom d'article doit depasser 5 caractere") String nomArticle, @NotNull(message = "ce champ est obligatoire ! ") String description, Byte image, @DecimalMin(value = "0.0", inclusive = false) double prix, int quantite, int appreciation, Personne personne, Panier panier, TypeArticle typeArticle) {
      this.nomArticle = nomArticle;
      this.description = description;
      this.image = image;
      this.prix = prix;
      this.quantite = quantite;
      this.appreciation = appreciation;
      this.personne = personne;
      this.panier = panier;
      this.typeArticle = typeArticle;
   }
}