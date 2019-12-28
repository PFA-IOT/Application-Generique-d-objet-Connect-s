package emsi.miage.groupe2.eCommerce.models; /***********************************************************************
 * Module:  CarteBancaire.java
 * Author:  HP Omen
 * Purpose: Defines the Class CarteBancaire
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

/** @pdOid 09345858-e6e2-470a-a9fb-8a3fcce29693 */
@Entity
@Data
@NoArgsConstructor @AllArgsConstructor @ToString
public class CarteBancaire {
   /** @pdOid 5f7fa728-a6f4-41d9-946f-e2c7e013a6cd */
   @Id @GeneratedValue(strategy = GenerationType.AUTO)
   private Long idCarteBancaire;
   /** @pdOid b4bfbec9-2639-4eac-b765-81b6a7e97b49 */
   private String numeroCarteBancaire;
   /** @pdOid 51b9d5af-eb11-46f1-9e78-c016aa87af34 */
   private String typeCarteBancaire;
   /** @pdOid cd862ce9-5f66-4fd7-a38e-fc54472d1481 */
   private double montant;
   @OneToOne
   private Panier panier;
   @OneToOne
   private Banque banque;

}