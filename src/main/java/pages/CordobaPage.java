package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CordobaPage extends BasePage {

    By topPrice = By.xpath("//input[@data-testid='Maximum-price']");
    By submitPrice = By.xpath("//button[@data-testid='submit-price']");
    By orderPrice = By.xpath("//button[@aria-label='Más relevantes']");
    By lowerPrice = By.xpath("//span[text()='Menor precio']");
    By finalOrderLoc = By.xpath("//button[@aria-label='Menor precio']");
    By resultLoc = By.xpath("//form[@action='/search/alert']/../div/span");

    WebElement topPriceImput;
    WebElement submitPriceBtn;
    WebElement orderPriceBtn;
    WebElement finalOrder;
    WebElement result;

    public WebElement getTopPriceImput() {
        return topPriceImput;
    }
    public WebElement getFinalOrder() {
        finalOrder = elmPoint(finalOrderLoc);
        return finalOrder;
    }

    public WebElement getSubmitPriceBtn() {
        return submitPriceBtn;
    }

    public WebElement getOrderPriceBtn() {
        return orderPriceBtn;
    }

    public WebElement getOrderLowerPriceBtn() {
        return orderLowerPriceBtn;
    }

    WebElement orderLowerPriceBtn;


    public CordobaPage(WebDriver driver){
        super(driver);
    }

    public void setUpFilters(){
        topPriceImput = elmPoint(topPrice);
        topPriceImput.sendKeys("2000000");
        submitPriceBtn = elmPoint(submitPrice);
        submitPriceBtn.click();
        orderPriceBtn = elmPoint(orderPrice);
        orderPriceBtn.click();
        orderLowerPriceBtn = elmPoint(lowerPrice);
        orderLowerPriceBtn.click();


    }
    public String getResult (){
        result = elmPoint(resultLoc);
        return result.getText();
    }
}
