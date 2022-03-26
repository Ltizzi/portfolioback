
package com.Portfolio.Security;

import com.Portfolio.Filter.CAuthCFilter;
import com.Portfolio.Filter.CAuthZFilter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import static org.springframework.http.HttpMethod.GET;
import static org.springframework.http.HttpMethod.POST;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import static org.springframework.security.config.http.SessionCreationPolicy.STATELESS;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration @EnableWebSecurity @RequiredArgsConstructor
public class SecurityConfig extends WebSecurityConfigurerAdapter{
    
    private final UserDetailsService userDetailsService;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder);
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers(GET, "/persona/**", "/exp/**", "/edu/**", "/skill/**");
    }
    
    
 
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        
        CAuthZFilter caf = new CAuthZFilter(authenticationManagerBean());
        
        caf.setFilterProcessesUrl("/api/login");
        http.cors();
        http.csrf().disable();
        http.sessionManagement().sessionCreationPolicy(STATELESS);
        http.anonymous();
        http.authorizeHttpRequests().antMatchers(GET, "/persona/ver").permitAll();
        http.authorizeHttpRequests().antMatchers(GET, "/edu/**").permitAll();
        http.authorizeHttpRequests().antMatchers(GET, "/exp/**").permitAll();
        http.authorizeHttpRequests().antMatchers(GET, "/skill/**").permitAll();
        http.authorizeHttpRequests().antMatchers(GET, "/api/login/").permitAll();
        http.authorizeRequests().antMatchers(GET, "/api/user/**").hasAnyAuthority("ROLE_USER");
        http.authorizeRequests().antMatchers(POST, "/api/user/save/**").hasAnyAuthority("ROLE_ADMIN");
        http.authorizeRequests().anyRequest().authenticated();
        http.addFilter(caf);
        http.addFilterBefore(new CAuthCFilter(), UsernamePasswordAuthenticationFilter.class);
        
    }

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
    
    
    
    
    
}
