package StepDefinations;


import Pages.Parent;
import Utilities.GWD;
import io.cucumber.java.en.When;
import org.openqa.selenium.Cookie;

import java.util.Date;

public class _03_LoginSteps extends Parent {

    @When("Login With Phone Number")
    public void loginWithPhoneNumber() {
        GWD.getDriver().manage().addCookie(new Cookie("defaultToken","17038475850246f443b59a2fd25b9bc296d227515dd263aa34db11f70642c1563ab52eddd6612","getir.com","/",new Date(new Date().getTime() + 3600 * 1000),true,true));
        GWD.getDriver().manage().addCookie(new Cookie("refreshToken","e83b92e4-52da-4f4d-9234-a54b5ef3b724","getir.com","/", new Date(new Date().getTime() + 3600 * 1000),true,true));
        GWD.getDriver().manage().addCookie(new Cookie("accessToken","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbmNyeXB0ZWREYXRhIjoiV0xpSnlZTjR5dGFXeXlyOW9JRjJSSnRnZW4vajNmaG54UU5wdDA1dFhMNXVtTXFrNjFDRTBjUENpQjFIUFFYT2UvZFp4UmwyYjZiQ2dyOUQ2R3dNNllNTTFuZFFjMW54QzRMTWFDeGVzU2NxRTloUmErSDhKUTNRNTlIZVBickkrYlZXc3Eza2JUS0gxaEwwaTF1S3duNzV2ME1kMDFxSFBESmo4eDdLeXdvaHRHdmRITDhkY3VtUmlqV0QyaXQ2RU1xcnVxeUdXTHdYdkEzQjQxNXpMVk15TFRMNzMzbmEybFRrOHJhUWZiY3ZDQ0QrbnNPQTgvVUtaa2ViVjI3ZWdZNnNMdDRucmRTOVdDbDI5VEw2S1E9PSIsImlhdCI6MTcwMzg0NzU4NSwiZXhwIjoxNzAzODc2Mzg1LCJpc3MiOiJhdXRoLXNlcnZpY2UifQ.nFoNhwCRVRHrRK1-M3d0xSsjA9fZR-iTb6DMbMLm8YM","getir.com","/",new Date(new Date().getTime() + 3600 * 1000),true,true));
        GWD.getDriver().manage().addCookie(new Cookie("accessTokenExpiresAt","1703876385","getir.com","/",new Date(new Date().getTime() + 3600 * 1000)));

    }
}
