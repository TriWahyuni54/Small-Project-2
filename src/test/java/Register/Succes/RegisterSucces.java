package Register.Succes;
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
public class RegisterSucces { WebDriver driver;
    @Given("^user open google chrome and launch the application demo qa cilsy$")
    public void user_open_google_chrome_and_launch_the_application_demo_qa_cilsy() throws Throwable {
//        System.out.println("this step user open google chrome browser and launch the application demo qa cilsy");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa.cilsy.id:8080/en/");
        driver.findElement(By.className("hide_xs")).click();
    }

    @When("^User input email address$")
    public void User_input_email_address() throws Throwable {
//        System.out.println("This step User input email address");
        driver.findElement(By.id("email_create")).sendKeys("triwahyuni182018@gmail.com");
    }

    @And("^Click on create an account button$")
    public void Click_on_create_an_account_button() throws Throwable{
//        System.out.println("This step Click on create an account button");
        driver.findElement(By.id("SubmitCreate")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("id_gender2")).click();
        driver.findElement(By.id("customer_firstname")).sendKeys("Triwahyuni");
        driver.findElement(By.id("customer_lastname")).sendKeys("Yuni");
        driver.findElement(By.id("passwd")).sendKeys("Gaol123");
        driver.findElement(By.xpath("//*[@id=\"days\"]/option[19]")).click();
        driver.findElement(By.xpath("//*[@id=\"months\"]/option[12]")).click();
        driver.findElement(By.xpath("//*[@id=\"years\"]/option[25]")).click();
        driver.findElement(By.id("newsletter")).click();
        driver.findElement(By.id("optin")).click();
    }

    @Then("^User successful register$")
    public void User_successful_register() throws Throwable {
//        System.out.println("This step User successful register");
        driver.findElement(By.id("submitAccount")).click();

        Thread.sleep(3000);
        driver.quit();
    }
}