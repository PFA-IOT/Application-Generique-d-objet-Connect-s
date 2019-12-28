package emsi.miage.groupe2.eCommerce.domaine; /***********************************************************************
 * Module:  Panier.java
 * Author:  HP Omen
 * Purpose: Defines the Class Panier
 ***********************************************************************/

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor @AllArgsConstructor @ToString
public class PanierVo {
   private Long idPanier;
   private double totalPrix;
   private List<ArticleVo> articles;
   private FicheVo fiche;
   private CarteBancaireVo cartbancaire;
   private CarteDeFideliteVo cartedefidelite;
   
   
   

}