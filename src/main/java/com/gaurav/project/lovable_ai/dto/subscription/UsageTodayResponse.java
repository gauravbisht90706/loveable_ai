package com.gaurav.project.lovable_ai.dto.subscription;

public record UsageTodayResponse(
        int tokensUsed,
        int tokensLimit,
        int previewRunning,
        int previewLimit
) {
}
