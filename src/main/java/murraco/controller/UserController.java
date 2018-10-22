package murraco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import murraco.controller.model.LoginRequest;
import murraco.service.LoginService;

@RestController
@RequestMapping("/users")
@Api(tags = "users")
public class UserController {

	@Autowired
	LoginService loginService;

	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
		return ResponseEntity.ok(loginService.login(loginRequest));
	}
}
