class Demo{
synchronized void
print(int n){
System.out.println("Produced:"+n);
notifyAll();
try{
wait(100);
}catch(Exception e){
}
System.out.println("Consumed:"+n);
notifyAll();
}
}
class producer extends Thread
{
Demo d;
producer(Demo d){
this.d=d;
}
public void run(){
for(int i=1;i<=5;i++)
{
d.print(i);
}
}
}
public class Main{
public static void main(String[]args){
Demo d=new Demo();
producer p=new producer(d);
p.start();
}
}
