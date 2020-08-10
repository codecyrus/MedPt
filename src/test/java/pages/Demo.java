package pages;

import static org.testng.Assert.assertEquals;

import lib.Base;

public class Demo extends Base {

	public void goto_github() {

		try {
			driver.get("https://github.com/");
			assertEquals(driver.getTitle(), "The world’s leading software development platform · GitHub");
			
			Thread.sleep(2000);
			
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
}
