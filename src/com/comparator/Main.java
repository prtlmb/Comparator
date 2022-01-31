package com.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		ArrayList<Student> ar = new ArrayList<>();
		ar.add(new Student(111, "Mayank", "london"));
		ar.add(new Student(131, "Anshul", "nyc"));
		ar.add(new Student(121, "Solanki", "jaipur"));
		ar.add(new Student(101, "Aggarwal", "Hongkong"));
		
		
		// TODO Auto-generated method stub
		
		System.out.println("Unsorted");
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		Collections.sort(ar,new Sortbyroll());
		
		System.out.println("\nSorted by rollno");

		// Again iterating over entries to print them
		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));

		Collections.sort(ar,new SortByname());
		
		System.out.println("\nSorted by name");
		
		// Again iterating over entries to print them
		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));
		
		
		
		String s1="abc";
		String s2="abc";
		
		System.out.println(s1==s2);
		
		

	}

}
