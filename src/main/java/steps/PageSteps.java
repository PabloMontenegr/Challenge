package steps;
import static org.testng.AssertJUnit.assertEquals;
import org.openqa.selenium.WebDriver;
import pages.CordobaPage;
import pages.HomePage;
import pages.ListOfCarsPage;
import pages.SubCategoryPage;



public class PageSteps {
    private WebDriver driver;
    HomePage homePage;
    SubCategoryPage subCategoryPage;
    ListOfCarsPage listOfCarsPage;
    CordobaPage cordobaPage;

    public PageSteps() {
        homePage = new HomePage(driver);
        driver = homePage.openChrome();
        homePage.visit();

    }


    public void searchVehicles() {
        homePage.aceptCookies();
        homePage.selectCategoryVehicle();

        listOfCarsPage = new ListOfCarsPage(driver);
    }

    public void goToCarsAndPickUps() {
        subCategoryPage = new SubCategoryPage(driver);
        subCategoryPage.selectCarsAndPickUps();

    }

    public void selectLocation() {
        listOfCarsPage = new ListOfCarsPage(driver);
        listOfCarsPage.location();
    }

    public void setUpFilter() {
        cordobaPage = new CordobaPage(driver);
        cordobaPage.setUpFilters();

    }
    public void aSert(){
        assertEquals("Menor precio",cordobaPage.getFinalOrder().getText());
    }
    public void resultCars (){
        System.out.println(cordobaPage.getResult());
    }
}



