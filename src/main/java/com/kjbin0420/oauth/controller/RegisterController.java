package com.kjbin0420.oauth.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kjbin0420
 * Oauth Controller
 */

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class RegisterController {
    @PostMapping("/register")
    public void userRegister() {

    }
}
