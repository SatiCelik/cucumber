package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    public AmazonPage() {
        PageFactory.initElements(Driver.getDriver(), this);


    }
    @FindBy(name = "two")
    public WebElement amazonSearchBox;

    @FindBy(xpath = "//div[@class='sg-col-inner']")
    public WebElement amazonResult;
}


