package com.gaurav.project.lovable_ai.entity;

import com.gaurav.project.lovable_ai.enums.ProjectRole;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProjectMember {

    // Whenever we need to have project member we need to have project and member(user). Two way mapping should be there.
    ProjectMemberId id;
    Project project;

    User user;

    ProjectRole projectRole;

    Instant invitedAt;
    Instant acceptedAt;

}
