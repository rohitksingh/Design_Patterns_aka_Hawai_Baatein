package CompositeDesignPattern;

import java.util.ArrayList;

public class CSE implements SubGroup{

	private String groupName;
	private Iterator iterator;
	private ArrayList<Group> list;
	
	public CSE()
	{
		list=new ArrayList<Group>();
	}
	
	public CSE(String groupname)
	{
		this.groupName=groupname;
		list=new ArrayList<Group>();
	}
	
	public void setName(String groupName)
	{
		this.groupName=groupName;
	}
	
	public String getName()
	{
		return groupName;
	}
	
	
	@Override
	public void add(Object o) {
		list.add((Group)o);
	}

	@Override
	public Iterator iterator() {
		return iterator=new ArrayIterator(list);
	}

	@Override
	public void print() {
		System.out.println(groupName+"<\n-------------");
		Iterator iterator=iterator();
		while(iterator.hasNext())
		{
			Group s=(Group)iterator.next();
			s.print();
		}
		
		System.out.println("-------------\n>");
		
	}
	
	
}

