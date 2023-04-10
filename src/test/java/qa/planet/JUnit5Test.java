package qa.planet;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class JUnit5Test {
    @Test
    public void CodeForJUnit5() {
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
        Configuration.timeout = 5000;

        // Откройте страницу Selenide в Github
        open("https://github.com/selenide/selenide");
        // Перейдите в раздел Wiki проекта
        $("#wiki-tab").click();
        // Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $(byText("Show 2 more pages…")).click();
        $("li:nth-child(17) details summary div span a").shouldHave(text("SoftAssertions"));
        //Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
        $("li:nth-child(17) details summary div span a").click();
        $("div.markdown-body h4").sibling(5).shouldHave(text("3. Using JUnit5 extend test class:"));
        //$("div.markdown-body").$("h4").sibling(5).shouldHave(text("3. Using JUnit5 extend test class:"));
    }

    //Есть ли разница между $("h1 div"); и $("h1").$("div"); - может ли привести к тому что, поиск найдёт разные элементы?
    //Если может - приведите пример, когда.
}
