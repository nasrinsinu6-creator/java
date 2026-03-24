import java.util.Scanner;
class AuthException extends Exception{
public AuthException(String message){
super ( message ) ;
}
}
public class AuthDemo {
public static void main(String[] args)  throws AuthException{
Scanner sc=new Scanner(System.in);
final String VALID_USER = "admin";
final String VALID_PASS = "pass123";
System.out.print("Enter Username: ");
String user=sc.nextLine();
System.out.print("Enter Password: ");
String pas=sc.nextLine();
System.out.println("\nVerifying credentials...");
try {
if (!pas.equals("pass123") || !user.equals("admin") ) {
throw new AuthException ("invalid password or username"); 
} else {
System.out.println("Access Granted. Welcome to the system.");
}
}
catch ( AuthException e ) {
System.out.println ("SECURITY ALERT:"+e.getMessage());
} 
}
}


