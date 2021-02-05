import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Bus bus = new Bus("06 HUBM 06",42);
		Scanner scanner = new Scanner(System.in);
        int secim;
        while (true)
        {
        	
	        
			System.out.println(1+" Book a seat \n"+2+" Display all passengers with their seat numbers \n"+3+" Print all available seatIDs \n"+4+" Search \n"+5+" Exit");
			secim=scanner.nextInt(); 
			switch (secim) {
		        case 1 :
		        	scanner.nextLine();
		            System.out.print("Enter seatID: ");
		            int seatID = scanner.nextInt();
		            scanner.nextLine();
		            System.out.print("Enter name: ");
		            String name = scanner.nextLine();
		            
		            System.out.print("Enter surname: ");
		            String surname = scanner.nextLine();
		           
		            System.out.print("Enter gender: ");
		            String gender = scanner.nextLine();
		            
		            System.out.print("Enter countrycode: ");
		            String countrycode = scanner.next();
		            scanner.nextLine();
		            System.out.print("Enter code: ");
		            String code = scanner.nextLine();
		            
		            System.out.print("Enter type: ");
		            String type = scanner.nextLine();
		            
		            System.out.print("Enter number: ");
		            String number = scanner.nextLine();
		            Phone phone = new Phone(code,number,type,countrycode);
		            Passenger p = new Passenger( name, surname,gender, phone);
		        	bus.bookSeat(seatID,p);
		            break;
		            
		        case 2 :
		        	bus.printAllPassengers();
		            break;
	
		        case 3 :
		        	bus.printAllAvaliableSeatIDs();
		            break;
		        
		        case 4 :
		        	bus.search();
		        	break;
		        
		        case 5 :
		        	scanner.close();
		        	System.exit(0);
		        	break;
		        
			}
        }
	}	}

