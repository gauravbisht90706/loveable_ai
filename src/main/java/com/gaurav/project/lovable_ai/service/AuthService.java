package com.gaurav.project.lovable_ai.service;

import com.gaurav.project.lovable_ai.dto.auth.AuthResponse;
import com.gaurav.project.lovable_ai.dto.auth.LoginRequest;
import com.gaurav.project.lovable_ai.dto.auth.SignupRequest;
import org.jspecify.annotations.Nullable;

public interface AuthService {

    AuthResponse signup(SignupRequest request);

    AuthResponse login(LoginRequest request);
}
