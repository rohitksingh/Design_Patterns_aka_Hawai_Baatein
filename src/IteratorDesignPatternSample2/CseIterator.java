package IteratorDesignPatternSample2;

import java.util.ArrayList;

import IteratorDesignPatternSample1.Iterator;

public class CseIterator implements Iterator{
	
	private ArrayList<Student> stud;
	
	private int index;
	
	public CseIterator(ArrayList<Student> s) {
		 
		stud=s;
	}
	
	@Override
	public Object next() {
		return stud.get(index++);
	}

	@Override
	public boolean hasNext() {
		return index<stud.size();
	}

}

