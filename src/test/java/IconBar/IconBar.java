package IconBar;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IconBar {
    WebDriver driver;
    @Given("^User Open the chrome launch the application and login page$")
    public void User_Open_the_chrome_launch_the_application_and_login_page() throws Throwable {
        //    System.out.println("this step User Open the chrome launch the application and login page");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa.cilsy.id:8080/en/");
        driver.findElement(By.className("hide_xs")).click();

        Thread.sleep(3000);
        driver.findElement(By.id("email")).sendKeys("andrerezeki437@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("12345678");
        driver.findElement(By.id("SubmitLogin")).click();
        Thread.sleep(1000);
    }

    @When("^User click Home Interior Amenities Rooms Testimonials LegalNotice AboutUs and Contact$")
    public void User_click_Home_Interior_Amenities_Rooms_Testimonials_LegalNotice_AboutUs_and_Contact() throws Throwable {
        //    System.out.println("This step User click Home Interior Amenities Rooms Testimonials LegalNotice AboutUs and Contact");
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[2]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"menu_cont\"]/div/div/div[2]/ul[1]/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[2]/button")).click();
        //1. Interior
        driver.findElement(By.xpath("//*[@id=\"menu_cont\"]/div/div/div[2]/ul[1]/li[2]/a")).click();
        Thread.sleep(1000);
        //2. Amenities
        driver.findElement(By.xpath("//*[@id=\"menu_cont\"]/div/div/div[2]/ul[1]/li[3]/a")).click();
        Thread.sleep(1000);
        //3.Rooms
        driver.findElement(By.xpath("//*[@id=\"menu_cont\"]/div/div/div[2]/ul[1]/li[4]/a")).click();
        Thread.sleep(1000);
        //4. Testimonials
        driver.findElement(By.xpath("//*[@id=\"menu_cont\"]/div/div/div[2]/ul[1]/li[5]/a")).click();
        Thread.sleep(1000);
        //5. Legal Noties
        driver.findElement(By.xpath("//*[@id=\"menu_cont\"]/div/div/div[2]/ul[1]/li[6]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[2]/button")).click();
        Thread.sleep(1000);
        //6. About us
        driver.findElement(By.xpath("//*[@id=\"menu_cont\"]/div/div/div[2]/ul[1]/li[7]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[2]/button")).click();
        Thread.sleep(1000);
        // 7. Contact
        driver.findElement(By.xpath("//*[@id=\"menu_cont\"]/div/div/div[2]/ul[1]/li[8]/a")).click();
        Thread.sleep(1000);
    }

    @Then("^User back homepage$")
    public void User_back_homepage() throws Throwable {
        //    System.out.println("This step User back homepage");
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[2]/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"menu_cont\"]/div/div/div[2]/ul[1]/li[1]/a")).click();

        Thread.sleep(3000);
        driver.quit();
    }
}
