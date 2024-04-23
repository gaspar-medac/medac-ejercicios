import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTesting {
	public static void main(String[] args) {
		// Configura la propiedad del sistema para el driver de Chrome
		System.setProperty("webdriver.gecko.driver", "resources/geckodriver");

		// Crea una instancia de ChromeDriver
		WebDriver driver = new FirefoxDriver();

		// Abre una página web
		driver.get("http://www.google.com");

		// Cierra el navegador
		driver.quit();
	}
}
