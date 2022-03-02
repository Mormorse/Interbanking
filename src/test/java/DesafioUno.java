import utility.DriverFactory;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class DesafioUno {
    private String url = "https://www.demoblaze.com/index.html";
    private WebDriver driver = DriverFactory.getDriver();

    @Test
    public void DesafioClaseUno() {
        driver.manage().window().maximize();
        driver.navigate().to(url);
        driver.quit();
    }
}
