import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Booking {
    String passengerName ;
    int busNo;
    Date date;

    Booking(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name of passenger :");
        passengerName = sc.next();

        System.out.println("Enter the bus number :");
        busNo = sc.nextInt();

        System.out.println("Enter the date (dd/mm/yyyy) : ");
        String dateform = sc.next();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            date = formatter.parse(dateform);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }



    }

    public boolean isAvailable(ArrayList<Bus> buses, ArrayList<Booking> booking) {
        int capacity =0 ;

        for(Bus bus : buses){
            if(bus.getBusNo() == busNo){
                capacity = bus.getCapacity();
            }
        }

        int booked =0;
        for(Booking b : booking){
            if(b.busNo == busNo && b.date == date){
                booked++;
            }
        }

        return booked < capacity;
    }

}
