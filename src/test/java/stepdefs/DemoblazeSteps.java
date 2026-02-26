
/*package page;*/
package stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.HomePage;
import page.ProductPage;

/*
import com.example.pages.HomePage;
import com.example.pages.ProductPage;
*/

public class DemoblazeSteps {

    private WebDriver driver;
    private HomePage home;
    private ProductPage product;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        home = new HomePage(driver);
        product = new ProductPage(driver);
    }

    @Given("User navigates to Demoblaze homepage")
    public void open_home()  throws InterruptedException{
        Thread.sleep(2000);
        System.out.println("Given - User clicks on Product");
        home.open();
    }

    @When("User clicks on Samsung galaxy s6 product")
    public void click_on_Samsung_galaxy_s6_product() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("When - User clicks on Samsung galaxy s6 product");
        home.clickSamsungs6();
    }

    @When("User clicks on Nokia lumia 1520 product")
    public void clickz_on_Nokia_lumia_product() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("When - User clicks on Nokia lumia product");
        home.clickNokiaLumia();
    }

    @When("User clicks on Nexus 6 product")
    public void clicks_on_Nexus_6_product() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("When - User clicks on Nexus 6 product");
        home.clickNexus6();;
    }

    @When("User clicks on Samsung galaxy s7 product")
    public void User_clicks_on_Samsung_galaxy_s7_product() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("When - User clicks on Samsung galaxy s7 product");
        home. clickSamsunggalaxys7();;
    }


    @Then("Product code text should be {string}")
    public void validate_code(String expectedCode)  {
        ProductPage productPage = new ProductPage(driver);
        System.out.println("Assert - User clicks on Producto");
        String actualCode = productPage.getProductCodeText();
        System.out.println("Codigo Esperado");
        System.out.println(expectedCode);
        System.out.println("Codigo Actual");
        System.out.println(actualCode);
        Assert.assertEquals(expectedCode, actualCode);
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("After  - User clicks on Product");
        System.out.println(" ");
        System.out.println("After  - Proceso finalizo OK");
        if (driver != null) driver.quit();
    }
}
