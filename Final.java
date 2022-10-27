package number;
import java.util.Scanner;
public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the 4 digit number ");
		  int num = sc.nextInt();
		  float i = (((num+8)/3)%5)*5;
		  sc.close();
		  System.out.println("The Result is "+i);
		}
	}


