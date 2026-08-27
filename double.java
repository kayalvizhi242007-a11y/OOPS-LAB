import java.util.Scanner;

public class KboatTemperature
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit: ");
        double f = in.nextDouble();
        double c = (f - 32) * 5.0 / 9.0;
        System.out.println(f + " degree Fahrenheit = " + c + " degree Celsius");
    }
}
