package Hotel_App;/*Created by matthew
14/12/2023
 *COMMENTS ABOUT PROGRAM HERE
 *Created on 14/12/2023
 *COMMENTS ABOUT PROGRAM HERE
 */

abstract public class AbstractHotelRoom {
    public static void main(String[] args) {

    }
    private int roomNumber;
    private int GuestNumber;
    private String guestName;

    //double rates;

    abstract void displayAdditionalInfo();

    public AbstractHotelRoom() {
    }//default constructor

    public AbstractHotelRoom(int roomNumber, int guestNumber, String guestName) {
        super();
        this.roomNumber = roomNumber;
        GuestNumber = guestNumber;
        this.guestName = guestName;
    }

        public int getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    public int getGuestNumber() {
        return GuestNumber;
    }
    public void setGuestNumber(int guestNumber) {
        GuestNumber = guestNumber;
    }
    public String getGuestName() {
        return guestName;
    }
    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

}//class

