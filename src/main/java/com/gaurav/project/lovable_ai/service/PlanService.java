package com.gaurav.project.lovable_ai.service;

import com.gaurav.project.lovable_ai.dto.subscription.PlanResponse;
import org.jspecify.annotations.Nullable;

public interface PlanService {
    PlanResponse getAllActivePlans();
}
