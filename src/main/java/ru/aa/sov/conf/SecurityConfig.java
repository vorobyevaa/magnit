package ru.aa.sov.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
/*
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                // Разрешить доступ к странице входа без авторизации
                .antMatchers("/login", "/css/**", "/js/**").permitAll()
                // Остальные страницы требуют авторизации
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login") // указываем свою страницу входа
                .permitAll()
                .and()
                .logout()
                .permitAll();
    }

    // Можно добавить базовую аутентификацию для тестирования:
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user").password("{noop}password").roles("USER");
    }
*/
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().authorizeRequests().anyRequest().permitAll();
    }
}
