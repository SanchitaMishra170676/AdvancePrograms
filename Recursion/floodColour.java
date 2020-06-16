package tutorial;

import java.util.Scanner;

public class floodColour {

	
		static void fillC (int a[][], int r, int c, int toFill, int prevFill)
		{
			int row = a.length;
			int col = a[0].length;
			if (r<0 || r>= row || c <0 || c >= col)
			{
				return;
			}
			if (a[r][c] != prevFill)
				return;
			
			a[r][c] = toFill;
			System.out.println("reached here" + a[r][c]);
			
			 fillC (a, r-1, c, toFill, prevFill);
			 fillC (a, r, c-1, toFill, prevFill);
			 fillC (a, r+1, c, toFill, prevFill);
			 fillC (a, r, c+1, toFill, prevFill);
			
			
			
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc= new Scanner (System.in);
			System.out.println("Enter rows and col");
			int x = sc.nextInt();
			int y = sc.nextInt();
			int a [][] = new int [x][y];
			System.out.println("Enter matrix");
			for (int i=0; i<x; i++)
			{
				for (int j =0; j<y; j++)
				{
					a [i][j] = sc.nextInt();
				}
			}
			
			System.out.println("Enter the colour to be changed");
			int prevFill = sc.nextInt();
			System.out.println("Enter the colout=r to br filled");
			int toFill = sc.nextInt();
			System.out.println("Enter the row in contact");
			int r = sc.nextInt();
			System.out.println("Enter the col in contact");
			int c = sc.nextInt();
			
			fillC(a,r-1,c-1,toFill, prevFill);
			
			for (int i=0; i<x; i++)
			{
				for (int j =0; j<y; j++)
				{
					System.out.print(a [i][j]); 
				}
				System.out.println();
			}
			

	}

}
