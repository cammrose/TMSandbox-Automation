package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BooksPage {

    WebDriver driver;

    public Select locationFilterDropdown; //Select Object type for dropdown elements
    public WebElement comicGraphicNovelsButton;
    public WebElement avengersListingButton;

    public BooksPage(WebDriver driver) {
        this.driver = driver;
        getElements();
    }

    /*
    Assigning each of the elements to their corresponding WebElement variable
     */
    public void getElements() {
        this.locationFilterDropdown = new Select(driver.findElement(By.id("LocationFilter_regionSelect")));
        this.comicGraphicNovelsButton = driver.findElement(By.linkText("Comics & graphic novels")); //Using link text as the locator based on locator priority and since the link is unique
        this.avengersListingButton = driver.findElement(By.className("listing-buy-now"));
    }

}
