package submission06;

import java.util.ArrayList;

public class SubLists {
	public ArrayList<Integer> m1() {
		ArrayList<Integer> arr = new ArrayList<Integer>();		// initialize array
		arr.add(1);			// add elements to array
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		System.out.println("Starting arr: " + arr);
		System.out.println();
		
		for (int i = 0; i < arr.size(); i++) {		// logic to create sub arraylists
			for (int j = i + 1; j <= arr.size(); j++) {
				System.out.println(arr.subList(i, j));
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		SubLists sl = new SubLists();
		sl.m1();
	}

}
