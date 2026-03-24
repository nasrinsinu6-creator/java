import java.util.Scanner;
public class Tempconv{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
while(true){
System.out.println("---Temperature converter---");
System.out.println("1.Celsius to Fahrenheit");
System.out.println("2.Fahrenheit to Celsius");
System.out.println("3. Exit");
System.out.println("Enter your option");
int choice = sc.nextInt();
sc.nextLine();
 if(choice == 3){
   	System.out.println("Execution terminated");
   	break;
   }
if (choice != 1 && choice != 2) {
System.out.println("Error: Invalid menu selection");
continue;
}

System.out.println("Enter temperature :");
String temp=sc.nextLine();
try{
double temperature=Double.parseDouble(temp);
double convertedTemp;
switch(choice){
case 1:
convertedTemp=(temperature * 9/5) + 32;
System.out.printf("Temperature %.2f C is equal to %.2f F\n", temperature, convertedTemp);
break;
case 2:
convertedTemp=(temperature - 32) * 5/9;
System.out.printf("Temperature %.2f F is equal to %.2f C\n", temperature, convertedTemp);
break;
default:
System.out.println("Error:Invalid menu selection");
break;
}
}catch(NumberFormatException e){
System.out.println("Error:Invalid input.you must enter a numerical value.");
System.out.println("Exception details:"+e);
System.out.println("Reason: " + e.getMessage());

}
}
sc.close();
}
}



