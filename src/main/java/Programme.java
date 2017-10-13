import java.util.ArrayList;

import org.joda.time.DateTime;

public class Programme {
	
	private String CourseName;
	private ArrayList<Module> moduleList;
	private DateTime StartDate;
	private DateTime endDate;
	
	public Programme(String cn, ArrayList<Module> ml, DateTime sd, DateTime ed){
		CourseName = cn;
		moduleList = ml;
		StartDate = sd;
		endDate = ed;
	}
	
}
