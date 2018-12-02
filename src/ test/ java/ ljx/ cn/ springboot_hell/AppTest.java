package ljx.cn.springboot_hell;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @GetMapping("/hello2")
	public String hello2(){
		if(true){
			System.out.println("");	
		}
		
		return "Hello SpringBoot2";
	}
}
