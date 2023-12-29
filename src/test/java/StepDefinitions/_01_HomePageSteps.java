package StepDefinations;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class _01_HomePageSteps {
    DialogContent dc = new DialogContent();


    @Given("Navigate to Getir Home Page")
    public void navigateToGetirHomePage() throws InterruptedException {
        GWD.getDriver().get("https://getir.com/");

    }

    @And("Click on the GetirFood")
    public void clickOnTheGetirFood() {
        dc.clickFunction(dc.getirfood);
    }

    @Then("Navigate to GetirFoodPromo")
    public void navigateToGetirFoodPromo() {
        GWD.getDriver().get("https://getir.com/yemek/kampanyalar/");
    }
}


