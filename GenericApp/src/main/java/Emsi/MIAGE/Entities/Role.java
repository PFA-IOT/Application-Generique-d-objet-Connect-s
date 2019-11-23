package Emsi.MIAGE.Entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="ROLE")
@Data // getter setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Role {
	@Id
	private Long idRole;
	private String nom;
	@OneToMany(mappedBy="role",fetch=FetchType.LAZY)
	private Set<UserRole> userRoles= new HashSet<>();

}
