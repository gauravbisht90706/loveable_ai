package com.gaurav.project.lovable_ai.service;

import com.gaurav.project.lovable_ai.dto.subscription.PlanLimitResponse;
import com.gaurav.project.lovable_ai.dto.subscription.UsageTodayResponse;
import org.jspecify.annotations.Nullable;

public interface UsageService {
    UsageTodayResponse getTodayUsageOfUser(Long userid);

    PlanLimitResponse getCurrentSubscriptionLimitsOfUser(Long userId);
}
