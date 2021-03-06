package emsi.miage.groupe2.eCommerce.models; /***********************************************************************
 * Module:  CarteDeFidelite.java
 * Author:  HP Omen
 * Purpose: Defines the Class CarteDeFidelite
 ***********************************************************************/

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/** @pdOid 3f3bffee-0cae-4e50-bf80-0632a1f2fa06 */
@Entity
@Data
@NoArgsConstructor @AllArgsConstructor @ToString
public class CarteDeFidelite {
   /** @pdOid 93227926-e922-442f-b00d-2411f4171bdb */
   @Id @GeneratedValue(strategy = GenerationType.AUTO)
   private Long idCarteFid;
   /** @pdOid d1a807fe-0bb7-4b13-bb6c-8325e0da818c */
   
   private int point;
   
   @OneToOne
   private Personne personne;
   @OneToOne
   private Panier panier;

}