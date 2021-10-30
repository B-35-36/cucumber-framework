package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.DefaultPage;
import pages.RoomReservationPage;

public class Day20_Room_Reservation_Step_Definitions {

    DefaultPage defaultPage = new DefaultPage();
    RoomReservationPage roomReservationPage=new RoomReservationPage();
    @Given("user navigates to the create_room_reservation page")
    public void user_navigates_to_the_create_room_reservation_page() {
        defaultPage.hotelManagementLink.click();
        defaultPage.roomReservationsLink.click();
        roomReservationPage.addRoomReservationButton.click();

    }

}
