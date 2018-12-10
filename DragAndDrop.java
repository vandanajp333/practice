import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C://Users//z003srvt.AD001//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).build().perform();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		System.out.println("dropped");
		String newTabClick=Keys.chord(Keys.CONTROL,Keys.ENTER);
		System.out.println(driver.findElements(By.tagName("a")).size());
		driver.quit();
	}

}
