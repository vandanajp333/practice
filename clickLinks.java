import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickLinks {

	public static void main(String[] args)  {
		
	
	System.setProperty("webdriver.chrome.driver", "C://Users//z003srvt.AD001//Downloads//chromedriver_win32//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.qaclickacademy.com/practice.php");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement footer = driver.findElement(By.xpath("//div[@id='gf-BIG']//following::table/tbody/tr/td[1]"));
	int count=footer.findElements(By.tagName("a")).size();
	System.out.println(count);
	Actions action = new Actions(driver);
	String comboKeys=Keys.chord(Keys.CONTROL,Keys.ENTER);
	for(int i=0;i<count;i++){
		footer.findElements(By.tagName("a")).get(i).click();
		//action.moveToElement(footer).sendKeys(comboKeys).click().build().perform();
		footer.findElements(By.tagName("a")).get(i).sendKeys(comboKeys);
		driver.navigate().back();//complete it
	}
	driver.quit();
	}
}