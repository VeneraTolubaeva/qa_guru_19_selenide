package qa.planet;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class Config {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        //Configuration.browser = "chrome";
        Configuration.holdBrowserOpen = true;
        Configuration.timeout = 5000;
    }
}
