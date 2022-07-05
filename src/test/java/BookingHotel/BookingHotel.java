package BookingHotel;

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

public class BookingHotel {
    WebDriver driver;
    WebDriverWait wait;
    @Given("^Open the chrome launch the application and login page$")
    public void Open_the_chrome_launch_the_application_login_page() throws Throwable {
        //    System.out.println("this step Open the chrome launch the application and login page");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.get("http://qa.cilsy.id:8080/en/");
        driver.findElement(By.className("hide_xs")).click();

        Thread.sleep(3000);
        driver.findElement(By.id("email")).sendKeys("andrerezeki437@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("12345678");
        driver.findElement(By.id("SubmitLogin")).click();
        Thread.sleep(1000);
    }

    @When("^User Input Location SelectHotel CheckInDate CheckOutDate$")
    public void User_Input_Location_SelectHotel_CheckInDate_CheckOutDate() throws Throwable {
        //    System.out.println("This step User Input Location SelectHotel CheckInDate CheckOutDate");
        driver.findElement(By.className("nav_toggle")).click();
        Thread.sleep(5000);
        driver.findElement(By.className("navigation-link")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("hotel_location")).sendKeys("Aceh");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"id_hotel_button\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"search_hotel_block_form\"]/div[2]/div/ul/li")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("check_in_time")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[6]/a")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("check_out_time")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[7]/a")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"search_room_submit\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"category_data_cont\"]/div[1]/div/div[2]/a")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")).click();
        Thread.sleep(5000);
    }

    @Then("^user input address and save address$")
    public void user_input_address_and_save_address() throws Throwable {
        //System.out.printIn("This step user input addres and save address");
        driver.findElement(By.id("firstname")).sendKeys("Andrerezeki");
        Thread.sleep(2000);
        driver.findElement(By.id("lastname")).sendKeys("andre");
        Thread.sleep(2000);
        driver.findElement(By.id("company")).sendKeys("Siswa QA");
        Thread.sleep(2000);
        driver.findElement(By.id("vat-number")).sendKeys("123456");
        Thread.sleep(2000);
        driver.findElement(By.id("address1")).sendKeys("Muara Enim");
        Thread.sleep(2000);
        driver.findElement(By.id("address2")).sendKeys("Muara enim");
        Thread.sleep(2000);
        driver.findElement(By.id("postcode")).sendKeys("31311");
        Thread.sleep(2000);
        driver.findElement(By.id("city")).sendKeys("Palembang");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"id_state\"]/option[67]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"id_country\"]/option")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("phone")).sendKeys("021456");
        Thread.sleep(2000);
        driver.findElement(By.id("phone_mobile")).sendKeys("082386679311");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"other\"]")).sendKeys("Singgah sebentar");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"alias\"]")).sendKeys("My address");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"submitAddress\"]")).click();
        Thread.sleep(2000);
    }

    @Then("^user proceed to checkout$")
    public void user_proceed_to_checkout() throws Throwable {
        //    System.out.println("This step user proceed to checkout");
        //Rooms & Price Summary
        driver.findElement(By.xpath("//*[@id=\"collapse-shopping-cart\"]/div/div[2]/div[2]/div/a")).click();
        Thread.sleep(2000);
        //Guest Information
        driver.findElement(By.xpath("//*[@id=\"collapse-guest-info\"]/div/div[4]/div/a")).click();
        Thread.sleep(2000);
        //Payment Information
        driver.findElement(By.id("cgv")).click();
        Thread.sleep(2000);
        //Pay bay bank wire
        driver.findElement(By.className("bankwire")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button")).click();
        Thread.sleep(2000);

        //order history
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/p/a")).click();

        Thread.sleep(2000);
        driver.quit();

    }
}
