import java.util.*;
import java.text.*;

public class Booking{
    String passengerName;
    int busNo;
    Date date;
    
    Booking(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the passenger: ");
        passengerName = sc.next();
        System.out.println("Enter the Bus number: ");
        busNo = sc.nextInt();
        System.out.println("Enter the date of travel: ");
        String dateInput = sc.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try{
            date = dateFormat.parse(dateInput); 
        }
        catch (ParseException e){
            e.printStackTrace();
        }
    }
    public boolean isAvailable(ArrayList<Booking> booking, ArrayList<Bus> buses){
        int capacity=0;
        for(Bus bu: buses){
            if(bu.busNo == busNo){
                capacity = bu.getCapacity();
            }
        }
        
        int booked = 0;
        for(Booking b:booking){
            if(b.busNo==busNo && b.date.equals(date)){
                booked++;
            }
        }
        
        return capacity>booked?true:false;
    }
    
}

