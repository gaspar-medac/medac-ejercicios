
import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SeleniumTesting {

    public static void main(String[] args) {
        // Configura la propiedad del sistema para el driver de Chrome
        System.setProperty("webdriver.gecko.driver", "resources/geckodriver.exe");

        FirefoxOptions options = new FirefoxOptions();
        options.setBinary(new FirefoxBinary(new File("C:\\Program Files\\Mozilla Firefox\\firefox.exe")));
        WebDriver driver = new FirefoxDriver(options);

        driver.get("https://bugbug.io/blog/testing-frameworks/best-selenium-practice-websites/");
        // 2 | setWindowSize | 1411x978 | 
        driver.manage().window().setSize(new Dimension(1411, 978));
        // 3 | click | linkText=Automation Testing Website | 
        driver.findElement(By.linkText("Automation Testing Website")).click();
        // 4 | click | linkText=Selenium Cheat Sheet | 
        driver.findElement(By.linkText("Selenium Cheat Sheet")).click();
        // Cierra el navegador
        driver.quit();
    }
}
