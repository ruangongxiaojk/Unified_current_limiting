package io.grissom.adminservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.grissom.adminservice.feign.Nju27Feign;


@Service
public class Nju27Service {
	@Autowired
	private Nju27Feign nju27Feign;

	public Object nju27(){
		return this.nju27Feign.nju27();
	}
}
