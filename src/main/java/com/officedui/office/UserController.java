package com.officedui.office;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody Map<String, String> payload) {
        System.out.println(payload + "payload");
        return new ResponseEntity<User>(userService.createUser(null, payload.get("name"), payload.get("email"), payload.get("password"), payload.get("age"), payload.get("image_url"), payload.get("role"), payload.get("address")), HttpStatus.CREATED);
    }

    @PostMapping("/sign")
    public ResponseEntity<User> signUser(@RequestBody Map<String, String> payload) {
        return new ResponseEntity<User>(userService.signUser(payload.get("email")), HttpStatus.OK);
    }

}
