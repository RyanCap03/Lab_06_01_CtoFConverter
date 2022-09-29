import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double cel;
        double far;

        System.out.print("Enter your celsius  Temperature: ");

        if(in.hasNextDouble())
        {
            cel = in.nextDouble();
            in.nextLine();
            far = (cel * 1.8) + 32;
            System.out.println("The temperature you entered in celsius is " + far + " degrees fahrenheit");
        }
        else
        {
            System.out.println("That is not the correct input!");
        }

    }
}