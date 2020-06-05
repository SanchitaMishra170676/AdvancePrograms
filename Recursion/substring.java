package tutorial;

import java.util.Scanner;

public class substring {

	
	static int sub (String str)
	{
		if (str.length()==1)
			return 1;
		return (str.length() + sub(str.substring(1)));
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter your String");
		String str = sc.next();
		System.out.println(sub(str));
		
	}

}
