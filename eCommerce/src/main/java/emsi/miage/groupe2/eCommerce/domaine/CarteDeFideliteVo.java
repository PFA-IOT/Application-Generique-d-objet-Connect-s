package emsi.miage.groupe2.eCommerce.domaine; /***********************************************************************
 * Module:  CarteDeFidelite.java
 * Author:  HP Omen
 * Purpose: Defines the Class CarteDeFidelite
 ***********************************************************************/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor @AllArgsConstructor @ToString
public class CarteDeFideliteVo {
   private Long idCarteFid;
   private int point;
   private PersonneVo personne;
   private PanierVo panier;

}