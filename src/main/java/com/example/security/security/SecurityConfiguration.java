package com.example.security.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

/**
 * An example of explicitly configuring Spring Security with the defaults.
 *
 * @author Rob Winch
 */
@Configuration
// Indica que esta clase es una fuente de definiciones de beans para el contexto de aplicación de Spring.
@EnableWebSecurity
// Habilita la seguridad web en Spring Boot, permitiendo personalizar la configuración de seguridad.

public class SecurityConfiguration {

    @Bean
    // Anotación que indica que el método produce un bean que será gestionado por el contexto de Spring.
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        // Define un bean de tipo SecurityFilterChain para configurar la seguridad HTTP.

        http
                .authorizeHttpRequests((authorize) -> authorize
                        .anyRequest().authenticated()
                )
                // Configura las reglas de autorización para las solicitudes HTTP.
                // Aquí, se indica que cualquier solicitud (anyRequest()) necesita ser autenticada.

                .httpBasic(withDefaults())
                // Habilita la autenticación HTTP básica con la configuración por defecto.
                // Esto permite a los usuarios autenticarse usando un encabezado HTTP estándar.

                .formLogin(withDefaults());
        // Habilita el inicio de sesión basado en formularios con la configuración por defecto.
        // Esto proporciona una interfaz de usuario para el inicio de sesión.

        return http.build();
        // Construye y devuelve el SecurityFilterChain configurado.
    }

    @Bean
    // Indica que el método produce un bean que será gestionado por el contexto de Spring.
    public InMemoryUserDetailsManager userDetailsService() {
        // Define un bean para gestionar los detalles de usuario en memoria.

        UserDetails user = User.withDefaultPasswordEncoder()
                // Crea un constructor de usuario con un codificador de contraseña por defecto.
                // Nota: Este codificador es inseguro y solo debe usarse para pruebas.

                .username("user")
                // Establece el nombre de usuario del usuario.

                .password("password")
                // Establece la contraseña del usuario.

                .roles("USER")
                // Asigna el rol 'USER' al usuario.

                .build();
        // Construye el objeto UserDetails con la configuración proporcionada.

        return new InMemoryUserDetailsManager(user);
        // Crea y devuelve un gestor de detalles de usuario en memoria con el usuario definido.
    }

}
