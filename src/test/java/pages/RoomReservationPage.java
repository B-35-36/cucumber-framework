package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RoomReservationPage {
    public RoomReservationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[@class='hidden-480']")
    public WebElement addRoomReservationButton;

    @FindBy(id = "IDUser")
    public WebElement idUser;

    @FindBy(id = "IDHotelRoom")
    public WebElement idHotelRoom;

    @FindBy(id = "Price")
    public WebElement price;

    @FindBy(id = "DateStart")
    public WebElement dateStart;

    @FindBy(id = "DateEnd")
    public WebElement dateEnd;

    @FindBy(id = "AdultAmount")
    public WebElement adultAmount;

    @FindBy(id = "ChildrenAmount")
    public WebElement childrenAmount;

    @FindBy(id = "ContactNameSurname")
    public WebElement contactNameSurname;

    @FindBy(id = "ContactPhone")
    public WebElement contactPhone;

    @FindBy(id = "ContactEmail")
    public WebElement contactEmail;

    @FindBy(id = "Notes")
    public WebElement notes;

    @FindBy(id = "Approved")
    public WebElement isApproved;

    @FindBy(id = "IsPaid")
    public WebElement isPaid;

    @FindBy(id = "btnSubmit")
    public WebElement submitButton;

    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement successMessage;

    @FindBy(xpath = "//button[@data-bb-handler='ok']")
    public WebElement okButton;

}
