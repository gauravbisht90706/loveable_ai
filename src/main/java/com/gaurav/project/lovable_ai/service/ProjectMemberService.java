package com.gaurav.project.lovable_ai.service;

import com.gaurav.project.lovable_ai.dto.member.InviteMemberRequest;
import com.gaurav.project.lovable_ai.dto.member.MemberResponse;
import com.gaurav.project.lovable_ai.dto.member.UpdateMemberRoleRequest;

import java.util.List;

public interface ProjectMemberService {

    List<MemberResponse> getProjectMembersService(Long projectId, Long userId);

    MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId);

    MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateMemberRoleRequest request, Long userId);

    Void deleteProjectMember(Long projectId, Long memberId, Long userId);
}
