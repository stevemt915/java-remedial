import java.util.Scanner;
public class greatestnos {
	public static void main(String [] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter 3 no.s:");
		int num1=in.nextInt();
		int num2=in.nextInt();
		int num3=in.nextInt();
		if(num1>num2&&num1>num3){
			System.out.println("num1 is the greatest of all the other two no.s");
		}
		else if(num2>num1&&num2>num3) {
			System.out.println("num2 is the greatest of all the other two no.s");
		}
		else {
			System.out.println("num3 is the greatest of all the other two no.s");
		}
	}
}
