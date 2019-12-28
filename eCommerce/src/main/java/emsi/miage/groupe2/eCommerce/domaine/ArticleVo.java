package emsi.miage.groupe2.eCommerce.domaine;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor @AllArgsConstructor @ToString
public class ArticleVo {

   private Long idArticle;
   private String nomArticle;
   private String description;

   private Byte image;
   private double prix;

   private int quantite;

   private int appreciation;
   private PersonneVo personne;
   private PanierVo panier;

   private TypeArticleVo typeArticle;

public ArticleVo(String nomArticle, String description, Byte image, double prix, int quantite, int appreciation,
		PersonneVo personne, PanierVo panier, TypeArticleVo typeArticle) {
	super();
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