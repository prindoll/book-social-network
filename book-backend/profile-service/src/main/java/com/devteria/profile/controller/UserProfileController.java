package com.devteria.profile.controller;

import com.devteria.profile.dto.request.UserProfileCreationRequest;
import com.devteria.profile.dto.response.UserProfileResponse;
import com.devteria.profile.repository.UserProfileRepository;
import com.devteria.profile.service.UserProfileService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserProfileController {
    UserProfileService userProfileService;

    @PostMapping()
    ResponseEntity<UserProfileResponse> createUserProfile(@RequestBody UserProfileCreationRequest request) {
        return ResponseEntity.ok(userProfileService.createUserProfile(request));
    }

    @GetMapping("/{userId}")
    ResponseEntity<UserProfileResponse> getUserProfile(@PathVariable String userId) {
        return ResponseEntity.ok(userProfileService.getUserProfile(userId));
    }
}
