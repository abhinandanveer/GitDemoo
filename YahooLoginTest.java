package SeleniumMavenn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class YahooLoginTest {

    public static void main(String[] args) throws InterruptedException {

        
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        

      
        driver.get("https://login.yahoo.com/");
        Thread.sleep(3000);

      
        driver.findElement(By.id("login-username")).sendKeys("abhiveer9821");

      
        driver.findElement(By.id("login-signin")).click();

       
        Thread.sleep(2000);

        
        driver.findElement(By.id("login-passwd")).sendKeys("Vb#251566");

        
        driver.findElement(By.id("login-signin")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div[3]/div[1]/div/div/a/svg/path")).click();

       
        System.out.println("Login Script Executed");

        
        Thread.sleep(8000);

        driver.quit();
    }
}
