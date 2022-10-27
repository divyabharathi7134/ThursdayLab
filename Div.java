package number;
import java.util.Scanner;
public class Div {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pass1,pass2;
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Your Password");
	    pass1=sc.next();
	    System.out.println("Re-enter Your Password");
	    pass2=sc.next();
	    if(pass1.equals(pass2)) {
		System.out.println("Password is Matched");
	}else
	{
		System.out.println("Password is Not Matched");
		}
}
}