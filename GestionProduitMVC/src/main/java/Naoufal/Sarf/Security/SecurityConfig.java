package Naoufal.Sarf.Security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration // pour prendre Ces COnfiguration Suivante en consideration 
@EnableWebSecurity // permet de personnaliser Notre Security et desactiver la securiter par defaut émis par Spring Security 
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	@Autowired
	private DataSource dataSource;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		BCryptPasswordEncoder bcp= getBCP();
		//System.out.println("Sarf encode : "+bcp.encode("Sarf"));
		/*
		 *  ces users Sont stocké en memoire
		 * auth.inMemoryAuthentication().withUser("Naoufal").password("{noop}0000").
		 * roles("ADMIN","USER");
		 * auth.inMemoryAuthentication().withUser("Rabie").password("{noop}1111").roles(
		 * "USER");
		 */
		
		
		/*
		 *  cette partie est encoder par le systeme de cryptage Bcrypte 
		 *  
		 * auth.inMemoryAuthentication().withUser("Naoufal").password(bcp.encode("0000")
		 * ).roles("ADMIN","USER");
		 * auth.inMemoryAuthentication().withUser("Rabie").password(bcp.encode("1111")).
		 * roles("USER");
		 * auth.inMemoryAuthentication().withUser("kaoutar").password(bcp.encode("2222")
		 * ).roles("USER");
		 * auth.inMemoryAuthentication().withUser("Yazid").password(bcp.encode("3333")).
		 * roles("USER");
		 * auth.inMemoryAuthentication().withUser("Simo").password(bcp.encode("4444")).
		 * roles("USER"); auth.inMemoryAuthentication().passwordEncoder(new
		 * BCryptPasswordEncoder());
		 */
		
	auth.jdbcAuthentication()
	.dataSource(dataSource) // data source de l
	.usersByUsernameQuery("select username as principal , password as credentials , active from users where username=?")
	.authoritiesByUsernameQuery("select username as principal , roles role from users_roles where username=?")
	.rolePrefix("ROLE_")
	.passwordEncoder(getBCP());
	


	}
	// a retenir lombok permet de generer les getter setter et les constructeur en byte code sans charger l application 
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.formLogin().loginPage("/login"); // pour specifier Notre Propre LoginPage 
		//http.authorizeRequests().anyRequest().authenticated(); // chaque Methode Necessite une Authentification Avant 
		http.authorizeRequests().antMatchers("/admin/*").hasRole("ADMIN");
		http.authorizeRequests().antMatchers("/user/*").hasRole("USER");
		http.exceptionHandling().accessDeniedPage("/403");

	}
	
	@Bean //  Pour effectuer Une injection Dans tout le projet  
	BCryptPasswordEncoder getBCP()
	{ 
		return new BCryptPasswordEncoder();
	}
	
	
	

}
