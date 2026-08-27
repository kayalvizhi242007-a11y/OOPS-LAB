import java.util.Scanner;
class InternetBill{
  public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int accountNo;
   String holderName;
   double previousUsage,currentUsage,dataUsed,bill=0;
   String plan;
   System.out.println("Enter Account Number:");
   accountNo=sc.nextInt();
   sc.nextLine();
   System.out.println("Enter Account Holder Name:");
   holderName=sc.nextLine();
   System.out.println("Enter Previous Month Data Usage(GB):");
   previousUsage=sc.nextDouble();
   System.out.println("Enter Current Month Data Usage(GB):");
   currentUsage=sc.nextDouble();
   dataUsed=currentUsage-previousUsage;
   sc.nextLine();
   System.out.println("Enter Plan Type(Basic/Premium):");
   plan=sc.nextLine();
   if
   (plan.equalsIgnoreCase("Basic"))
   {
     if
     (dataUsed<=50)
       bill=dataUsed*20;
     else
       bill=(50*20)+((dataUsed-50)*30);
     }
     else if
      (plan.equalsIgnoreCase("Premium")) {
     if
     (dataUsed<=100)
       bill=dataUsed*15;
     else
       bill=(100*15)+((dataUsed-100)*25);
     }
     else {
      System.out.println("Invalid Plan Type!");
      System.exit(0);
     }
     System.out.println("\n-----Internet Bill-----");
     System.out.println("Account Number:"+accountNo);
     System.out.println("Account Holder:"+holderName);
     System.out.println("Plan Type  :"+plan);
     System.out.println("Data Used  :"+dataUsed+"GB");
     System.out.println("Total Bill :Rs."+bill);
   }
}                   
   
