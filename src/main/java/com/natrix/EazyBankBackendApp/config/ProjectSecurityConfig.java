package com.natrix.EazyBankBackendApp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class ProjectSecurityConfig {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        /**
         * Below is the custom security configuration
         **/
        http.authorizeHttpRequests((requests) -> requests.
                requestMatchers("/myAccount","/myBalance","/myCards","/myLoans").authenticated()
                .requestMatchers("/contact","/notices").permitAll())
                .formLogin(withDefaults())
                .httpBasic(withDefaults());
        return http.build();

        /**
         * Configuration to permit all requests
         */
       /* http.authorizeHttpRequests((requests) -> requests.
                        anyRequest().permitAll())
                .formLogin(withDefaults())
                .httpBasic(withDefaults());
        return http.build();*/

        /**
         * Configuration to deny all requests
         */
       /* http.authorizeHttpRequests((requests) -> requests.
                       anyRequest().denyAll())
                .formLogin(withDefaults())
                .httpBasic(withDefaults());
        return http.build();
        */
    }
}
