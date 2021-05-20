package com.qa.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraylistExa {

	public static void allarray() {
		// TODO Auto-generated method stub

		ArrayList<Integer> arrayList = new ArrayList<>();

		arrayList.add(23);
		arrayList.add(20);
		arrayList.add(22);
		arrayList.add(21);
		arrayList.add(25);

		
		System.out.println("ArrayList: " + arrayList);

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}

		for (Integer handle : arrayList) {
			System.out.println(handle);
		}

		
		ArrayList<Integer> arrayListcopy = new ArrayList<Integer>(arrayList);
		System.out.println("this is the copy" + arrayListcopy);
		
		System.out.println(arrayList.get(2));

		System.out.println("ORGINAL" + arrayList);
		arrayList.set(3, 100);
		System.out.println("MODIFIED" + arrayList);
		


		arrayList.remove(4);
		System.out.println(arrayList);

		Collections.sort(arrayList);
		System.out.println(arrayList);

		Collections.reverse(arrayList);
		System.out.println(arrayList);

		Collections.swap(arrayList, 0, 2);
		System.out.println(arrayList);

		arrayList.clone();
		System.out.println(arrayList);
		
//	ArrayList >> dayinamic in size (you can make it small or bigger)	
//	Array.asList >> creates a fixed size list  cannot use the .add() method
		 
		List<String> myName = Arrays.asList("tg","me");
		System.out.println(myName);
		
		
		
		List<Integer> myNum = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		System.out.println(myNum);
		
		List<Integer> myNum2 = List.copyOf(myNum);
		System.out.println("Tis is copy of myNum" + myNum);
	}	

}
