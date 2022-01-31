package com.comparator;

import java.util.Comparator;

public class Sortbyroll implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o2.rollno-o1.rollno;
	}

}
