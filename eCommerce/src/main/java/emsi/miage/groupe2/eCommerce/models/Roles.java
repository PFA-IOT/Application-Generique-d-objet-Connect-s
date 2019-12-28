package emsi.miage.groupe2.eCommerce.models; /***********************************************************************
 * Module:  Roles.java
 * Author:  HP Omen
 * Purpose: Defines the Class Roles
 ***********************************************************************/

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/** @pdOid 8f3dfbbe-93bb-49d3-8314-f67fbd5b15f9 */
@Entity
@Data
@NoArgsConstructor @AllArgsConstructor @ToString
public class Roles {
   @Id @GeneratedValue(strategy = GenerationType.AUTO)
   private Long idRole;
   /** @pdOid 599ef684-d417-4345-a073-15f27eb3712f */
   private String roleName;
   @ManyToOne
   private Personne personne;

}