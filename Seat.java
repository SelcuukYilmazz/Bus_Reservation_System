public class Seat {private int seatID;
private boolean status;
private Passenger passenger;
public Seat(int seatID,boolean status,Passenger passenger)
{
	this.seatID=seatID;
	this.status=status;
	this.passenger=passenger;
}
public Seat(int seatID,boolean status)
{
	this.seatID=seatID;
	this.status=status;
}
public int getSeatID()
{
	return seatID;
}
public void setSeatID(int seatID)
{
	this.seatID=seatID;
}
public boolean getStatus()
{
	return status;
}
public void setStatus(boolean status)
{
	this.status=status;
}
public Passenger getPassenger()
{
	return passenger;
}
public void setPassenger()
{
	this.passenger=passenger;
}
public void display()
{
	
	System.out.print("Seat: "+seatID+" Status: ");
	if (status== true)
	{
		System.out.println("Avaliable");
	}
	else
	{
		System.out.println("Reserved");
	}
	this.getPassenger().display();
}

}
