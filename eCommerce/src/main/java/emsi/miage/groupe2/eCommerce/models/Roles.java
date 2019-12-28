package emsi.miage.groupe2.eCommerce.models; /***********************************************************************
 * Module:  Roles.java
 * Author:  HP Omen
 * Purpose: Defines the Class Roles
 ***********************************************************************/

import java.util.*;

/** @pdOid 8f3dfbbe-93bb-49d3-8314-f67fbd5b15f9 */
@Entity
@Data
@NoArgsConstructor @AllArgsConstructor @ToString
public class Roles {
   /** @pdOid b5d11fe7-4cbd-4261-b7b2-6c89a5d0ee8f */
   @Id @GeneratedValue(strategy = GenerationType.AUTO)
   private Long idRole;
   /** @pdOid 599ef684-d417-4345-a073-15f27eb3712f */
   private String roleName;
   @ManyToOne
   private Personne personne;

}