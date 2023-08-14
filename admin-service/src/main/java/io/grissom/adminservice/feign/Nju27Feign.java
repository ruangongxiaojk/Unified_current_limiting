package io.grissom.adminservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient("user-service")
public interface Nju27Feign {

	@GetMapping("/nju27")
	Object nju27();
}
