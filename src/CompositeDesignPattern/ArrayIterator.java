package CompositeDesignPattern;

import java.util.ArrayList;

public class ArrayIterator implements Iterator{

	private ArrayList<Object> list;
	private int count;
	
	public ArrayIterator(ArrayList list)
	{
		this.list=list;
	}
	
	@Override
	public Object next() {
		return list.get(count++);
	}

	@Override
	public boolean hasNext() {
		return count<list.size();
	}

}



