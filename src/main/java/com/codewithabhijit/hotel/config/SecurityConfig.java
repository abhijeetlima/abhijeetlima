////
//package com.codewithabhijit.hotel.config;
////
////import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.context.annotation.Bean;
////import org.springframework.security.authentication.AuthenticationManager;
////import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
////import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
////import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
////import org.springframework.security.config.annotation.web.builders.HttpSecurity;
////import org.springframework.security.config.http.SessionCreationPolicy;
////import org.springframework.security.core.userdetails.UserDetailsService;
////import org.springframework.security.crypto.password.PasswordEncoder;
////import org.springframework.security.web.SecurityFilterChain;
////import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
////import org.springframework.stereotype.Component;
////
////import com.codewithabhijit.hotel.security.JwtAuthenticationEntryPoint;
////import com.codewithabhijit.hotel.security.JwtAuthenticationFilter;
////
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.stereotype.Component;
//
//
//
//@Component
//@EnableWebSecurity
//@EnableMethodSecurity
//public class SecurityConfig {
////
////	@Autowired
////	private UserDetailsService userDetailService;
////
////	@Autowired
////	private PasswordEncoder passwordEncoder;
////
////	@Autowired
////	private JwtAuthenticationEntryPoint point;
////
////	@Autowired
////	private JwtAuthenticationFilter filter;
////
////	@Bean
////	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
////
////		http.csrf(csrf -> csrf.disable()).cors(cors -> cors.disable())
////				.authorizeHttpRequests(auth -> auth.requestMatchers("/employee/**").hasAnyRole("ADMIN","USER")
////						  .requestMatchers("/", "/product/all", "/product/{name}","/user/save").permitAll()
////			                .and()
////			                .authorizeHttpRequests()
////			                .requestMatchers("/user/all","/product/save").authenticated()
////			                .and().formLogin()
////
////				
////		return http.build();
////	}
//////
////	@Bean
////	public DaoAuthenticationProvider doDaoAuthenticationProvider() {
////
////		DaoAuthenticationProvider Provider = new DaoAuthenticationProvider();
////		Provider.setUserDetailsService(userDetailService);
////		Provider.setPasswordEncoder(passwordEncoder);
////		return Provider;
////
////	}
////
////	@Bean
////	public AuthenticationManager authenticationManager(AuthenticationConfiguration builder) throws Exception {
////		return builder.getAuthenticationManager();
////	}
//	
////
//	
////	 @Bean /**AUTHORIZATION*/
////	    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
////	        http.csrf(csrf -> csrf.disable())
////	                .authorizeHttpRequests()
////	                .requestMatchers("/", "/product/all", "/product/{name}","/user/save").permitAll()
////	                .and()
////	                .authorizeHttpRequests()
////	                .requestMatchers("/user/all","/product/save").authenticated()
////	                .and().formLogin();
////	                
////	                return http.build();
////	    }
//    @SuppressWarnings("removal")
//	public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
//        return httpSecurity.csrf(csrf -> csrf.disable())
//                .authorizeHttpRequests()
//                .requestMatchers("/customer/", "/customer/{customerId}", "/customer/{customerId}","/customer/{customerId}","/customer/","/room/","/room/{roomId}","/room/rooms/{roomId}","/rooms/{roomId}").permitAll()
//                .and()
//                .authorizeHttpRequests()
//                .requestMatchers("/employee/","/employee/{employeeId}","/employee/{employeeId}","/employee/","/employee/{employeeId}").authenticated()
//                .and().formLogin()
//                .and().build();
//    }
//    @Bean
//    public UserDetailsService userDetailsService(){
//        return new UserInfoUserDetailsService();
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder();
//    }
//
//    @Bean
//    public AuthenticationProvider authenticationProvider(){
//        DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
//        daoAuthenticationProvider.setUserDetailsService(userDetailsService());
//        daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
//        return daoAuthenticationProvider;
//    }
//
//	
//	
//}
