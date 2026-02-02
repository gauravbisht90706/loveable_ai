package com.gaurav.project.lovable_ai.dto.project;

import java.time.Instant;

public record FileNode(
        String path,
        Instant modifiedAt,
        String type,
        Long size
) {
}
