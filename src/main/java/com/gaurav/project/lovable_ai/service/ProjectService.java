package com.gaurav.project.lovable_ai.service;

import com.gaurav.project.lovable_ai.dto.project.ProjectRequest;
import com.gaurav.project.lovable_ai.dto.project.ProjectResponse;
import com.gaurav.project.lovable_ai.dto.project.ProjectSummaryResponse;

import java.util.List;

public interface ProjectService {

    List<ProjectSummaryResponse> getUserProjects(Long userId);

    ProjectResponse getUserProjectById(Long id, Long userId);

    ProjectResponse createProject(ProjectRequest request, Long userId);

    ProjectResponse updateProject(Long id, ProjectRequest request, Long userid);

    void softDelete(Long id, Long userid);
}
