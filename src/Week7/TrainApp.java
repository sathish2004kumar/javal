package Week7;

import java.util.ArrayList;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale.IsoCountryCode;

public class TrainApp {
	static int availableTickets=3,upper=1,lower=1,middle=1,wlLimit=0;
	static int pid=1;
	static List<Passenger> bkdPassengers=new ArrayList<Passenger>();
	static List<Passenger> wlPassengers=new ArrayList<Passenger>();

	public static void main(String[] args) {
		System.out.println("Welcome to Train Tickets Booking");
		Scanner s = new Scanner(System.in);
		String isContinue = "Y";
		while(isContinue.equalsIgnoreCase("Y")) {
		System.out.println("1.Booking\n2.Cancel\n3.view\n4.wl status");
		System.out.println("Enter your Choice");
		int choice = s.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Enter your name");
			s.nextLine();
			String pname = s.nextLine();
			
			Berth berth=null;
			while(true) {
				try {
					System.out.println("Enter your prefberth"+Arrays.toString(Berth.values()));
					String prefberth = s.nextLine();
					 berth=Berth.valueOf(prefberth);
					break;
				}
				catch(Exception e) {
					System.out.println("Invalid enum");
					
				}
			}
			Passenger p = new Passenger();
			p.setPid(pid);
			p.setPassengername(pname);
			p.setPreferBerth(berth);
			bookTicket(p);
			pid++;
			break;
		
		case 2:
			System.out.println("Enter your pId");
			int passId = s.nextInt();
			cancelTicket(passId);
			break;
			
		case 3:
			System.out.println("Waiting list passengers"+wlPassengers);
			System.out.println("Booked passengers"+bkdPassengers);
			break;
		
		case 4:
			System.out.println("Enter your pId");
			int checkId = s.nextInt();
			List<Passenger> isWlPass = wlPassengers.stream()
					.filter(e->e.getPid()==checkId)
					.collect(Collectors.toList());
			
			if (isWlPass != null && !isWlPass.isEmpty()) {
					System.out.println("Passenger name: " + isWlPass.get(0).getPassengername());
		            System.out.println("Booked WL limit: " + isWlPass.get(0).getBkd());
		            System.out.println("Current WL limit: " + isWlPass.get(0).getCurrentlimit());
		        } else {
		            wlPassengers.forEach(e -> e.setCurrentlimit(wlLimit));
		            System.out.println("not valid this ID");
		        }
		
			break;
			
			
			
		
			
		default:
			System.out.println("Invalid option");
			}
		System.out.println("Do you want to continue Y/N");
		isContinue=s.next();
		}
		}
	
			
		


		private static void cancelTicket(int passId) {
		List<Passenger> isBkdPass = bkdPassengers.stream()
				.filter(e->e.getPid()==passId)
				.collect(Collectors.toList());
		
		List<Passenger> isWlPass = wlPassengers.stream()
				.filter(e->e.getPid()==passId)
				.collect(Collectors.toList());
		if(isBkdPass!=null && !isBkdPass.isEmpty()){
			
			if(wlLimit>0) {
				System.out.println("There are person is wl");
				wlPassengers.get(0).setAllocatedBerth(isBkdPass.get(0).getAllocatedBerth());
				bkdPassengers.removeIf(e->e.getPid()==passId);
				bkdPassengers.add(wlPassengers.get(0));
				System.out.println("Your Ticket got confirmed"+wlPassengers.get(0).getPassengername());
				wlPassengers.remove(0);
				wlPassengers.forEach(e->e.setCurrentlimit(e.getCurrentlimit()-1));
				wlLimit--;
				
			} else {
				bkdPassengers.removeIf(e->e.getPid()==passId);
				if(isBkdPass.get(0).getAllocatedBerth().equals(Berth.UPPER))
					upper++;
				else if(isBkdPass.get(0).getAllocatedBerth().equals(Berth.MIDDLE))
					middle++;
				else {
					lower++;
				availableTickets++;
			}}}
			
		else if(isWlPass!=null && !isWlPass.isEmpty()){
			System.out.println("Cancelling wl Passenger");
			wlPassengers.removeIf(e->e.getPid()==passId);
			wlLimit--;
	}else {
		System.out.println("Invalid Passenger");
	}
		}

		static void allocatedBerth(Passenger p) {
			switch(p.getPreferBerth()) {
			case UPPER:
				if (upper>0) {
					p.setAllocatedBerth(Berth.UPPER);
					upper--;
				}
			
				else if (middle>0) {
					p.setAllocatedBerth(Berth.MIDDLE);
					middle--;
			}
			
				else {
					p.setAllocatedBerth(Berth.LOWER);
					lower--;
		}
				break;
				
			
			case MIDDLE:
				if (middle>0) {
					p.setAllocatedBerth(Berth.MIDDLE);
					middle--;
				}
			
				else if (lower>0) {
					p.setAllocatedBerth(Berth.LOWER);
					lower--;
			}
				else {
					p.setAllocatedBerth(Berth.UPPER);
					upper--;
				}
			
				break;
		
				
			case LOWER:
				if (lower>0) {
					p.setAllocatedBerth(Berth.LOWER);
					lower--;
				}
				else if (upper>0) {
					p.setAllocatedBerth(Berth.UPPER);
					lower--;
			}
				else {
					p.setAllocatedBerth(Berth.MIDDLE);
					middle--;
				}
			
				break;
			}
			bkdPassengers.add(p);
			availableTickets--;
			}
				
	private static void bookTicket(Passenger p) {
		if(availableTickets >0) {
			allocatedBerth(p);
			p.setBkdt(LocalDateTime.now());
			System.out.println("Ticket Booked");
			}
		
		else if (wlLimit <3) {
			wlPassengers.add(p);
			p.setCurrentlimit(wlLimit);
			wlLimit++;
			System.out.println("Ticket is waiting list");
			}
		else {
			System.out.println("regret");
		}

	}

	
		
	}


