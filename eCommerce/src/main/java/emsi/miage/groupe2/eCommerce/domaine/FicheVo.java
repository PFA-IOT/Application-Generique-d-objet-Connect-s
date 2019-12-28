package emsi.miage.groupe2.eCommerce.domaine; /***********************************************************************
 * Module:  Fiche.java
 * Author:  HP Omen
 * Purpose: Defines the Class Fiche
 ***********************************************************************/

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor @AllArgsConstructor @ToString
public class FicheVo {
   private Long idFiche;
   private Date datefiche;
   private Byte document;
   private PersonneVo personne;
   private PanierVo panier;

}