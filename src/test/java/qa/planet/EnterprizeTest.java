package qa.planet;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class EnterprizeTest extends Config {
    @Test
    public void EnterprizeTest() {
        //На главной странице GitHub выберите меню Solutions->Enterprize с помощью команды hover для Solutions
        open("https://github.com");
        $(".Header-old").$(byText("Solutions")).click();
        $(".border-bottom").$(byText("Enterprise")).click();

        // Убедитесь что загрузилась нужная страница (например, что заголовок - "Build like the best.")
        $(".application-main ").shouldHave(text("Build like the best"));
    }
}
