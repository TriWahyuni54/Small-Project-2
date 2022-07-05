package Register.Failed;
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
public class RegiterFail {
    WebDriver driver;
    WebDriverWait wait;
    @Given("^User Open chrome and launch the application$")
    public void User_Open_chrome_and_launch_the_application() throws Throwable {
//        System.out.println("this step User Open chrome and launch the application");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa.cilsy.id:8080/en/");
        driver.findElement(By.className("hide_xs")).click();
    }

    @When("^User input email using registered email$")
    public void User_input_email_using_registered_email() throws Throwable {
//        System.out.println("This step User input email using registered email");
        driver.findElement(By.id("email_create")).sendKeys("triwhyn974@gmail.com");
    }

    @And("^Click create an account button$")
    public void Click_create_an_account_button() throws Throwable{
//        System.out.println("This step Click create an account button");
        driver.findElement(By.id("SubmitCreate")).click();
        Thread.sleep(5000);
    }

    @Then("^the user does not fail to register$")
    public void the_user_does_not_fail_to_register() throws Throwable {
//        System.out.println("This step the user does not fail to register");
        WebDriverWait wait = new WebDriverWait(driver, 5);
        // An account using this email address has already been registered. Please enter a valid password or request a new one.
        WebElement accountError = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("create_account_error")));
        assertTrue(accountError.isDisplayed());
        Thread.sleep(3000);
        driver.quit();
    }
}
