package murraco.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import murraco.controller.model.LoginRequest;
import murraco.model.LoginResponse;
import murraco.model.Role;
import murraco.repository.JwtRepository;
import murraco.security.JwtTokenProvider;

@Service
public class LoginService {
	@Autowired
	JwtTokenProvider jwtTokenProvider;
	@Autowired
	JwtRepository jwtRepository;

	public LoginResponse login(LoginRequest loginRequest) {
		String jwt = jwtTokenProvider.createToken(loginRequest.getUserName(),
				Arrays.asList(Role.ROLE_ADMIN, Role.ROLE_CLIENT));
		LoginResponse loginResponse = new LoginResponse(jwt, loginRequest.getUserName());
		jwtRepository.save(loginResponse);
		return loginResponse;
	}
}
