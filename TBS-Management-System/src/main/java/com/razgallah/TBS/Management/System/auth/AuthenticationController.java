package com.razgallah.TBS.Management.System.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Karim Razgallah
 * @project TBS Management System
 * @created 03-Jan-23
 */

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService service;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody RegisterRequest request
    ) {
        return ResponseEntity.ok(service.register(request));
    }

    @PostMapping("/student/register")
    public ResponseEntity<AuthenticationResponse> registerStudent(
            @RequestBody RegisterRequest request
    ) {
        return ResponseEntity.ok(service.registerStudent(request));
    }

    @PostMapping("/admin/register")
    public ResponseEntity<AuthenticationResponse> registerAdmin(
            @RequestBody RegisterRequest request
    ) {
        return ResponseEntity.ok(service.registerAdmin(request));
    }

    @PostMapping("/professor/register")
    public ResponseEntity<AuthenticationResponse> registerProfessor(
            @RequestBody RegisterRequest request
    ) {
        return ResponseEntity.ok(service.registerProfessor(request));
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(
            @RequestBody AuthenticationRequest request
    ) {
        return ResponseEntity.ok(service.authenticate(request));
    }

    @PostMapping("/student/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticateStudent(
            @RequestBody AuthenticationRequest request
    ) {
        return ResponseEntity.ok(service.authenticateStudent(request));
    }

    @PostMapping("/admin/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticateAdmin(
            @RequestBody AuthenticationRequest request
    ) {
        return ResponseEntity.ok(service.authenticateAdmin(request));
    }

    @PostMapping("/professor/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticateProfessor(
            @RequestBody AuthenticationRequest request
    ) {
        return ResponseEntity.ok(service.authenticateProfessor(request));
    }


}