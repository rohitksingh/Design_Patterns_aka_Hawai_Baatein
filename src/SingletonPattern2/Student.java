package SingletonPattern2;

public class Student {

	private String dep;
	private String name;
	
	
	public Student(String name,String dep)
	{
		this.name=name;
		this.dep=dep;
	
	}

	

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollNum() {
		return rollNum;
	}

	public void setRollNum(String rollNum) {
		this.rollNum = rollNum;
	}
	
}
