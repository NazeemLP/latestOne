package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LandigPagePage {
	WebDriver driver;

	public LandigPagePage(WebDriver driver) {

		this.driver = driver;

	}

	public void searchSaree() {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div[2]/div/input")).sendKeys("saree",Keys.ENTER);

	}
}
