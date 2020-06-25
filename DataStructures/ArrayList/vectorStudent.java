package dataStructures;

import java.util.*;

public class vectorStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<student> kaksha = new Vector<>(23);
		//student obj = new student(0, null, 0);
		kaksha.add(new student (1,"Aditya Mihra", 96.4));
		kaksha.add(new student (2, "Kanika Mishra", 94.8));
		kaksha.add(new student (3,"Sanchita Mishra", 98.4));
		
		
		kaksha.set(0, new student (1,"Adity Mihra", 100));
	   Object[]  obj1 =	kaksha.toArray();
	   for (Object value : obj1) {
		      System.out.println("Color = " + value);
		    }
		System.out.println(kaksha.getClass());
		System.out.println(kaksha);
		System.out.println(kaksha.size());
		System.out.println(kaksha.isEmpty());
		

	}

}
