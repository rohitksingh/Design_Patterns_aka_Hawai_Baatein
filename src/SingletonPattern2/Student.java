package SingletonPattern2;

public class Student {

	private String dep;
	private String name;
	private String rollNum;
	
	public Student(String name,String dep,String rollNum)
	{
		this.name=name;
		this.dep=dep;
		this.rollNum=rollNum;
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
