package qa.planet;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class JUnit5Test extends Config{
    @Test
    public void CodeForJUnit5() {

        // Откройте страницу Selenide в Github
        open("https://github.com/selenide/selenide");
        // Перейдите в раздел Wiki проекта
        $("#wiki-tab").click();
        // Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $(byText("Show 2 more pages…")).click();
        $("#wiki-pages-box").shouldHave(text("SoftAssertions"));
        //Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
        $("#wiki-pages-box").$("a[href^=\"/selenide/selenide/wiki/SoftAssertions\"]").click();
        $(".markdown-body").shouldHave(text("3. Using JUnit5 extend test class:"));
    }
}
