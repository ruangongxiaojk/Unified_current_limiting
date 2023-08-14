package io.grissom.adminservice.controller;

import io.grissom.adminservice.controller.limit.Limit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.grissom.adminservice.service.Nju27Service;

@RestController
public class Nju27Controller {

	@Autowired
	private Nju27Service nju27Service;
	private int c = 0;

	@GetMapping("/nju27")
	@Limit(count = 50)
	public Object nju27() {
		c++;
		System.out.println(c);
		return nju27Service.nju27();
	}
}
