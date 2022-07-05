package Login.Failed;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.assertTrue;

public class LoginFailed {
    WebDriver driver;
    @Given("^User Open the web page$")
    public void User_Open_the_web_page() throws Throwable {
        //    System.out.println("this step User Open the web page");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa.cilsy.id:8080/en/");
        driver.findElement(By.className("hide_xs")).click();
    }

    @When("^User Input email address and password$")
    public void User_Input_email_address_and_password() throws Throwable {
        //    System.out.println("This step User Input email address and password");
        driver.findElement(By.id("email")).sendKeys("yuni34@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("jsahuqyq");
        driver.findElement(By.id("SubmitLogin")).click();
    }

    @Then("^user see failed$")
    public void user_see_failed() throws Throwable {
        //    System.out.println("This step user see failed");
        //There is 1 error
        //
        //Authentication failed.
        Thread.sleep(3000);
        driver.quit();
    }
}