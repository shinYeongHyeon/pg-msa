package com.msapay.membership.adapter.in.web;

import common.WebAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@WebAdapter
@RestController
@RequiredArgsConstructor
public class RegisterMembershipController {
    @PostMapping(path = "/memberships")
    void registerMembership(
            @RequestBody RegisterMembershipRequest request
    ) {
        // request ~~
        // UseCase
    }
}
