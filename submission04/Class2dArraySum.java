package submission04;

import java.util.Scanner;

public class Class2dArraySum {
	public void sumOfNeighbourElements() {
		try {
			Scanner sc = new Scanner(System.in); // assigning array size
			System.out.print("Enter row no: ");
			int row = sc.nextInt();
			System.out.print("Enter column no: ");
			int column = sc.nextInt();

			int[][] arr = new int[row][column]; // assigning values to array
			System.out.println("Enter " + row * column + " elements into 2-d array: ");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < column; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println("Enter the element to find sum: ");
			int element = sc.nextInt();
			int sum = 0;
			
			for(int i=0; i<row; i++) {
				for(int j=0; j<column; j++) {
					if(arr[i][j] == element) {		// finding the index of the element
						if(j>0)sum+=arr[i][j-1];	// adding the valid values
						if(i>0)sum+=arr[i-1][j];
						if(j<arr[0].length-1)sum+=arr[i][j+1];
						if(i<arr.length-1)sum+=arr[i+1][j];
					}
				}
			}
			System.out.println("sum of left,top,right,down for "+ element + " is " + sum);
			sc.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		Class2dArraySum obj = new Class2dArraySum();
		obj.sumOfNeighbourElements();
	}

}
