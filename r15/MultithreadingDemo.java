import java.util.Scanner;

class MultiplicationThread extends Thread{

@Override
public void run(){
System.out.println("->Multipication Thread started.");
try{
for (int i = 1; i <= 10; i++) {
System.out.println("5 x " + i + " = " + (5 * i));
Thread.sleep(200);
}
}catch(InterruptedException e){
System.out.println("Multiplication Thread interrupted");
}
}
}

class PrimeThread extends Thread{
private int limit ;
public PrimeThread ( int n) { this . limit = n; }

@Override
public void run (){
System.out.println("->Prime Thread Started.");
try{
for (int i = 2; i <= limit; i++) {
if (isPrime(i)) {
System.out.println("Prime: " + i);
}

}
Thread.sleep(250);
}catch(InterruptedException e){

System.out.println("Prime Thread interrupted");
}
}
private boolean isPrime(int num) {
for (int i = 2; i <= Math.sqrt(num); i++) {
if (num % i == 0)
return false;
}
return true;
}
}

public class MultithreadingDemo{
public static void main(String[] args){
Scanner sc = new Scanner(System.in); 
int n = sc.nextInt();


MultiplicationThread t1 = new MultiplicationThread();
PrimeThread t2 = new PrimeThread(n);

t1.start();
t2.start();
}
}

