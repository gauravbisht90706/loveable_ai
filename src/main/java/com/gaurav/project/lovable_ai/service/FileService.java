package com.gaurav.project.lovable_ai.service;

import com.gaurav.project.lovable_ai.dto.project.FileContentResponse;
import com.gaurav.project.lovable_ai.dto.project.FileNode;

import java.util.List;

public interface FileService {

    List<FileNode> getFileTree(Long projectId, Long userid);

    FileContentResponse getFileContent(Long projectId, Long userId);
}
