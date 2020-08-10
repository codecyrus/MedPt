package testScripts;

import org.testng.annotations.Test;

import lib.Base;
import pages.Demo;

public class TestDemo extends Base{
	
	@Test
	public void SmokeDemoTest() 
	{
		Demo demo = new Demo();
		demo.goto_github();
	}

}
