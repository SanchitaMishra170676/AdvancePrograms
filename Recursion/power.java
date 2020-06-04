// To calculate the power of a no.
package tutorial;

import java.util.Scanner;

public class power {

	static int pow (int a, int b)
	{
		if (b == 0)
			return 1;
		else if (b%2 ==0)
			return  pow(a*a,b/2);    // dividing power into half when it is even
			else  
				return a* pow(a, b-1);  // converting power into even by multiplying a
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the no. and the power");
	int a = sc.nextInt();
	int b = sc.nextInt();
	System.out.println(pow(a,b));

	}

}
