package tutorial;

import java.util.Scanner;

public class sorted {

	static boolean isSorted (int A[] , int n)
	{
		if (n == 2)
			return true;
		
		return (A[n-1] < A[n-2])? false : isSorted(A,n-1);
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println(" Enter the size of array");
		int n = sc.nextInt();
		int A[] = new int[n];
		System.out.println(" Enter the no.");
		for (int i=0; i<n; i++)
		{
			A[i] = sc.nextInt();
		}
		System.out.println(isSorted(A,n));
	}

}
