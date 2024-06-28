package com.pmo.gatewayservice.config.auth;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.ReactiveAuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;


@Slf4j
@Component
@AllArgsConstructor
public class AuthenticationManager implements ReactiveAuthenticationManager {


    @Override
    public Mono<Authentication> authenticate(Authentication authentication) {
        return null;
    }
}
