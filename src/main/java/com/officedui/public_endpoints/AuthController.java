package com.officedui.public_endpoints;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    @PostMapping(value = "sign")
    public String signUser() {
        return "Login from public endpoint";
    }
    @PostMapping("/create")
    public String createUser(){
        return "createUser from public endpoint";
    }


}
