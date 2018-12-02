package ljx.cn.springboot_hell.Controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {

	
	@GetMapping("/hello")
	public String hello(){
		return "Hello SpringBoot";
	}
}
