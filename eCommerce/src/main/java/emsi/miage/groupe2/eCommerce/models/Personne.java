package emsi.miage.groupe2.eCommerce.models; /***********************************************************************
 * Module:  Personne.java
 * Author:  HP Omen
 * Purpose: Defines the Class Personne
 ***********************************************************************/

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.context.support.BeanDefinitionDsl.Role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/** @pdOid 7c600bca-788d-4f34-b5ec-42bc3a6b43cc */
@Entity
@Data
@NoArgsConstructor @AllArgsConstructor @ToString
public class Personne {
   /** @pdOid 4040ff5c-6dd3-4711-8f8d-595bf0f3a7a4 */
   @Id @GeneratedValue(strategy = GenerationType.AUTO)
   private Long idUser;
   /** @pdOid dd0f6674-8cb1-4a9d-8c76-b048e87bf73e */
   @Size(min = 2,max=30,message="2 char < nom < 30 char")
   private String nom;
   /** @pdOid 1a259c46-5332-4646-a83b-fa7cb54f359a */
   @Size(min = 2,max=30,message="2 char < prenom < 30 char")
   private String prenom;
   /** @pdOid 2d1ad746-9a12-44a0-9589-53df30ea6a64 */
   @Size(min = 2,max=30,message="2 char < login < 30 char")
   private String login;
   /** @pdOid 76a657db-7abc-49ba-abdb-b286ce541d3d */
   @Pattern(regexp="(^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$\r\n)")
   private String password;
   /** @pdOid 73ddf93e-9600-4ab3-a9cd-06acc4a102cb */
   @Email
   private String email;
   /** @pdOid 222ccf63-67c8-4de4-8710-54b4bf8845f6 */
   @Pattern(regexp="(^$|[0-9]{10})")
   @Size(min=10,max=10,message="this is not a Valid Phone Number")
   private String tel;
   /** @pdOid 6a15f30c-c29f-4161-a1d5-d643587e9366 */
   private Boolean accountNonExpired;
   /** @pdOid 6ca48b85-d2b1-4474-9f72-3fb66bbfaa9b */
   private Boolean accountNonLocked;
   /** @pdOid 9d29647e-2ffb-42ac-abea-ab0c186f730c */
   private Boolean credentialNonExpired;
   /** @pdOid a482f2de-5dc1-4567-9cb5-8a97b43435c8 */
   private Boolean enabled;
   /** @pdOid 20446c9e-1ad7-41f8-bf2f-ec164efaa9be */
   private String pays;
   /** @pdOid cc026e08-9a0f-4d6d-9d67-36c136f96070 */
   @Size(min=10,max=50,message="10 char < adress < 50")
   private String adresse;
   @OneToMany(mappedBy="personne")
   private List<Article> articles;
   @OneToMany(mappedBy="personne")
   private List<Role> roles;
   @OneToOne
   private CarteDeFidelite cartedefidelite;

}