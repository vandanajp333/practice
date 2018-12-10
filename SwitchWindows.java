import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchWindows {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//z003srvt.AD001//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions action = new Actions(driver);
//		action.sendKeys(Keys.PAGE_DOWN).build().perform();
//		action.sendKeys(Keys.PAGE_DOWN).build().perform();
//		action.sendKeys(Keys.PAGE_DOWN).build().perform();
//		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//		action.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(5000);
		action.moveByOffset(20000, 20000).build().perform();
//		Thread.sleep(5000);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,20000)");
//		Thread.sleep(5000);
		driver.findElement(By.id("openwindow")).click();
		Set<String> s=driver.getWindowHandles();
		Iterator<String> it=s.iterator();
		String parentId= it.next();
		String childId=it.next();
		driver.switchTo().window(childId);
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
