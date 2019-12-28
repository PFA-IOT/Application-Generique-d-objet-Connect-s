package emsi.miage.groupe2.eCommerce.models; /***********************************************************************
 * Module:  Banque.java
 * Author:  HP Omen
 * Purpose: Defines the Class Banque
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

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor @ToString
public class Banque {
   /** @pdOid 1af6246c-3da7-4292-a629-742aef972ec9 */
   @Id @GeneratedValue(strategy = GenerationType.AUTO)
   private Long idCarte;
   /** @pdOid 891f9b02-553b-4361-8476-1cb23eb2df65 */
   private double solde;
   @OneToOne
   private CarteBancaire cartbancaire;

}