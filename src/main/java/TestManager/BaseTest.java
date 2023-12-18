package TestManager;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class BaseTest {


   public static WebDriver driver ;


   @Before
    public void setUp () {
       driver = DriverSetup.initialize_Driver();
   }

   public static void navigateToUrl () {
       driver.get(IDriver.URL);
   }

   @After
    public void tearDown () {
       if (driver != null) {
           driver.close();
       }

   }
}
