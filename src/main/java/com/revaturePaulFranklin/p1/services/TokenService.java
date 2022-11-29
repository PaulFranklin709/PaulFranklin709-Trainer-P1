package com.revaturePaulFranklin.p1.services;

import com.revaturePaulFranklin.p1.dtos.responses.Principal;
import com.revaturePaulFranklin.p1.utils.JwtConfiguration;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;

import java.util.Date;

public class TokenService {
    private final JwtConfiguration jwtConfiguration;

    public TokenService(JwtConfiguration jwtConfiguration) {
        this.jwtConfiguration = jwtConfiguration;
    }

    public String generateToken(Principal principalSubject) {
        long myTime = System.currentTimeMillis();
        JwtBuilder tokenBuilder = Jwts.builder()                                                                        // builds token
                .setId(principalSubject.getUserId())                                                                    // token id = user id
                .setIssuer("PaulFranklin719-Trainer-P1")                                                                // token issuer = project issuer
                .setIssuedAt(new Date(myTime))                                                                          // token issued time = request time
                .setExpiration(new Date(myTime + jwtConfiguration.getTokenExpiration()))                                // token expiration time = configuration expiration time
                .setSubject(principalSubject.getUsername())                                                             // token subject = username
                .claim("role", principalSubject.getRole())                                                           // token role = user role
                .signWith(jwtConfiguration.getJwtSignatureAlgorithm(), jwtConfiguration.getTokenKey());                 // signs token using configuration

        return tokenBuilder.compact();
    }
}
