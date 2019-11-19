package Emsi.MIAGE.Entities;

import org.springframework.security.core.GrantedAuthority;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Authority implements GrantedAuthority {
	private final String authority;
	
}