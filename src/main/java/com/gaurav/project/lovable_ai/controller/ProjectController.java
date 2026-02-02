package com.gaurav.project.lovable_ai.controller;

import com.gaurav.project.lovable_ai.dto.project.ProjectRequest;
import com.gaurav.project.lovable_ai.dto.project.ProjectResponse;
import com.gaurav.project.lovable_ai.dto.project.ProjectSummaryResponse;
import com.gaurav.project.lovable_ai.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
@RequiredArgsConstructor
public class ProjectController {

    private final ProjectService projectService;

    public ProjectController(ProjectService projectService){
        this.projectService = projectService;
    }

    @GetMapping()
    public ResponseEntity<List<ProjectSummaryResponse>> getMyProjects(){
        Long userId = 1L; // TODO: update later with spring security
        return ResponseEntity.ok(projectService.getUserProjects(userId));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProjectResponse> getProjectById(@PathVariable Long id){
        Long userId = 1L;
        return ResponseEntity.ok(projectService.getUserProjectById(id, userId));
    }

    @PostMapping
    public ResponseEntity<ProjectResponse> createProject(@RequestBody ProjectRequest request){
        Long userId = 1L;
        return ResponseEntity.status(HttpStatus.CREATED).body(projectService.createProject(request, userId));
    }

    @PatchMapping("/{id")
    public ResponseEntity<ProjectResponse> updateProject(@PathVariable Long id, @RequestBody ProjectRequest request){
        Long userid = 1L;
        return ResponseEntity.ok(projectService.updateProject(id, request, userid));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProject(@PathVariable Long id){
        Long userid = 1L;
        projectService.softDelete(id, userid);
        return ResponseEntity.noContent().build();
    }
}
