import utility.DriverFactory;
import Utility.PropertiesFile;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class DesafioUno {
    private String url = PropertiesFile.getProperty("url");
    private WebDriver driver = DriverFactory.getDriver();

    @Test
    public void DesafioClaseUno() {
        driver.manage().window().maximize();
        driver.navigate().to(url);
        driver.quit();
    }
}
