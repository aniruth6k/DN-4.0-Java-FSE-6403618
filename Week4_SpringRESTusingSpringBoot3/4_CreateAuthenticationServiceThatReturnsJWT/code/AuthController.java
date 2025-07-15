package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.security.JwtUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;

@RestController
public class AuthController {

    private static final Logger logger = LoggerFactory.getLogger(AuthController.class);

    private final JwtUtil jwtUtil;

    public AuthController(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @RequestMapping(value = "/authenticate", method = RequestMethod.GET)
    public ResponseEntity<?> authenticate(@RequestHeader(HttpHeaders.AUTHORIZATION) String authHeader) {
        logger.info("START authenticate()");

        if (!StringUtils.hasText(authHeader) || !authHeader.startsWith("Basic ")) {
            logger.error("Missing or invalid Authorization header");
            return ResponseEntity.badRequest().body("Invalid Authorization header");
        }

        String base64Credentials = authHeader.substring("Basic ".length());
        String decoded = new String(Base64.getDecoder().decode(base64Credentials));
        String[] parts = decoded.split(":", 2);

        if (parts.length != 2) {
            logger.error("Malformed credentials");
            return ResponseEntity.badRequest().body("Malformed credentials");
        }

        String username = parts[0];
        String password = parts[1];

        logger.debug("Decoded username: {}", username);

        // Simplified: just check if user/pwd == user/pwd
        if (!"user".equals(username) || !"pwd".equals(password)) {
            logger.error("Invalid credentials");
            return ResponseEntity.status(401).body("Invalid credentials");
        }

        String token = jwtUtil.generateToken(username);
        logger.info("END authenticate()");

        return ResponseEntity.ok().body("{\"token\":\"" + token + "\"}");
    }
}
