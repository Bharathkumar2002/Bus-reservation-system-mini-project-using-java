import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    ArrayList<Bus> buses = new ArrayList<Bus>();
	    ArrayList<Booking> booking = new ArrayList<Booking>();
	    
	    buses.add(new Bus(1,true,2));
	    buses.add(new Bus(2,false,5));
	    buses.add(new Bus(3,true,10));
	    
	    for(Bus bus:buses){
	        bus.displayInfo();
	    }
	    
		int userInput = 1;
		Scanner sc = new Scanner(System.in);
		while(userInput==1){
		    System.out.println("Press 1 to Book and Press 2 to exit");
		    userInput = sc.nextInt();
		    if(userInput==1){
		        Booking book = new Booking();
		        if(book.isAvailable(booking,buses)){
		            booking.add(book);
		            System.out.println("Your ticket booking is confirmed. Happy journey !!!");
		        }
		        else{
		            System.out.println("Sorry !!! Bus is unavailable. Try another date or Bus.");
		        }
		    }
		    else{
		        System.out.println("Thank you");
		    }
		}
	}
}
