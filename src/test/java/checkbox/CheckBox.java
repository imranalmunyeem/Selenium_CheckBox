package checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import base_class.DriverSetup;

public class CheckBox extends DriverSetup {

	@Test
	public void TestCheckbox() throws InterruptedException {
		driver.get("http://18.209.122.163/admin/login");
		Thread.sleep(2000);
		// Selecting CheckBox
		WebElement checkbox = driver
				.findElement(By.xpath("/html/body/div/div/div/div[1]/div/form/div[3]/div/div/label/input"));

		// This will Toggle the Check box
		checkbox.click();

		// Check whether the Check box is toggled on
		if (checkbox.isSelected()) {
			System.out.println("Checkbox is Toggled On");

		} else {
			System.out.println("Checkbox is Toggled Off");
		}

		// Selecting Checkbox and using isSelected Method
		driver.get("http://18.209.122.163/admin/login");
		WebElement EasyAsk = driver
				.findElement(By.xpath("/html/body/div/div/div/div[1]/div/form/div[3]/div/div/label/input"));
		for (int i = 0; i < 2; i++) {
			EasyAsk.click();
			System.out.println("EasyAsk Persists Checkbox Status is -  " + EasyAsk.isSelected());
		}

		driver.close();

	}
}
