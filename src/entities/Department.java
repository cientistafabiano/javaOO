package entities;

public class Department {
	private String name;
	//overload
	public Department() {		
	}
	//constructor
	public Department(String name) {
		this.name = name;
	}
	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}