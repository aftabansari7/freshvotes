package com.freshvotes;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class DashboardController {
	
//	the below annotation will tell the spring that listen the GET request on localhost("/")
//	the @RequestMapping will always have a method which will return a view, here we have three view, each defined by ResponseEntity method which will return a string value enclosed in the body.
	
	@GetMapping("/user")
	public ResponseEntity<String> normaluser(){
		int a = 0;
		float result = a/10;
		return ResponseEntity.ok("I am a normal user");
		
	}
	@GetMapping("/public")
	public ResponseEntity<String> publicuser(){
		return ResponseEntity.ok("I am a public user");
	}
	@GetMapping("/admin")
	public ResponseEntity<String> adminuser(){
		return ResponseEntity.ok("I am an admin user");
	}
	


}
