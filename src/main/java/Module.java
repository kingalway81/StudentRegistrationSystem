import java.util.ArrayList;

public class Module {

	//Module Name, ID (CT417), List of students
	private String ModuleName;
	private String ID;
	private ArrayList<Student> listOfStudents;
	
	public Module(String mn, String id, ArrayList<Student> arrayStudents){
		ModuleName = mn;
		ID = id;
		listOfStudents = arrayStudents;
	}

	public String getModuleName() {
		return ModuleName;
	}

	public void setModuleName(String moduleName) {
		ModuleName = moduleName;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public ArrayList<Student> getListOfStudents() {
		return listOfStudents;
	}

	public void setListOfStudents(ArrayList<Student> listOfStudents) {
		this.listOfStudents = listOfStudents;
	}
	
	
	
}
