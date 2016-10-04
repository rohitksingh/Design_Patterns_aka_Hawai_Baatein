package IteratorDesignPatternSample2;

public class MechIterator implements Iteratorr{

	private Student[] stud;
	private int index;
	
	public MechIterator(Student[] s) {
		
		stud=s;
	}

	@Override
	public Object next() {
		
		return stud[index++];
		
	}

	@Override
	public boolean hasNext() {
		
		return index<stud.length && stud[index]!=null;
		
	}
	
	
	
}