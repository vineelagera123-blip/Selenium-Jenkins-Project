import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageTest {

    @Test
    public void testHomePageUrl() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/");

        String currentUrl = driver.getCurrentUrl();

        assertTrue(currentUrl.startsWith("https://www.selenium.dev/"));

        driver.quit();
    }
}