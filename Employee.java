import java.util.*;
class Employee{
string emp_name;
int emp_id;
string address;
string mail_id;
string mob_number;
Employee(string emp_name,int emp_id,string address,string mail_id,string mob_number);
{
this.emp_name=emp_name;
this.emp_id=emp-id;
this.address=address;
this.mail_id=mail_id;
this.mob_number=mob_number;
}
void display(){
system.out.println("Employee Name:"+emp_name);
system.out.println("Employee ID:"+temp_id);
system.out.println("Address:"+address);
system.out.println("Mail ID:"+mail_id);
system.out.println("Mobile number:"+mob_number);
}
}
class programmer extends Employee{
double basicpay,da,hra,pf,fund,grosssalary,netsalary;
programmer(String emp_name,int emp_id,String address,String mail_id,String mob_number,double bp){
super(emp_name,emp_id,address,mail_id,mob_number);
basicpay=bp;
}
void getpayslip(){
da=basicpay*97/100;
hra=basicpay*10/100;
pf=basicpay*12/100;
fund=basicpay*0.1/100;
grosssalary=basicpay+da+hra=pf+fund;
netsalary=grosssalary-pf-fund;
}
void disp(){
system.out.println("\n*****PROGRAMMER PAY SLIP*****");
display();
system.out.println("Basic pay:"+basicpay);
system.out.println("Gross salary:"+grosssalary);
system.out.println("Net salary:"+netsalary);
}
}
class Assisstantprofessor extends Employee{
double basicpay,da,hra,pf,fund,grosssalary,netsalary;
Assistantprofessor(String emp_name,int emp_id,String address,String mail_id,mob_number,double bp){
 super(emp_name,emp_id,address,mail_id,mob_number);
basicpay=bp;
}
void getpayslip(){
da=basicpay*97/100;
hra=basicpay*10/100;
pf=basicpay*12/100;
fund=basicpay*0.1/100;
grosssalary=basicpay+da+hra=pf+fund;
netsalary=grosssalary-pf-fund;
}
void disp(){
system.out.println("\n*****ASSISTANT PROFESSOR PAY SLIP*****");
display();
system.out.println("Basic pay:"+basicpay);
system.out.println("Gross salary:"+grosssalary);
system.out.println("Net salary:"+netsalary);
}
}
class Associateprofessor extends Employee{
double basicpay,da,hra,pf,fund,grosssalary,netsalary;
Associateprofessor(String emp_name,int emp_id,String address,String mail_id,String mob_number,double bp){
 super(emp_name,emp_id,address,mail_id,mob_number);
basicpay=bp;
}
void getpayslip(){
da=basicpay*97/100;
hra=basicpay*10/100;
pf=basicpay*12/100;
fund=basicpay*0.1/100;
grosssalary=basicpay+da+hra=pf+fund;
netsalary=grosssalary-pf-fund;
}
void disp(){
system.out.println("\n*****ASSOCIATE PROFESSOR PAY SLIP*****");
display();
system.out.println("Basic pay:"+basicpay);
system.out.println("Gross salary:"+grosssalary);
system.out.println("Net salary:"+netsalary);
}
}
class professor extends Employee{
double basicpay,da,hra,pf,fund,grosssalary,netsalary;
professor(String emp_name,int emp_id,String address,String mail_id,String mob_number,double bp){
 super(emp_name,emp_id,address,mail_id,mob_number);
basicpay=bp;
}
void getpayslip(){
da=basicpay*97/100;
hra=basicpay*10/100;
pf=basicpay*12/100;
fund=basicpay*0.1/100;
grosssalary=basicpay+da+hra=pf+fund;
netsalary=grosssalary-pf-fund;
}
void disp(){
system.out.println("\n*****PROFESSOR PAY SLIP*****");
display();
system.out.println("Basic pay:"+basicpay);
system.out.println("Gross salary:"+grosssalary);
system.out.println("Net salary:"+netsalary);
}
}
public class main{
public static void main(string[]args){
scanner in=new scanner(system.in);
system.out.print("Enter Employee Name:");
string name=in.nextLine();
system.out.print("Enter Employee ID:");
int id=in.nextInt();
in.nextLine();
system.out.print("Enter Address:");
string add= in.nextLine();
system.out.print("Enter Mail ID:");
string mail= in.nextLine();
system.out.print("Enter Mobile NUmber:");
string mob=in.nextLine();
system.out.print("Enter Basic Pay:");
double bp=in.nextDouble();
system.out.println("\nChoose Designation");
system.out.println("1.Programmer");
system.out.println("2.Assistant professor");
system.out.println("3.Associate professor");
system.out.println("4.Proffesor");
system.out.println("5.Exit");
system.out.print("enter choice");
int desg=in.nextint();
switch(desg){
case 1:
programmer p=new programmer(name,id,add,mail,mob,bp);
p.getpayslip();
p.disp();
break;
case 2:
Assistantproffesor ap=new Assistantprofessor(name,id,add,mail,mob,bp);
ap.getpayslip();
ap.disp();
break;
case 3:
Associateproffesor=new Associateprofessor(name,id,add,mail,mob,bp);
asp.getpayslip();
asp.disp();
break;
case 4:
proffesor pr=new professor(name,id,add,mail,mob,bp);
pr.getpayslip();
pr.disp();
break;
case 5:
system.out.println("Program Exited.");
break;
default:
system.out.println("Invalid Choice!");
}
in.close();
}
}
