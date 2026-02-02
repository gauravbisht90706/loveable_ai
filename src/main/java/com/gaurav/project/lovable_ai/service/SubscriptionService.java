package com.gaurav.project.lovable_ai.service;

import com.gaurav.project.lovable_ai.dto.subscription.CheckoutRequest;
import com.gaurav.project.lovable_ai.dto.subscription.CheckoutResponse;
import com.gaurav.project.lovable_ai.dto.subscription.PortalResponse;
import com.gaurav.project.lovable_ai.dto.subscription.SubscriptionResponse;
import org.jspecify.annotations.Nullable;

public interface SubscriptionService {

    SubscriptionResponse getCurrentSubscription(Long userId);

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId);

    PortalResponse openCustomerPortal(Long userId);
}
