package murraco.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContoller {

	@GetMapping("/hello")
	public ResponseEntity<?> sayHello() {
		return ResponseEntity.ok("hello");
	}
}
