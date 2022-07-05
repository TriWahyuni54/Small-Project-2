package Login.Succes;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;
public class LoginSucces { WebDriver driver;
    WebDriverWait wait;
    @Given("^Open the chrome and launch the application$")
    public void Open_the_chrome_and_launch_the_application() throws Throwable {
        //    System.out.println("this step Open the chrome browser and launch the application");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa.cilsy.id:8080/en/");
        driver.findElement(By.className("hide_xs")).click();
    }

    @When("^Enter the email address and password$")
    public void Enter_the_email_address_and_password() throws Throwable {
        //    System.out.println("This step Enter the email addres and password");
        driver.findElement(By.id("email")).sendKeys("andrerezeki437@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("12345678");
    }

    @Then("^user see the dashboard$")
    public void user_see_the_dashboard() throws Throwable {
        //    System.out.println("This step user see the dashboard");
        driver.findElement(By.id("SubmitLogin")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}