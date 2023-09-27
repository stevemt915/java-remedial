import java.util.Scanner;
public class checkpostiveornegativeno {
	public static void main (String [] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the Number");
		int num = in.nextInt();
		if(num>0) {
			System.out.println("The number is positive");
		}
		else {
			System.out.println("The number is negative");
		}
	}
}
