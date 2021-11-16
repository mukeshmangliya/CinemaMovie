import java.io.*;
        import java.util.*;
public class Cinema
{
    public static void main (String []args) throws NumberFormatException, IOException
    {

        Movie m = new Movie();
        Booking b[];
        b = new Booking[5];
        int k=0;
        while(k<5)
        {
            System.out.println("\n1. List Movie Hall with Movie Name\n2. Book your seats\n3. List Booking\n4. Revenue By Audi\n5. Total Revenue");
            Scanner sc=new Scanner(System.in);
            int n = sc.nextInt();
            switch(n)
            {
                case 1:
                    for ( int i =0; i<3 ; i++)
                    {
                        System.out.println("Movie Hall :" +Movie.Movie_Hall[i] +" \n"+" Movie Name :" + m.movieName[i] + " \n "+"Number Of Seats : " + m.No_Of_Seats[i] + "\n "+"Price :" + m.price[i]);
                    }
                    break;
                case 2:
                    b[k] = new Booking();
                    b[k].read();
                    k++;
                    break;
                case 3:
                    for(int l=0;l<k;l++)
                        b[l].show();
                    break;
                case 4:
                    for(int i=0;i<k;i++)
                        b[i].audishow();
                    break;
                case 5:
                    int totalRev = 0;
                    for(int i=0;i<k;i++)
                    {
                        totalRev += b[i].audiTotal();
                    }
                    System.out.print("Total Revenue By Audi :  "+totalRev);

                    break;


                default:
                    System.out.println("Wrong Key");
                    break;


            }
        }

    }
}
