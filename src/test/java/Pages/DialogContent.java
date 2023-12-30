package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DialogContent extends Parent {
    // POM: Page Object Model
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }


    @FindBy(xpath = "//*[@alt='GetirYemek']")
    public WebElement getirfood;

    @FindBy(xpath = "//*[@name='chevron-down']")
    public WebElement myprofile;

    public WebElement getWebElement(String strButton) {

        switch (strButton) {
            case "getirfood":
                return getirfood;
            case "myprofile":
                return myprofile;
        }
        return null;
    }


}
