package ljx.cn.springboot_hell.Controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {

	
	@GetMapping("/hello")
	public String hello(){
		return "Hello SpringBoot";
	}
	
	@GetMapping("/hello1")
	public String hello1(){
		if(true)System.out.println("");	
		
		return "Hello SpringBoot1";
	}
	
	@GetMapping("/hello2")
	public String hello2(){
		if(true)System.out.println("");	
		
		return "Hello SpringBoot2";
	}
}
