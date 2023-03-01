package apps.testing.home.definitions;


import apps.testing.home.base.BrowserConfig;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.Duration;

public class BrowsingFindHouse {

    protected WebDriver driver;
    protected WebDriverWait wait;

    @Before
    public void initDriverWeb(){
       ApplicationContext context = new AnnotationConfigApplicationContext(BrowserConfig.class);
       driver = context.getBean(WebDriver.class);
       wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Given("browse to rumah123 website")
    public void openTheBrowser() throws InterruptedException {
        driver.get("http://www.rumah123.com");
        Thread.sleep(3000);
    }

    @And("search rumah location {string}")
    public void browseLocationHouseByKey(String location) throws InterruptedException {
        By xpathSearchKey = By.xpath("//ul[@class='flex flex-wrap']/li/input");
        wait.until(ExpectedConditions.visibilityOfElementLocated(xpathSearchKey)).sendKeys(location);
        wait.until(ExpectedConditions.visibilityOfElementLocated(xpathSearchKey)).sendKeys(Keys.ENTER);
        //Thread.sleep(5000);
    }

    @And("click button filter")
    public void clickFilterButton() throws InterruptedException {
        //By xpathFilter = By.xpath("//span[text()='&nbsp;<!-- -->Filter']");
        //wait.until(ExpectedConditions.visibilityOfElementLocated(xpathFilter)).click();
        //By xpathFilterHouse = By.xpath("//span[@title='Rumah']");
        //wait.until(ExpectedConditions.visibilityOfElementLocated(xpathFilterHouse)).click();
        //Thread.sleep(3000);
    }

    @And("click filter house")
    public void clickFilterHouse() throws InterruptedException {
        //Thread.sleep(10000);

        //driver.findElement(By.xpath("//label[contains(@text(),'Rumah')]")).click();
        //Scroll down till the bottom of the page
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0,document.body.scrollHeight*0.75)");
        //Thread.sleep(3000);
    }

    @And("click filter three bedrooms")
    public void clickFilterThreeBedrooms() throws InterruptedException {
        //driver.findElement(By.xpath("//label[@text='>2 Kamar']")).click();
        //Thread.sleep(3000);
    }

    @Then("click apply filter")
    public void clickApplyFilter() throws InterruptedException {
        //driver.findElement(By.className("ui-atomic-button--children")).click();
        //Thread.sleep(3000);
    }

    @When("check the result less than 1000")
    public void validateResult(){
       //String[] result = driver.findElement(By.className("ui-atomic-text ui-atomic-text--styling-default ui-atomic-text--typeface-primary upper-pagination")).getText().split(" ");
       //assert Integer.parseInt(result[0])<3300;
    }

    @After
    public void dispatchConfig(){
        //driver.quit();
    }
}



