package com.gaurav.project.lovable_ai.service;

import com.gaurav.project.lovable_ai.dto.auth.UserProfileResponse;

public interface UserService {
    UserProfileResponse getProfile(Long userId);
}
