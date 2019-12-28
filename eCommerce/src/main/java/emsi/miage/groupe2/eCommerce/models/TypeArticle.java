package emsi.miage.groupe2.eCommerce.models; /***********************************************************************
 * Module:  TypeArticle.java
 * Author:  HP Omen
 * Purpose: Defines the Class TypeArticle
 ***********************************************************************/

import java.util.*;

/** @pdOid 5e33f43a-ca6d-4947-aa57-f491f8567342 */
@Entity
@Data
@NoArgsConstructor @AllArgsConstructor @ToString
public class TypeArticle {
   /** @pdOid 601713c3-b8ab-431c-835e-6468afb2667b */
   @Id @GeneratedValue(strategy = GenerationType.AUTO)
   private Long idTypeArticle;
   /** @pdOid 7808816a-dbf2-4cc7-873f-ea8a58ab3138 */
   private String libelle;
   @OneToMany
   private List<Article> articles;

}