import java.sql.Date;

public class Student {

	private String Name; 
	private int age;
	private int id;
	private String username;
	private Date dob;
	
	public Student(String n, int a, int ids, Date d){
		Name = n;
		age = a;
		id = ids;
		dob = d;
		username = genUserName();

	}
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	private String genUserName() {
		String uName = Name + "" +age;
		return uName;
	}
}
