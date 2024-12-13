package CodeAvengers.Sarthi.controller;

import CodeAvengers.Sarthi.entity.LoginRequest;
import CodeAvengers.Sarthi.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("api/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    // Using @RequestBody to get JSON input for login credentials
    @PostMapping
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
        boolean isAuthenticated = loginService.authenticate(loginRequest.getEmail(), loginRequest.getPassword());

        if (isAuthenticated) {
            return ResponseEntity.ok().body("Login successful!");
        } else {
            return ResponseEntity.status(401).body("Invalid email or password!");
        }
    }
}
