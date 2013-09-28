package lab01;

import java.lang.reflect.Array;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<Integer, List<Passenger>> passengersByFlight = new TreeMap<Integer, List<Passenger>>();
		List<Passenger> listPassenger = new ArrayList<Passenger>();
		String flag="Yes";

		while(flag.equals("Yes")){ 
			Passenger passenger = new Passenger();
			System.out.println("Please, put in passenger's name:");
			String name = scanner.next();
			passenger.setName(name);
			System.out.println("Put in his pasport's number:");
			String passportNumber = scanner.next();
			passenger.setPassportNumber(passportNumber);
			System.out.println("Put in number of flight:");
			int flightNumber = scanner.nextInt();			
			if(passengersByFlight.get(flightNumber)==null){
				listPassenger = new ArrayList<Passenger>();};			
			listPassenger.add(passenger);
			passengersByFlight.put(flightNumber,listPassenger);
			System.out.println("Would you put in one more passenger?(Yes/No)");
			flag = scanner.next();
		};
		
		for (int number : passengersByFlight.keySet()) {

			listPassenger = passengersByFlight.get(number);
			Collections.sort(listPassenger);
			System.out.println();
			System.out.println("Information about flight ¹" + number + ":");
		
			for (Passenger passenger : listPassenger) {				
				System.out.println("  Passengers (Name/pasport's number):");
				System.out.print("    " + passenger.getName());
				System.out.println(" / " + passenger.getPassportNumber());
			}
			;
			System.out.println("Passenger's count on flight ¹" + number + ":" + listPassenger.size());
		}
		;
	}

}
