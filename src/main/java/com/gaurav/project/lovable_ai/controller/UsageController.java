package com.gaurav.project.lovable_ai.controller;

import com.gaurav.project.lovable_ai.dto.subscription.PlanLimitResponse;
import com.gaurav.project.lovable_ai.dto.subscription.UsageTodayResponse;
import com.gaurav.project.lovable_ai.service.UsageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usage")
public class UsageController {

    private final UsageService usageService;

    public UsageController(UsageService usageService){
        this.usageService = usageService;
    }

    @GetMapping("/today")
    public ResponseEntity<UsageTodayResponse> getTodayUsage(){
        Long userid = 1L;
        return ResponseEntity.ok(usageService.getTodayUsageOfUser(userid));
    }

    @GetMapping("/limits")
    public ResponseEntity<PlanLimitResponse> getPlanLimit(){
        Long userId = 1L;
        return ResponseEntity.ok(usageService.getCurrentSubscriptionLimitsOfUser(userId));

    }
}
