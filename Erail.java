package week4.HW;


	import java.time.Duration;
	import java.util.ArrayList;
	import java.util.List;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Erail {

		public static void main(String[] args) throws InterruptedException {
			
			// Declaring driver & getting url

			ChromeDriver driver=new ChromeDriver();
			driver.get("https://erail.in");
			
			//MAximize the window  & including wait
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			
			
			
			
			//selecting ,clearing text box sending values to station& from station
			WebElement from=driver.findElement(By.xpath("//input[@id=\"txtStationFrom\"]"));
			from.clear();
			from.sendKeys("MAS");from.click();
			
			WebElement fromm=driver.findElement(By.xpath("//div[@title='Mgr Chennai Ctr']/div[1]"));
			fromm.click();
			Thread.sleep(2000);
			
			WebElement to=driver.findElement(By.id("txtStationTo"));
			to.clear();
			to.sendKeys("MDU");
			WebElement too=driver.findElement(By.xpath("//div[@title='Madurai Jn']/div[1]"));
			too.click();
			Thread.sleep(2000);
			
			//Unchecking the date box
			driver.findElement(By.id("chkSelectDateOnly")).click();
			
			
			
		
			//Getting size 
			int size=driver.findElements(By.xpath("//*[@id=\"divTrainsList\"]/table[1]/tbody/tr/td[2]/a")).size();
			

			List<String> duplicates=new ArrayList<String>();
			
			List<String> cityDataValues=new ArrayList<String>();

			
			
			System.out.println("\t\t\t\t AVAILABLE TRAINS LIST :: "+size+"\t\t\t\n");
			
			for(int i=3;i<=size;i++) {
				
				//Getting values from each index
				String cNames=driver.findElement(By.xpath("//table[1]/tbody/tr["+i+"]/td[2]/a")).getText();	
				System.out.println("\t\t"+cNames);
				WebElement compare=driver.findElement(By.xpath("//table[1]/tbody/tr["+i+"]/td[2]/a"));	
				String compareText=compare.getText();
				
				//Comparing and adding the duplicate and unique values 
				if(cNames.equals(compareText) ) 
				{
					duplicates.add(cNames);
					
				}
			     
				
				else {
					cityDataValues.add(cNames);
				     }
			}
			
			//Verifying the duplicate or not values
			   if(cityDataValues.isEmpty())
			   {
					System.out.println("\n\t\t\t\t No Duplicate values identified");

			   }
			   else
			   {
					System.out.println(" Duplicate values are ===>"+duplicates);

			   }
			   }

			
			
		}
			
			
			
			
			
			
		




