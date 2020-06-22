package dataStructures;

import java.util.*;

public class rollNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> roll = new ArrayList<>();
		
		for (int i=1; i<=10; i++)
		{
			roll.add(i);
		}
		//roll.add("Sanchita");
		roll.remove(1);
		roll.set(1, 2);
		roll.add(2, 3);
		System.out.println(roll.isEmpty());
		System.out.println(roll);
	}

}
