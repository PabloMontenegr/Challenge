package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SubCategoryPage extends BasePage {


    By autosYCamionetas = By.xpath("//img[@alt='Autos y Camionetas ']");
    By nextPage = By.xpath("//h1[text()='Autos y Camionetas']");

    public SubCategoryPage(WebDriver driver){
        super(driver);

    }

    public void selectCarsAndPickUps(){
        WebElement elm = elmPoint(autosYCamionetas);
        elm.click();
        waiting(nextPage);
    }
}
