package dataStructures;

import java.util.*;

public class implimentStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<student> kaksha = new ArrayList<>(23);
		kaksha.add(new student (1,"Aditya Mihra", 96.4));
		kaksha.add(new student (2, "Kanika Mishra", 94.8));
		kaksha.add(new student (3,"Sanchita Mishra", 98.4));
		
		
		kaksha.set(0, new student (1,"Adity Mihra", 100));
		System.out.println(kaksha);
		
	}

}
