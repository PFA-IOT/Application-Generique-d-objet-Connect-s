package Emsi.MIAGE.Entities;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="USER")
@Data
@NoArgsConstructor
@ToString
public class User implements UserDetails  {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idUser;
	@NotNull
	@Size(min=3,max=20,message="your name does not respect the following requirements [3..20]")
	private String nom;
	@NotNull
	@Size(min=3,max=20,message="your name does not respect the following requirements [3..20]")
	private String prenom;
	@NotNull
	@Pattern(regexp="(^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$\r\n)")
	private String email;
	@NotNull
	@Pattern(regexp="(^$|[0-9]{10})")
	private String tel;
	private String gender;
	private boolean enable=true;
	@NotNull
	private String username;
	@NotNull
	private String password;
	@OneToMany(mappedBy="user",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JsonIgnore
	private Set<UserRole> userRoles=new HashSet<>();
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Set<GrantedAuthority>authorities=new HashSet<>();
		userRoles.forEach(c->authorities.add(new Authority(c.getRole().getNom())));
		return authorities;
	}
	
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isEnabled() {
		return enable;
	}
	public User(
			@NotNull @Size(min = 3, max = 20, message = "your name does not respect the following requirements [3..20]") String nom,
			@NotNull @Size(min = 3, max = 20, message = "your name does not respect the following requirements [3..20]") String prenom,
			@NotNull @Pattern(regexp = "(^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$\r\n)") String email,
			@NotNull @Pattern(regexp = "(^$|[0-9]{10})") String tel, String gender, boolean enable,
			@NotNull String username, @NotNull String password, Set<UserRole> userRoles) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.tel = tel;
		this.gender = gender;
		this.enable = enable;
		this.username = username;
		this.password = password;
		this.userRoles = userRoles;
	}
	
	

}
