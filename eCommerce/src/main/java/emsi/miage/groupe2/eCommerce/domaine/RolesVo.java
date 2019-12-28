package emsi.miage.groupe2.eCommerce.domaine;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor @AllArgsConstructor @ToString
public class RolesVo {
   private Long idRole;
   private String roleName;
   private PersonneVo personne;

}