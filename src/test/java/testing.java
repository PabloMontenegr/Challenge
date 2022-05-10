
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.SubCategoryPage;
import steps.PageSteps;

public class testing {

    private WebDriver driver;
    PageSteps pageSteps;
    SubCategoryPage subCategoryPage;


    @BeforeSuite
    public void setUp() {
        PageSteps pageSteps = new PageSteps();
        this.pageSteps = pageSteps;

    }



    @Test
    public void test() {
        pageSteps.searchVehicles();
        pageSteps.goToCarsAndPickUps();
        pageSteps.selectLocation();
        pageSteps.setUpFilter();
        pageSteps.aSert();
        pageSteps.resultCars();

    }


}

