package com.example.demo.Security.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class BasicConfiguration {
    
	
	/*@Bean
    public SecurityFilterChain security(HttpSecurity http) throws Exception {
    	 
	        http.authorizeHttpRequests( (req) -> req
	        		.requestMatchers("/contact")
	        		.permitAll()
			        .anyRequest()
			        .authenticated())
	        .httpBasic(Customizer.withDefaults())
	        .formLogin(Customizer.withDefaults());
		
	      return http.build();
		 
	 }*/
	
	@Bean
	public SecurityFilterChain security(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests (req->
		req.requestMatchers("/contact")
		.permitAll()
		.anyRequest()
		.authenticated()
		)
		.httpBasic(Customizer.withDefaults())
		.formLogin(Customizer.withDefaults());
		
		return http.build();
		}
	@Bean
	public InMemoryUserDetailsManager userdetails() {
		UserDetails u1=User.withDefaultPasswordEncoder()
				        .username("siri")
				        .password("43454")
				        .build();
	
		UserDetails u2=User.withDefaultPasswordEncoder()
					        .username("mani")
					        .password("4667464")
					        .build();
		
			UserDetails u3=User.withDefaultPasswordEncoder()
					        .username("anu")
					        .password("mani")
					        .build();
			return new InMemoryUserDetailsManager(u1,u2,u3);
	}
}
	

		
