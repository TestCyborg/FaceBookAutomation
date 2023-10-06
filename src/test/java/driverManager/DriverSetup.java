package driverManager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.net.MalformedURLException;

public class DriverSetup {
    public static WebDriver driver;
    public static WebDriver getDriver() throws MalformedURLException {
//        String browser = "edge";
//        switch (browser.toUpperCase())
//        {
//            case "EDGE":
//                WebDriverManager.edgedriver().setup();
//                EdgeOptions options = new EdgeOptions();
//                FirefoxOptions options = new FirefoxOptions();
//                options.addArguments("--remote-allow-origins=*");
//                driver = new RemoteWebDriver(new URL("http://localhost:4444"), options); // if selenium-grid is on a remote machine then replace the 'localhost' with the url of the remote machine
//
//                driver = new EdgeDriver(options);
//                break;
//            case "CHROME":
//                WebDriverManager.chromedriver().setup();
//                ChromeOptions optionsChrome = new ChromeOptions();
//                optionsChrome.addArguments("--remote-allow-origins=*");
//                driver = new ChromeDriver(optionsChrome);
//                break;
//            case "FIREFOX":
                WebDriverManager.firefoxdriver().setup();
//                FirefoxOptions optionsFox = new FirefoxOptions();
////                optionsFox.addArguments("--remote-allow-origins=*");
                driver = new FirefoxDriver();
//                break;
//            default:
//                System.out.println("Select browser");
//                break;
//        }
        driver.navigate().to("https://www.facebook.co.za");
        driver.manage().window().maximize();
        return driver;
    }
}