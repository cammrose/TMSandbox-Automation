package StepDefs;

import Pages.AvengersBookListingPage;
import Pages.BooksPage;
import Pages.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefs {

    WebDriver driver;
    static final String TRADEMEURL = "https://tmsandbox.co.nz";

    //Page Objects
    HomePage homePage;
    BooksPage booksPage;
    AvengersBookListingPage avengersBookListingPage;

    @Before
    public void initailiseBrowser() {
        //Defining the project path to the chromedriver executable
        String projPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projPath + "/src/test/resources/Drivers/chromedriver");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Given("I open to the TradeMe Sandbox landing page")
    public void i_open_to_the_trade_me_sandbox_landing_page() {

        driver.navigate().to(TRADEMEURL);

    }

    @And("I navigate to the books results page")
    public void i_navigate_to_the_books_results_page() {
        //Home page actions
        homePage = new HomePage(driver);
        homePage.booksButton.click();
    }

    @When("I Select a book after a query")
    public void iSelectABookAfterAQuery() {
        //Books page actions
        booksPage = new BooksPage(driver);
        booksPage.locationFilterDropdown.selectByVisibleText("Wellington");
        booksPage.getElements(); //Finding the elements again of the books page since the filter has changed the state of the page.
        booksPage.comicGraphicNovelsButton.click();
        booksPage.getElements();

        booksPage.avengersListingButton.click();

    }

    @Then("I see the books title, listing expiry, price and seller")
    public void i_see_the_books_title_listing_expiry_price_and_seller() {
        //Avengers listing actions
        avengersBookListingPage = new AvengersBookListingPage(driver);
        String listing = avengersBookListingPage.bookTitleText.getText();
        String expiry = avengersBookListingPage.bookListingExpiryText.getText();
        String price = avengersBookListingPage.bookPriceText.getText();
        String seller = avengersBookListingPage.bookSellerText.getText();

        //Assertions to check if the correct listing details are displayed.
        Assert.assertEquals("The listing name should be " + listing, listing, "The Avengers");
        Assert.assertEquals("The listing expriry should be " + expiry, expiry, "Wed 3 Nov, 9:31 am");
        Assert.assertEquals("The listing price should be " + price, price, "$15.00");
        Assert.assertEquals("The listing seller should be " + seller, seller, "tender1978trap");

    }

    @After
    public void closedDriver() {
        driver.close();
    }


}
