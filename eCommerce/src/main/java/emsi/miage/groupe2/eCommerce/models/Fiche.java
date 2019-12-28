package emsi.miage.groupe2.eCommerce.models; /***********************************************************************
 * Module:  Fiche.java
 * Author:  HP Omen
 * Purpose: Defines the Class Fiche
 ***********************************************************************/

import java.util.*;

/** @pdOid fe1e29da-23cd-4bd5-89d0-1f984909dcb1 */
@Entity
@Data
@NoArgsConstructor @AllArgsConstructor @ToString
public class Fiche {
   /** @pdOid b9f5f3db-8e13-4531-a4cf-ab9195d97c4f */
   @Id @GeneratedValue(strategy = GenerationType.AUTO)
   private Long idFiche;
   /** @pdOid 527ba827-cf03-476a-ac48-34a21da09603 */
   private Date datefiche;
   /** @pdOid 2261178f-0098-48b4-ad47-525e46bd8804 */
   private Byte document;
   @OneToOne
   private Personne personne;
   @OneToOne
   private Panier panier;

}