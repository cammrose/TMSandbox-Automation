package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    WebDriver driver;

    public WebElement booksButton;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        getElements();
    }

    /*
    Assigning each of the elements to their corresponding WebElement variable
     */
    private void getElements() {
        this.booksButton = driver.findElement(By.linkText("Books")); //Using link text as the locator based on locator priority and since the link is unique
    }

}
