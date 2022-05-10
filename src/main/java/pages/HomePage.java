package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    By categorias = By.xpath("//a[text()='Categorías']");

    By vehiculos = By.xpath("//a[text()='Vehículos']");

    By autosYCamionetas = By.xpath("//img[@alt='Autos y Camionetas ']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void selectCategoryVehicle() {
        WebElement categoriaBtn = elmPoint(categorias);
        moveTo(categoriaBtn);
        waiting(vehiculos);
        WebElement vehiculosBtn = elmPoint(vehiculos);
        vehiculosBtn.click();
        waiting(autosYCamionetas);


    }


}