import java.util.*;

public class ScanTest
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("What is you name?");
		String name = in.nextLine();
		
		System.out.println("How old are you?");
		int age = in.nextInt();

		System.out.println("Hello, " + name + ". Next year, you'll be " + (age + 1));
		System.out.printf("Hello, %s. Next year,you'll be %d.", name, age+1);
	}
}
