import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // adding bus details
        ArrayList<Bus> buses = new ArrayList<Bus>();
        buses.add(new Bus(01,true,20));
        buses.add(new Bus(02,false,30));
        buses.add(new Bus(03,true,26));

        // booking list
        ArrayList<Booking> bookings = new ArrayList<Booking>();

        // display bus details
        for(Bus bus :buses){
            bus.displayInfo();
        }
        int userOption = 1;

        while(userOption == 1){
            System.out.println("Enter 1 for Booking \n Enter 2 for Quit ");
            userOption = sc.nextInt();

            if(userOption == 1){
                Booking booking = new Booking();
                if(booking.isAvailable(buses,bookings)){
                    System.out.println("your booking is booked");
                }
                else{
                    System.out.println("Oops Sorry ! bus is full, Try another bus or date.");
                }
            }else {
                System.out.println("----------------------- Thank You -----------------------");
            }
        }
    }
}
