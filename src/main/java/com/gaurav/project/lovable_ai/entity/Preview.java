package com.gaurav.project.lovable_ai.entity;

import com.gaurav.project.lovable_ai.enums.PreviewStatus;

import java.time.Instant;

public class Preview {

    Long id;

    Project project;

    String namespace;
    String podName;
    String previewUrl;

    PreviewStatus status;

    Instant startedAt;
    Instant terminatedAt;
    Instant createdAt;

}
