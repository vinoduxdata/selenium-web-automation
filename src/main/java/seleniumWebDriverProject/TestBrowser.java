package seleniumWebDriverProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;

public class TestBrowser {
	public static void main(String[] args) {  
        
	    // declaration and instantiation of objects/variables  
	    System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");  
	    WebDriver driver=new ChromeDriver();  
	      
	 
	    driver.navigate().to("file:///Users/nandan/Desktop/programs/HTML%20programs/allUIElements.html");  
	    
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("/html/body/form/input[1]")).click(); 
	    
	    driver.findElement(By.xpath("/html/body/form/input[1]")).sendKeys("Nandan Kumar");
	    
	    
	    
	    driver.findElement(By.xpath("/html/body/form/input[2]")).click();
	    driver.findElement(By.xpath("/html/body/form/input[2]")).sendKeys("nandan@uxdata.in");
	    
	    
	    driver.findElement(By.xpath("/html/body/form/input[3]")).click(); 
	    
	    driver.findElement(By.xpath("/html/body/form/input[3]")).sendKeys("7090046379");
	    
        
	    driver.findElement(By.xpath("/html/body/form/input[5]")).click(); 
	    
	    driver.findElement(By.xpath("/html/body/form/input[5]")).sendKeys("nanana");
	    
	    WebElement slider=driver.findElement(By.xpath("/html/body/form/input[6]"));
	    
	  
	    for (int i = 1; i <= 5 ; i++) {
            slider.sendKeys(Keys.ARROW_RIGHT);
        }
	    
	    for (int i = 1; i <= 20 ; i++) {
            slider.sendKeys(Keys.ARROW_LEFT);
        }
	    
	    driver.findElement(By.xpath("/html/body/form/fieldset[1]/input[1]")).click();
	    
	    driver.findElement(By.xpath("//*[@id=\"education\"]/option[4]")).click();
	    
	    
	    driver.findElement(By.xpath("/html/body/form/fieldset[2]/input[1]")).click();
	    driver.findElement(By.xpath("/html/body/form/fieldset[2]/input[3]")).click();
	    driver.findElement(By.xpath("/html/body/form/fieldset[2]/input[4]")).click();
	    driver.findElement(By.xpath("/html/body/form/fieldset[2]/input[5]")).click();
	    
	    
	    //driver.findElement(By.xpath("/html/body/form/input[4]")).click();
	    
	    WebElement dateBox = driver.findElement(By.xpath("/html/body/form/input[4]")); 
	    dateBox.sendKeys("25092013"); 
//	    dateBox.sendKeys("0245PM");
	    
	    
	    //driver.findElement(By.xpath("/html/body/form/input[7]")).click();
	    
		};     
//	    // Click on the search text box and send value 
//	    driver.findElement(By.name("Contact")).click();  
//	          
//	    // Click on the search button  
//	    driver.findElement(By.id("Home")).click();  
	   // driver.quit();
	      
	    }  


