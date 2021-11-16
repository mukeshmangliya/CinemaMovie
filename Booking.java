
import java.io.*;
        import java.util.*;
class Booking extends Movie
{
    protected String Name;
    protected String Email;
    protected double Phone;
    protected int Audi;
    protected int Seat;
    int audirevenue;
    public void read() throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        Name = sc.next();
        System.out.println("Enter your email: ");
        Email = sc.next();
        System.out.println("Enter your phone number: ");
        try {
            Phone = sc.nextDouble();
            System.out.println("Which Audi do you want to go?");
            System.out.println("Press 1 for Audi - A1\n Press 2 for Audi -A2\n Press 3 for Audi -A3");
            Audi = sc.nextInt();
            System.out.println("No. of seats you want to book");
            Seat = sc.nextInt();
            if(No_Of_Seats[Audi-1] < Seat)
            {
                System.out.println("Oops!! There are " + No_Of_Seats[Audi-1] + " available seats for " + movieName[Audi-1]);

            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Thanks for your Important time");
        }

        No_Of_Seats[Audi-1] = No_Of_Seats[Audi-1] - Seat;
    }
    public void show()
    {
        System.out.println("Name :"+Name + " Email :" + Email+" Phone Number :" + Phone+"Movie Name :"+ movieName[Audi-1]+"Booking Seat :" + Seat);
    }
    public void audishow() {
        audirevenue=Seat*price[Audi-1];
        System.out.println("Revenue Collected By  "+  Movie.Movie_Hall[Audi-1]+" is "+audirevenue);

    }
    public int audiTotal()
    {
        return Seat*price[Audi-1];
    }
}

