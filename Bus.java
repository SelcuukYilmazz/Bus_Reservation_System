import java.util.Scanner;

	public class Bus 
	{
		Scanner scanner = new Scanner(System.in);
		private String plate;
		private int seatCount;
		private Seat[] seats;
		
		
		public Bus(String plate,int seatCount)
		{
			seats= new Seat[seatCount];
			this.plate = plate;
			this.seatCount= seatCount;
			for(int i=0; i<seatCount;i++)
			{
				seats[i] = new Seat(i,true);
			}
	
		}
		public  void bookSeat(int seatID,Passenger p)
			{	            
				if(seats[seatID-1].getStatus()==true)
				{
					Seat seat =new Seat(seatID,false,p);
			        System.out.println("");
			        seats[seatID-1] = seat ;
				}
				else {
					System.out.println("The seat has already reserved!");
				}
			}
		public void printAllPassengers()
		{
			for(int i=0;i<seatCount;i++)
			{
				if (seats[i].getStatus()==true)
					;
				else
					seats[i].display();
			}
			
		}
		public void printAllAvaliableSeatIDs()
		{
			for(int i=0;i<seatCount;i++)
			{
				if (seats[i].getStatus()==true)
					System.out.println(i+1);
				else
					;
			}
		}
		public  void search()
		{
			System.out.print("Enter Searchname: ");
			String searchname = scanner.nextLine();
			System.out.print("Enter Searchsurname: ");
			String searchsurname = scanner.nextLine();
		for (int i=0; i < seats.length; i++)
        {
			if(seats[i].getStatus() == false)
			{
	            if(seats[i].getPassenger().getName().equals(searchname) && seats[i].getPassenger().getSurname().equals(searchsurname))
	            {
	            seats[i].getPassenger().display();}
            }
        }
		}}

	
