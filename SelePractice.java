import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelePractice {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C://Users//z003srvt.AD001//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("D://screenshot.png"));
		
//		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
//		driver.switchTo().alert().sendKeys("D");
//		driver.switchTo().alert().getText(); 
//		
//		WebDriverWait wait = new WebDriverWait(driver,20);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("DSD")));
//		WebElement locator = driver.findElement(By.xpath(""));
//		Actions action = new Actions(driver);
//		action.moveToElement(locator).keyDown(Keys.CONTROL).sendKeys("t").build().perform();
//		action.clickAndHold().sendKeys("FFF");

	}

}
