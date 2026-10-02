import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    @Test
    public void testWebsiteTitle() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/");

        String title = driver.getTitle();

        assertTrue(title.contains("Selenium"));

        driver.quit();
    }
}