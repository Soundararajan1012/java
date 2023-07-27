package palimorphism;
import java.util.Scanner;
public class delhi extends travel {
	public String Flight(String flight)
	{
		return flight;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		travel t1=new travel();
		Scanner sc=new Scanner(System.in);
		System.out.println("Transport Details");
		System.out.println("Enter Bus Name:");
		String bus=sc.next();
		bus +=sc.nextLine();
		System.out.println("Enter Car Name:");
		String car=sc.next();
		car +=sc.nextLine();
		System.out.println("Enter Train Name:");
		String train=sc.next();
		train +=sc.nextLine();
		System.out.println("Enter Ship Name:");
		String ship=sc.next();
		ship +=sc.nextLine();
		System.out.println("Enter Flight Name:");
		String flight=sc.next();
		flight +=sc.nextLine();
		
		System.out.println("\nDelhi Flight");
		delhi d=new delhi();
		System.out.println("Flight Name:");
		String flight1=sc.next();
		flight1 +=sc.nextLine();
		
		System.out.println("Bus Name:"+t1.Bus(bus));
		System.out.println("Car Name:"+t1.Car(car));
		System.out.println("Train Name:"+t1.Train(train));
		System.out.println("Ship Name:"+t1.Ship(ship));
		System.out.println("Flight Name:"+t1.Flight(flight));
		System.out.println("\nDelhi Flight Name:"+d.Flight(flight1));
		

	}


	
}
