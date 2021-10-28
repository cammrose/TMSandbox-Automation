package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AvengersBookListingPage {

    WebDriver driver;

    public WebElement bookTitleText;
    public WebElement bookListingExpiryText;
    public WebElement bookPriceText;
    public WebElement bookSellerText;

    public AvengersBookListingPage(WebDriver driver) {
        this.driver = driver;
        getElements();
    }

    /*
    Assigning each of the elements to their corresponding WebElement variable
     */
    private void getElements() {
        this.bookTitleText = driver.findElement(By.id("ListingTitleBox_TitleText"));
        this.bookListingExpiryText = driver.findElement(By.id("ClosingTime_ClosingTime"));
        this.bookPriceText = driver.findElement(By.id("BuyNow_BuyNow"));
        this.bookSellerText = driver.findElement(By.id("SellerProfile_MemberNicknameLink"));
    }

}
