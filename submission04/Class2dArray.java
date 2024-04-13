package submission04;

import java.util.Scanner;

public class Class2dArray {

	public void swapDiagonals() {
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

			for (int i = 0; i < row; i++) // Swapping two numbers
			{
				int temp = arr[i][i];
				arr[i][i] = arr[i][row - i - 1];
				arr[i][row - i - 1] = temp;
				i++;
			}

			for (int i = 0; i < row; i++) { // printing the swapped array
				for (int j = 0; j < column; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
			sc.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {

		Class2dArray obj = new Class2dArray(); // create instance of Class2dArray
		obj.swapDiagonals();
	}
}
