package IteratorDesignPatternSample1;

import java.util.ArrayList;

public class GroupIterator implements Iterator{

	private ArrayList<Something> list;
	private int index;
	
	public GroupIterator(ArrayList<Something> list) {
		this.list=list;
	}
	
	@Override
	public boolean hasNext() {
		return index<list.size();
	}

	@Override
	public Something next() {
		
		if(index<list.size())
		return list.get(index++);
		else
			return null;
	}

}