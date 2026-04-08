import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayListDemo{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
List<String> systemLog = new ArrayList<>();
System.out.println("---Adding Elements---");


systemLog.add("Kernel");
systemLog.add("Bootloader");
systemLog.add("Daemon");
systemLog.add("Shell");

System.out.println(systemLog);
System.out.println("\n---Searching for an element---");
System.out.println("Enter string to search :");
String sh=sc.nextLine();

if(systemLog.contains(sh)){
int position = systemLog.indexOf(sh);
System.out.println("Found at the position :"+position);
}else{
System.out.println("Error");
}

System.out.println("\n---Removing an Element---");
boolean isRemoved = systemLog.remove("Bootloader");

if (isRemoved) {
    System.out.println("Item was successfully deleted.");
} else {
    System.out.println("Item was not found.");
}
System.out.println(systemLog);

System.out.println("\n--- Sorting the List ---");

Collections.sort(systemLog);
System.out.println(systemLog);

}
}
