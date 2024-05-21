package com.softtek.service;

import com.softtek.dao.request.SignUpRequest;
import com.softtek.dao.request.SignInRequest;
import com.softtek.dao.response.JwtAuthenticationResponse;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SignInRequest request);
}
