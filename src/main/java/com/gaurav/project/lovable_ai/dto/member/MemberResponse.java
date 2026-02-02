package com.gaurav.project.lovable_ai.dto.member;

import com.gaurav.project.lovable_ai.enums.ProjectRole;

import java.time.Instant;

public record MemberResponse(
        Long userId,
        String email,
        String name,
        String avatarUrl,
        ProjectRole role,
        Instant invitedAt
) {
}
