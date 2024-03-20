package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Radio {
@Test

	public  void rdbutton() {
	ChromeDriver driver = new ChromeDriver();
		
		//To load the url
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		//To maximize the window
		driver.manage().window().maximize();
		WebElement chrome=driver.findElement(By.xpath("//label[text()='Chrome']"));
		chrome.click();
		System.out.println("Radio Button Selected");
		chrome.click();
		if(chrome.isSelected()) 
		{
			
			System.out.println("Radio Button Selected");
		}
		else
		{			System.out.println("Radio Button DeSelected");}

		
	
		//finding default selected buttons
		WebElement radio=driver.findElement(By.xpath("//label[text()='Safari']"));
		if(radio.isEnabled())
		{
			System.out.println("Safari Selected by Default");
		}
		else {
			System.out.println("Nothing Selected by Default");

		}
		//Checkin & select age
		
		WebElement age=driver.findElement(By.xpath("//label[text()='21-40 Years']"));
		if(age.isEnabled())
		{
			System.out.println("21-40years Selected by Default");
		}
		else {
			System.out.println("No age is selected by default");

		}
	}

}
