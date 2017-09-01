import java.util.*;

public class YangHui{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("please input hang:");
		int n = in.nextInt();

		int[][] array = new int[n][n];
		for(int i = 0; i < n; i++)
		{
			for(int j=0; j <= i; j++)
			{
				if(j == 0 || i == j)
 					array[i][j] = 1;
				else
					array[i][j] = array[i-1][j-1] +array[i-1][j];
				System.out.print(array[i][j] + " ");
			}
			System.out.print("\n");
		}		
	}
}
