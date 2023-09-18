import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class RegisterTest {
    WebDriver driver = new ChromeDriver();
    RegisterPage page = new RegisterPage(driver);

    @Test
    void test() {
        driver.get(page.getUrl());
        page
                .typeFirstName("Ivan")
                .typeLastName("Ivanov")
                .typeEmail("test@test.ru")
                .pickGender("Male")
                .typeMobile("1234567890")
                .pickBirthDate();
    }
}
