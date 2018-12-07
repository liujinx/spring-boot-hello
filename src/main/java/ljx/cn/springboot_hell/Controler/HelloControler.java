package ljx.cn.springboot_hell.Controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {

	
	public static void main(String[] args) {
		System.out.println("");
	}
	
	@GetMapping("/hello")
	public String hello(){
		return "Hello SpringBoot";
	}
	
	@GetMapping("/hello4")
	public String hello4(){
		return "Hello SpringBoot";
	}
	
	
}
