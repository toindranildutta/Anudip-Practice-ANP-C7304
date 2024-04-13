package submission06;

import java.util.ArrayList;

public class ReverseString {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>(); // new Arraylist created
		names.add("indranil"); // Elements added
		names.add("pintu");
		names.add("subhadip");
		names.add("buddhadeb");
		names.add("shilpa");
		names.add("priyanka");
		names.add("soumya");

		System.out.println();
		System.out.println("original arraylist : " + names); // printing original arraylist
		System.out.println();

		for (int i = names.size() - 1; i >= 0; i--) // reverse order of strings in arraylist
		{
			System.out.print(names.get(i) + " | ");
		}
		System.out.println();
		System.out.println();
		for (int i = names.size() - 1; i >= 0; i--) // reverse order with reverse character
		{
			StringBuilder input = new StringBuilder(names.get(i));
			input.reverse();
			System.out.print(input + " | ");
		}

	}

}
