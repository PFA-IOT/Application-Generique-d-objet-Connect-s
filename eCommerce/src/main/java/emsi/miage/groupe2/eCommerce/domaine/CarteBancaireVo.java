package emsi.miage.groupe2.eCommerce.domaine; /***********************************************************************
 * Module:  CarteBancaire.java
 * Author:  HP Omen
 * Purpose: Defines the Class CarteBancaire
 ***********************************************************************/



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor @AllArgsConstructor @ToString
public class CarteBancaireVo {
   private Long idCarteBancaire;
   private String numeroCarteBancaire;
   private String typeCarteBancaire;
   private double montant;
   private PanierVo panier;
   private BanqueVo banque;

}