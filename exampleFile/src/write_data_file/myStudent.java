package write_data_file;

public class myStudent {
	private String id;
	private String name;
	
	public myStudent(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString()	{
		return "[Student name: "+this.name + "\nID: " +this.id+"]";
	}
}
