package medac.test.ed17;

// Generated by Selenium IDE
import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DefaultSuiteTest {

    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @Test
    public void testselenium() {
        // Test name: test-selenium
        // Step # | name | target | value
        // 1 | open | /blog/testing-frameworks/best-selenium-practice-websites/ | 
        System.setProperty("webdriver.gecko.driver", "resources/geckodriver.exe");

        FirefoxOptions options = new FirefoxOptions();
        options.setBinary(new FirefoxBinary(new File("C:\\Program Files\\Mozilla Firefox\\firefox.exe")));
        WebDriver driver = new FirefoxDriver(options);
        
        driver.get("https://docs.google.com/forms/d/e/1FAIpQLSeI8_vYyaJgM7SJM4Y9AWfLq-tglWZh6yt7bEXEOJr_L-hV1A/viewform?formkey=dGx0b1ZrTnoyZDgtYXItMWVBdVlQQWc6MQ");
        driver.manage().window().setSize(new Dimension(1936, 1048));
        driver.findElement(By.cssSelector(".whsOnd")).click();
        driver.findElement(By.cssSelector(".whsOnd")).sendKeys("test");
        driver.findElement(By.cssSelector(".KHxj8b")).click();
        driver.findElement(By.cssSelector(".KHxj8b")).sendKeys("none");
        driver.findElement(By.cssSelector("#i13 .AB7Lab")).click();
        driver.findElement(By.cssSelector("#i30 > .uHMk6b")).click();
        driver.findElement(By.cssSelector(".KKjvXb > .vRMGwf")).click();
        driver.findElement(By.cssSelector(".OA0qNb > .KKjvXb > .vRMGwf")).click();
        driver.findElement(By.cssSelector(".qs41qe .AB7Lab")).click();
        driver.findElement(By.cssSelector(".qs41qe .AB7Lab")).click();
        driver.findElement(By.cssSelector(".Y5sE8d .NPEfkd")).click();
        driver.findElement(By.cssSelector("html")).click();
        driver.quit();
    }

    @Test
    public void testseleniumChrome() {
        // Test name: test-selenium
        // Step # | name | target | value
        // 1 | open | /blog/testing-frameworks/best-selenium-practice-websites/ | 
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        
        WebDriver driver = new ChromeDriver();
        driver.get("https://docs.google.com/forms/d/e/1FAIpQLSeI8_vYyaJgM7SJM4Y9AWfLq-tglWZh6yt7bEXEOJr_L-hV1A/viewform?formkey=dGx0b1ZrTnoyZDgtYXItMWVBdVlQQWc6MQ");
        driver.manage().window().setSize(new Dimension(1936, 1048));
        driver.findElement(By.cssSelector(".whsOnd")).click();
        driver.findElement(By.cssSelector(".whsOnd")).sendKeys("test");
        driver.findElement(By.cssSelector(".KHxj8b")).click();
        driver.findElement(By.cssSelector(".KHxj8b")).sendKeys("none");
        driver.findElement(By.cssSelector("#i13 .AB7Lab")).click();
        driver.findElement(By.cssSelector("#i30 > .uHMk6b")).click();
        //driver.findElement(By.cssSelector(".KKjvXb > .vRMGwf")).click();
        //driver.findElement(By.cssSelector(".OA0qNb > .KKjvXb > .vRMGwf")).click();
        //driver.findElement(By.cssSelector(".qs41qe .AB7Lab")).click();
        driver.findElement(By.cssSelector(".qs41qe .AB7Lab")).click();
        driver.findElement(By.cssSelector(".Y5sE8d .NPEfkd")).click();
        driver.findElement(By.cssSelector("html")).click();
        driver.quit();
    }
}