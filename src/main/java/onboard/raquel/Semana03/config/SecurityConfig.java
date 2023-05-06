package onboard.raquel.Semana03.config;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import onboard.raquel.Semana03.service.OnboardUserDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
@Log4j2
@EnableMethodSecurity (prePostEnabled = true)
@RequiredArgsConstructor
public class SecurityConfig {
    private final OnboardUserDetailsService onboardUserDetailsService;

    /*
    BasicAuthenticationFilter - basic 64
    UsernamePasswordAuthenticationFilter
    DefaultLoginPageGeneratingFilter
    DefaultLogoutPageGeneratingFilter
    FilterSecurityInterceptor
    Authentication -> Authorization - limitação de acesso
     */

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http
                .csrf().disable()
                //.csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse()).and()
                .authorizeHttpRequests((authz) -> authz
                        .anyRequest().authenticated()
                )
                .httpBasic(withDefaults());
        return http.build();
    }

    @Bean
    public InMemoryUserDetailsManager userDetailsService() throws Exception{
        PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        log.info("Password encoded {}", passwordEncoder.encode("4321"));
        UserDetails user = User.withUsername("raquel")
                .password(passwordEncoder.encode("4321"))
                .roles("USER")
                .build();

        UserDetails admin = User.withUsername("yukie")
                .password(passwordEncoder.encode("4321"))
                .roles("ADMIN")
                .build();
        return new InMemoryUserDetailsManager(user, admin);

        //auth.userDetailsService(onboardUserDetailsService).passwordEncoder(passwordEncoder);
    }
}
