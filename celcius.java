import java.util.Scanner;
class convert{
  void celsiusToothers(double c){
     double f=(c*9/5)+32;
     double k=c+273.15;
     System.out.println("celcius:"+c);
     System.out.println("fahrenheit:"+f);
     System.out.println("kelvin:"+k);
     }
   }
  public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  convert obi=new convert();
  System.out.print("Enter temperature in celcius:");
  double temp=sc.nextdouble();
  obj.celciusToothers(temp);
  sc.close();
}   
