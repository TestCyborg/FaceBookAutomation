package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MyStepdefs {
    WebDriver driver = Hooks.driver;

    @Given("User is on the facebook page")
    public void userIsOnTheFacebookPage() {
        List<WebElement> fbLogo = driver.findElements(By.xpath("//h2"));
        if(fbLogo.size()!=0)
        {
            System.out.println("Facebook Logo displayed.");
        }
    }

    @When("User enters username")
    public void userEntersUsername(DataTable dataTable) {
        List<String> list = dataTable.asList(String.class);
        WebElement txtUsername = driver.findElement(By.xpath("//input[@type='text']"));
        txtUsername.sendKeys(list.get(0));
        System.out.println("Username entered");
    }

    @And("User enters password")
    public void userEntersPassword(DataTable dataTable) {
        List<String> list = dataTable.asList(String.class);
        WebElement txtPass = driver.findElement(By.xpath("//input[@type='password']"));
        txtPass.sendKeys(list.get(0));
        System.out.println("Password entered");
    }

    @And("User clicks login button")
    public void userClicksLoginButton() {
        WebElement btnLogin = driver.findElement(By.xpath("//button[@name='login']"));
        btnLogin.click();
        System.out.println("Button clicked");
    }

    @Then("Timeline is displayed")
    public void timelineIsDisplayed() {
    }

    @When("User enters {string} in status textbox")
    public void userEntersInStatusTextbox(String arg0) {
    }

    @And("User clicks post button")
    public void userClicksPostButton() {
    }

    @Then("Status successfully updated popup is displayed")
    public void statusSuccessfullyUpdatedPopupIsDisplayed() {
    }

    @When("User clicks like button")
    public void userClicksLikeButton() {
    }

    @Then("Likes number is incremented by one")
    public void likesNumberIsIncrementedByOne() {
    }

    @And("User enters invalid password")
    public void userEntersInvalidPassword() {
    }

    @Then("Incorrect password is displayed")
    public void incorrectPasswordIsDisplayed() {
        List<WebElement> error = driver.findElements(By.xpath("//*[text()='Create a new Facebook account.']"));
        if(error.size()!=0)
        {
            System.out.println("Error is displayed.");
        }
    }
}
