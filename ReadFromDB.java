import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadFromDB {

	public static void main(String[] args) throws SQLException {
		//refer ubuntu ranjith machine
		
		System.setProperty("webdriver.chrome.driver", "C://Users//z003srvt.AD001//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
//		String hostname = "localhost";
//		String portNumber="3306";
		//Connection connection = DriverManager.getConnection("jdbc:mysql://"+hostname+":"+portNumber+"/Tester"+"?autoReconnect=true&useSSL=false","root","8088117623");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium?autoReconnect=true&useSSL=false","root","8880231101");
		Statement statement=connection.createStatement();
		ResultSet rs = statement.executeQuery("select * from Tester1");
		while(rs.next())
		{
		System.out.println(rs.getString("Name"));
		System.out.println(rs.getInt("id"));
		System.out.println(rs.getString("Location"));
		System.out.println(rs.getInt("age"));
		driver.get("automationpractice.com");
		driver.findElement(By.xpath("")).sendKeys(rs.getString("email"));
		driver.findElement(By.xpath("")).sendKeys(rs.getString("password"));
		
		}
	}

}
