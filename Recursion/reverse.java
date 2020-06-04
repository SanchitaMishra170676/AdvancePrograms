package tutorial;

import java.util.Scanner;

public class reverse {
	String r = "";
	String rev(String str) {
		if (str.length() <1)
			return r;
		r = r+ str.charAt(str.length()-1);
		return rev(str.substring(0,str.length()-1));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		reverse ob = new reverse ();
		String str = sc.next();
		System.out.println(ob.rev(str));

	}

}
