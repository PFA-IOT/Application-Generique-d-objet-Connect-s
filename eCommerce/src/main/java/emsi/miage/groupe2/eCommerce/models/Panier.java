package emsi.miage.groupe2.eCommerce.models; /***********************************************************************
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

/** @pdOid 591dbb5f-b9e1-4576-882b-b75b4bcddb0e */
@Entity
@Data
@NoArgsConstructor @AllArgsConstructor @ToString
public class Panier {
   /** @pdOid 3e729c74-6e17-4c68-9649-1ae56d85b5f5 */
   @Id @GeneratedValue(strategy = GenerationType.AUTO)
   private Long idPanier;
   /** @pdOid cb5183e2-dedb-489f-9b48-03e88d00c8de */
   private double totalPrix;
   @OneToMany
   private List<Article> articles;
   @OneToOne
   private Fiche fiche;
   @OneToOne
   private CarteBancaire cartbancaire;
   @OneToOne
   private CarteDeFidelite cartedefidelite;
   
   
   

}