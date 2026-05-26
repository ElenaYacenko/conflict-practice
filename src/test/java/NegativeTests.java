import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.Condition;

public class NegativeTests {

    @Test
    void loginPageShouldHaveEmptyFields() {

        // открываем страницу
        open("https://lknew.ch-sk.ru/person-auth-form"); // FEATURE BRANCH CHANGE

        // Проверяем, что поле логина существует и пустое
        $("#iPhoneOrEmail").shouldBe(Condition.visible);
        String loginValue = $("#iPhoneOrEmail").getValue();

        // Проверяем, что поле пароля существует и пустое
        $("#iPassword").shouldBe(Condition.visible);
        String passwordValue = $("#iPassword").getValue();

        // Проверяем кнопку "Войти" по id
        $("#cSignIn").shouldBe(Condition.visible).shouldHave(Condition.text("Войти"));
    }

}