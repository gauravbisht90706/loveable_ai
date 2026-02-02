package com.gaurav.project.lovable_ai.dto.auth;

// A record type class which is immutable. Means it's all methods and variable are private, final by default.
// We have getters in this class but it setter as it immutable. Also, we can have constructor for this class
public record AuthResponse(
        String token,
        UserProfileResponse user) {
}
