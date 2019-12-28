package emsi.miage.groupe2.eCommerce.domaine; 
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor @AllArgsConstructor @ToString
public class PersonneVo {
   private Long idUser;
   private String nom;
   private String prenom;
   private String login;
   private String password;
   private String email;
   private String tel;
   private Boolean accountNonExpired;
   private Boolean accountNonLocked;
   private Boolean credentialNonExpired;
   private Boolean enabled;
   private String pays;
   private String adresse;
   private List<ArticleVo> articles;
   private List<RolesVo> roles;
   private CarteDeFideliteVo cartedefidelite;
}