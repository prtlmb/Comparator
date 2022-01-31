package com.comparator;

import java.util.Comparator;

public class SortByname implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o2.name.compareTo(o1.name);
	}

}
