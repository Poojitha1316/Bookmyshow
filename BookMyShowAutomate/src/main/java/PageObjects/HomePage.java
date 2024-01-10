package PageObjects;

import BaseTest.BaseTestClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseTestClass {

    @FindBy(xpath = "//*[@placeholder='Search for your city']")
    WebElement clickOnSearchBar;

    @FindBy(xpath = "//*[@id=\"modal-root\"]/div/div/div/div[1]/div[2]/div/ul/li/span/strong")
    WebElement selectCity;

    public HomePage() {
        PageFactory.initElements(driver,this);
    }
    public void selectLocation() {
        clickOnSearchBar.click();
        clickOnSearchBar.sendKeys("Mumbai");
        selectCity.click();
    }
}
