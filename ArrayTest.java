import java.util.*;

public class ArrayTest
{
	public static void main(String[] args)
	{
		int[] a = new int[20];
		for(int i = 0; i < a.length; i++)
		{
			a[i] = i;
		}

		for(int b : a)
		{
			System.out.println(b);
		}

		System.out.println(Arrays.toString(a));
	}
}
