package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Launch {
@Test

	public  void launch() {
		ChromeDriver driver = new ChromeDriver();//ctr+shift+o --->import organize
		
		//To load the url
		driver.get("https://leafground.com/input.xhtml");
		
		//To maximize the window
		driver.manage().window().maximize();
		
		// Locate the inputfield type 
		WebElement typeYourName=driver.findElement(By.name("j_idt88:name"));
		String placeholdervalue = typeYourName.getAttribute("placeholder");
		System.out.println("The placeholder value : "+ placeholdervalue);
		//Datatype variable = value
		typeYourName.sendKeys("Saranya");
		String value = driver.findElement(By.name("j_idt88:name")).getAttribute("value");
		System.out.println("result"+value);
		
	}

}
