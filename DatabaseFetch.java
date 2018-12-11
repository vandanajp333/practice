import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatabaseFetch {

	public static void main(String[] args) throws SQLException {
		
				System.setProperty("webdriver.chrome.driver", "//home//ranjith//Downloads//chromedriver_linux64//chromedriver");
				WebDriver driver = new ChromeDriver();
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/springbootapplication?autoReconnect=true&useSSL=false", "ranjith", "password");
				Statement st= connection.createStatement();
				ResultSet rs = st.executeQuery("select * from Person");
				while(rs.next()) {
				System.out.println(rs.getString("Name"));
				System.out.println(rs.getInt("age"));
				driver.get("http://automationpractice.com/index.php");
				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				driver.findElement(By.linkText("Sign in")).click();;
				driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				driver.findElement(By.id("email")).sendKeys(rs.getString("email"));
				driver.findElement(By.id("passwd")).sendKeys(rs.getString("password"));
				driver.findElement(By.id("SubmitLogin")).click();
				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				driver.quit();
				}
				

}
}
