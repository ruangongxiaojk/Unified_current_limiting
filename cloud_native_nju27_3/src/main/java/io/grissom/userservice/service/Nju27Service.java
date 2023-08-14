package io.grissom.userservice.service;

import io.grissom.userservice.domain.Nju27;
import org.springframework.stereotype.Service;

@Service
public class Nju27Service {

	public Object nju27(){
		return new Nju27("Hello, we are Nju27!");
	}
}
