package com.devteria.profile.controller;

import com.devteria.profile.dto.request.ProfileCreationRequest;
import com.devteria.profile.dto.response.UserProfileResponse;
import com.devteria.profile.service.UserProfileService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/internal")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class InternalUserProfileController {
    UserProfileService userProfileService;

    @PostMapping("/users")
    UserProfileResponse createProfile(@RequestBody ProfileCreationRequest request) {
        return userProfileService.createProfile(request);
    }

}
