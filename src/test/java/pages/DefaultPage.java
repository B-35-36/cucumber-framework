package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DefaultPage {
    public DefaultPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//span[contains(@class, 'username')]")
    public WebElement userId;

    @FindBy(partialLinkText = "Hotel Management")
    public WebElement hotelManagementLink;

    @FindBy(partialLinkText = "Room reservations")
    public WebElement roomReservationsLink;

}
