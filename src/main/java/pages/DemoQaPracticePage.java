package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Printer;
import utils.WebUtilities;
import utils.driver.Driver;

import java.time.Duration;

public class DemoQaPracticePage extends WebUtilities {

    Printer log = new Printer(DemoQaPracticePage.class);


    @FindBy(id = "firstName")
    public WebElement firstNameInput;

    @FindBy(id = "lastName")
    public WebElement lastNameInput;

    @FindBy(id = "userEmail")
    public WebElement userEmailInput;

    @FindBy(xpath = "//input[@id='gender-radio-1']/following-sibling::label")
    public WebElement maleInput;

    @FindBy(xpath = "//input[@id='gender-radio-2']/following-sibling::label")
    public WebElement femaleInput;

    @FindBy(xpath = "//input[@id='gender-radio-3']/following-sibling::label")
    public WebElement otherInput;

    @FindBy(id = "userNumber")
    public WebElement mobileInput;

    @FindBy(id = "dateOfBirthInput")
    public WebElement dateOfBirthInput;

    @FindBy(id = "subjectsInput")
    public WebElement subjectsInput;

    @FindBy( id= "hobbies-checkbox-1")
    public WebElement sports;

    @FindBy(xpath = "//input[@id='hobbies-checkbox-2']/following-sibling::label")
    public WebElement reading;

    @FindBy(xpath = "//input[@id='hobbies-checkbox-3']/following-sibling::label")
    public WebElement musicCheckbox;

    @FindBy(xpath = "//input[@id='uploadPicture']")
    public WebElement uploadPictureButton;

    @FindBy(id = "currentAddress")
    public WebElement currentAddressInput;

    @FindBy(xpath = "//*[@id='state']")
    public WebElement selectStateDropdown;

    @FindBy(xpath = "//*[@id='city']")
    public WebElement selectCityDropdown;

    @FindBy(id = "submit")
    public WebElement submitButton;

    public void selectCity(String city) {
        WebDriverWait wait = new WebDriverWait(Driver.driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='city']//div[contains(text(),'"+city+"')]")));
        element.click();
    }

    public void selectState(String state) {
        WebDriverWait wait = new WebDriverWait(Driver.driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='state']//div[contains(text(),'"+state+"')]")));

        element.click();
    }
    public void setBirthDate(String date){
        dateOfBirthInput.click();
        dateOfBirthInput.sendKeys(Keys.chord(Keys.CONTROL, "A") + date);
        dateOfBirthInput.sendKeys(Keys.ESCAPE);
    }

    public void pressEnter() {
        subjectsInput.sendKeys(Keys.ENTER);
    }


    public void clearInputField(WebElement element, String date){ //overload
        int textLength = element.getAttribute("value").length();
        for(int i = 0; i < textLength; i++){
            element.sendKeys(Keys.ARROW_LEFT);
            if(i==textLength-1){
                break;
            }
            element.sendKeys(Keys.DELETE);}

        element.sendKeys(date+Keys.DELETE);

    }

    public void scrollIntoViewByXpath(String xpath) {
        WebElement element = Driver.driver.findElement(By.xpath(xpath));
        JavascriptExecutor js = ((JavascriptExecutor) Driver.driver);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }





}
