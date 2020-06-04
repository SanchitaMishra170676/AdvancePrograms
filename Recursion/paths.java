// To find the no. of paths available to reach end of a given matrix when you can go just left and down
package tutorial;

import java.util.Scanner;

public class paths {
	
	static int path (int m, int n)
	{
		if (m== 1 || n == 1)
			return 1;
		return path(m, n-1) + path(m-1, n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size of matrix");
		int m = sc.nextInt();
		int n = sc.nextInt();
		System.out.println(path(m,n));
		
	}

}
