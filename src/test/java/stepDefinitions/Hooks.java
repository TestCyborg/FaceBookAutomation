package stepDefinitions;

import driverManager.DriverSetup;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.IOException;
import java.net.MalformedURLException;

public class Hooks extends DriverSetup {
    static WebDriver driver;
    @Getter @Setter
    static Scenario currentScenario;
    @Before
    public void setup(Scenario scenario) throws MalformedURLException {
        driver = null;
        if (driver == null)
        {
            driver = getDriver();
            System.out.println("Test Case: "+ (scenario.getName()));
        }
    }
//    @AfterStep
    public void captureScreen(Scenario scenario)
    {
        byte[] source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(source, "image/png", "screen");
        System.out.println("Screen captured");
    }
    @After
    public void teardown(Scenario scenario) throws IOException {
        System.out.println("Finished Test Case: "+ scenario.getName());
        driver.quit();
    }
}
