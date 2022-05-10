package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ListOfCarsPage extends BasePage {

    By list = By.xpath("//div[text()='Ubicación']/following-sibling::ul/li");
    By searchCity = By.xpath("//input[@data-testid='search_bar']");
    By resultCity = By.cssSelector("span.ui-search-search-modal-filter-name");
    List<WebElement> listing;
    WebElement mostrarMasBtn;
    WebElement inputCity;
    WebElement cordobaBtn;



    public ListOfCarsPage(WebDriver driver){
        super(driver);
    }
    public void location (){
        listing = ListOfElements(list);
        mostrarMasBtn = listing.get(listing.size()-1);
        mostrarMasBtn.findElement(By.tagName("a")).click();
        waiting(searchCity);
        inputCity = elmPoint(searchCity);
        inputCity.sendKeys("Cordoba");
        waiting(resultCity);
        cordobaBtn = elmPoint(resultCity);
        waitingClick(resultCity);
        cordobaBtn.click();




    }

}
