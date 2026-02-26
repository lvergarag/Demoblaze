
package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    private By Samsunggalaxys6Link = By.linkText("Samsung galaxy s6");
    private By NokialumiaLink = By.linkText("Nokia lumia 1520");
    private By Nexus6Link = By.partialLinkText("Nexus 6");
    private By Samsunggalaxys7Link = By.partialLinkText("Samsung galaxy s7");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("https://www.demoblaze.com/");
    }

    public void clickSamsungs6() {
        wait.until(ExpectedConditions.elementToBeClickable(Samsunggalaxys6Link)).click();
    }

    public void clickNokiaLumia() {
            wait.until(ExpectedConditions.elementToBeClickable(NokialumiaLink)).click();
    }

    public void clickNexus6() {
        wait.until(ExpectedConditions.elementToBeClickable(Nexus6Link)).click();
    }

    public void clickSamsunggalaxys7() {
        wait.until(ExpectedConditions.elementToBeClickable(Samsunggalaxys7Link )).click();

    }
}
