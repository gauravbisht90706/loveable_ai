package com.gaurav.project.lovable_ai.dto.member;

import com.gaurav.project.lovable_ai.enums.ProjectRole;

public record InviteMemberRequest(
        String email,
        ProjectRole role

) {
}
