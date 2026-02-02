package com.gaurav.project.lovable_ai.dto.project;

import com.gaurav.project.lovable_ai.dto.auth.UserProfileResponse;

import java.time.Instant;

public record ProjectResponse(
        Long id,
        String name,
        Instant createdAt,
        Instant updatedAt,
        UserProfileResponse owner
) {
}
