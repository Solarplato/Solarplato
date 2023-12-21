package Hotel_App;/*Created by matthew
13/12/2023
 *COMMENTS ABOUT PROGRAM HERE
 *Created on 13/12/2023
 *COMMENTS ABOUT PROGRAM HERE
 */

public class Room extends AbstractHotelRoom {

    // what would be the attribute
    private int singleBed, doubleBed;
    private String roomNumber;
    private String roomCode;
    private String firstName, LastName;
    private String email;
    private int numGuests;
    private boolean KidsClub;
    private boolean stagNight;
    static int index = 000;

    static private int setRoomNumber() {
        int uniqueRoomNum = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 4));
        return index + randomNumber;
    }
    //return uniqueRoomNum;

//constructor
    public Room(int singleBed, int doubleBed, String roomNumber, String roomCode, String firstName, String lastName, String email, int numGuests) {
        this.singleBed = singleBed;
        this.doubleBed = doubleBed;
        this.roomNumber = roomNumber;
        this.roomCode = roomCode;
        this.firstName = firstName;
        LastName = lastName;
        this.email = email;
        this.numGuests = numGuests;
    }

    public String toString() {
        return "Room{" +
                "roomCode :" + roomCode +
                ", firstName :" + firstName +
                ", LastName :" + LastName +
                ", Email : " + email +
                ", numGuests : " + numGuests +
                '}';
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomCode :" + roomCode +
                ", firstName :" + firstName +
                ", LastName :" + LastName +
                ", Email : " + email +
                ", numGuests : " + numGuests +
                '}';

      //  System.out.println("");
    }
    public void displayAdditionalInfo() {
        System.out.println("Additional info for Room.");



    //static private int setRoomNumber(){
      //  int randomNumber = (int)(Math.random())*(10,3));
//return randomNumber;
    }//setAccountNumber

    //public static void main(String)

    // all rooms have beds
    // bed - private singleBed
    // bathrooms
    // view
    // roomNumber
    // FireAlarm
    // services
    // breakfast

    //methods
    //print info
    // input of new guest
    // reading CSV of guess
    // create your own ideas- 

}//class