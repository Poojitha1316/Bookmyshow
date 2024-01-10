package PageObjects;

import BaseTest.BaseTestClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecommendedMoviesForCityPage extends BaseTestClass {

    @FindBy(xpath = "//*[text()='Comedy/Drama']")
    WebElement selectSpecificMovie;

    @FindBy(xpath = "//*[@id=\"page-cta-container\"]/button/div/span")
    WebElement clickOnBookTicket;

    @FindBy(xpath = "//*[@data-session-id='31824']")
    WebElement selectTime;

    public RecommendedMoviesForCityPage(){
        PageFactory.initElements(driver,this);
    }

    public void selectMovie(){
        selectSpecificMovie.click();
        clickOnBookTicket.click();
        selectTime.click();
    }
}
