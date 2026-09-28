package com.rikkei.ss15.service;

import com.rikkei.ss15.dto.request.LoginRequest;
import com.rikkei.ss15.dto.request.RegisterRequest;
import com.rikkei.ss15.dto.response.AuthResponse;
import com.rikkei.ss15.dto.response.MessageResponse;

public interface AuthService {
    MessageResponse register(RegisterRequest registerRequest);
    AuthResponse login(LoginRequest loginRequest);
}

