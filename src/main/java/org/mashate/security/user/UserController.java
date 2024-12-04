package org.mashate.security.user;

import lombok.RequiredArgsConstructor;

import org.mashate.security.auth.AuthenticationRequest;
import org.mashate.security.auth.AuthenticationResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

	private final UserService service;

	@PatchMapping
	public ResponseEntity<?> changePassword(@RequestBody ChangePasswordRequest request, Principal connectedUser) {
		service.changePassword(request, connectedUser);
		return ResponseEntity.ok().build();
	}
	
	  @GetMapping("/All")
	  public ResponseEntity<List<User>> getAll() {
//		  verifies the connected user(token) to have an admin role ?? 
	    return ResponseEntity.ok(service.getAllUsers());
	  }
}