package io.grissom.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.grissom.userservice.service.Nju27Service;

@RestController
public class Nju27Controller {

	@Autowired
	private Nju27Service nju27Service;

	@GetMapping("/nju27")
	public Object nju27() {
		System.out.println("运行pod3");
		return nju27Service.nju27();
	}
}
