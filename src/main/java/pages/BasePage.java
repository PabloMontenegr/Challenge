package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;


public  class BasePage {
    private WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }


    public WebDriver openChrome() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("disable-infobars");
        driver = new ChromeDriver(opt);
        driver.manage().window().maximize();
        return driver;
    }

    public void visit() {
        driver.get("https://www.mercadolibre.com.ar");
    }

    public void aceptCookies() {
        By cookies_accept = By.xpath("//button[text()='Entendido']");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(cookies_accept)).click();
    }

    public void waitFor(By loc) {
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.presenceOfElementLocated(loc));
    }

    public void moveTo(WebElement elm) {
        Actions moveTo = new Actions(driver);
        moveTo.moveToElement(elm).build().perform();
    }

    public WebElement elmPoint(By loc) {
        WebElement elm = driver.findElement(loc);
        return elm;
    }

    public void waiting(By loc) {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.presenceOfElementLocated(loc));
    }
    public void waitingClick(By loc){
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(loc));

    }

    public List<WebElement> ListOfElements(By loc) {
        List<WebElement> elms = driver.findElements(loc);
        return elms;
    }

    public WebElement locFromList(List<WebElement> elms) {
        return elms.get(elms.size()-1);
    }
    public void keyDown(int b){
        Actions act = new Actions(driver);
        for (int i = 0 ; i < b ; i++){
            act.sendKeys(Keys.ARROW_DOWN).perform();

        }
    }
}


