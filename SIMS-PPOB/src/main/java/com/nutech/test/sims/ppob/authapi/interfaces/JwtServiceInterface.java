package com.nutech.test.sims.ppob.authapi.interfaces;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;

@Configuration
public interface JwtServiceInterface {

	String extractUserName(String token);

	String generateToken(UserDetails userDetails);

	boolean isTokenValid(String token, UserDetails userDetails);
}
