package tutorial;

import java.util.Scanner;

public class palindrome {

	static boolean checkPalindrome (String str)
	{
		if (str.length()<=1)
			return true;
		else if (str.charAt(0) == str.charAt(str.length()-1))
			{
			return checkPalindrome(str.substring(1,str.length()-1));
			}
		return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the string ");
		String str = sc.next();
		
		System.out.println(checkPalindrome(str));
		

	}

}
