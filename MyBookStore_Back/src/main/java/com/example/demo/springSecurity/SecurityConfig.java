//package com.example.demo.springSecurity;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.web.access.channel.ChannelProcessingFilter;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig  extends WebSecurityConfigurerAdapter {
////    @Override
////    protected void configure(HttpSecurity http) throws Exception {
////        http.addFilterBefore(new CorsFilter(), ChannelProcessingFilter.class);
////        http
////                .authorizeRequests()
////                .antMatchers("/").permitAll()
////                .antMatchers("/getCateory").permitAll()
////                .antMatchers("/Book_category").permitAll()
////                .antMatchers("/getBook/**").permitAll()
////                .antMatchers("/getBooksOfSelectedCategory/**").permitAll()
////                .antMatchers("/login").permitAll()
////                //.antMatchers("/**").permitAll()
////                .anyRequest()
////                .fullyAuthenticated()
////                .and()
////                .httpBasic()
////                .and().csrf().disable();
//////                .and()
//////                .formLogin()
//////                .loginPage("/login").failureUrl("/login-error");
////    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .antMatchers("/css/**", "/index").permitAll()
//                //.antMatchers("/Orders/**").hasRole("USER")
//                .antMatchers("/**").permitAll()
//                .and()
//                .formLogin()
//                .loginPage("/login").failureUrl("/login-error");
//    }
//
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth
//                .inMemoryAuthentication()
//                .withUser("user").password("password").roles("USER");
//    }
//}
