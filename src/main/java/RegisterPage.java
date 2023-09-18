import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class RegisterPage {
    WebDriver driver;

    public String getUrl() {
        return url;
    }

    private final String url = "https://demoqa.com/automation-practice-form";
    private final By firstName = By.id("firstName");
    private final By lastName = By.id("lastName");
    private final By email = By.cssSelector("#userEmail");
    private final By genderMale = By.cssSelector("#gender-radio-1");
    private final By genderFemale = By.cssSelector("#gender-radio-2");
    private final By genderOther = By.cssSelector("#gender-radio-3");
    private final By mobile = By.id("userNumber");
    private final By datepicker = By.id("dateOfBirthInput");
    private final By month = new By.ByXPath("//select/option[@value='0']");
    private final By year = new By.ByXPath("//select/option[@value='2000']");
    private final By date = new By.ByXPath("//div[@class='react-datepicker__day react-datepicker__day--007']");
    private final By subject = By.cssSelector("div[class*='value-container--is-multi']");
    private final By pictureDownloader = new By.ByXPath("//div/input[@type='file']");
    private final By currentAddress = By.id("currentAddress");
    private final By state = By.cssSelector("div#state");
    private final By city = By.cssSelector("div#city");
    private final By submitButton = By.id("submit");

    public RegisterPage(WebDriver driver) {
        driver = driver;
    }

    public RegisterPage typeFirstName(String firstName) {
        driver.findElement(this.firstName).click();
        driver.findElement(this.firstName).sendKeys(firstName);
        return this;
    }

    public RegisterPage typeLastName(String lastName) {
        driver.findElement(this.lastName).sendKeys(lastName);
        return this;
    }

    public RegisterPage typeEmail(String email) {
        driver.findElement(this.email).sendKeys(email);
        return this;
    }

    public RegisterPage pickGender(String gender) {
        switch (gender) {
            case "Male":
                driver.findElement(genderMale).click();
                break;
            case "Female":
                driver.findElement(genderFemale).click();
                break;
            case "Other":
                driver.findElement(genderOther).click();
                break;
            default:
                driver.findElement(genderMale).click();
        }
        return this;
    }

    public RegisterPage typeMobile(String number) {
        driver.findElement(mobile).sendKeys(number);
        return this;
    }

    public RegisterPage pickBirthDate() {
        driver.findElement(datepicker).click();
        driver.findElement(year).click();
        driver.findElement(month).click();
        driver.findElement(date).click();
        return this;
    }

    public RegisterPage typeSubject(String something) {
        driver.findElement(subject).sendKeys(something);
        return this;
    }

    public RegisterPage loadPicture() {
        driver.findElement(pictureDownloader).sendKeys("src/main/resources/picture.jpg");
        return this;
    }

    public RegisterPage typeCurrentAddress() {
        driver.findElement(currentAddress).sendKeys("abcdefg");
        return this;
    }

}
