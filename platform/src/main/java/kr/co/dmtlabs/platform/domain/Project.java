package kr.co.dmtlabs.platform.domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Project {
	@Id
	@GeneratedValue
	private String Project_Code;
	private String Project_Name;
	private String Creator;
	private String Created_Time;
	private String Owner;
	private String Project_Desc;
	private String Deadline;
	
	public Project() {}

	public String getProject_Code() {
		return Project_Code;
	}

	public void setProject_Code(String project_Code) {
		Project_Code = project_Code;
	}

	public String getProject_Name() {
		return Project_Name;
	}

	public void setProject_Name(String project_Name) {
		Project_Name = project_Name;
	}

	public String getCreator() {
		return Creator;
	}

	public void setCreator(String creator) {
		Creator = creator;
	}

	public String getCreated_Time() {
		return Created_Time;
	}

	public void setCreated_Time(String created_Time) {
		Created_Time = created_Time;
	}

	public String getOwner() {
		return Owner;
	}

	public void setOwner(String owner) {
		Owner = owner;
	}

	public String getProject_Desc() {
		return Project_Desc;
	}

	public void setProject_Desc(String project_Desc) {
		Project_Desc = project_Desc;
	}

	public String getDeadline() {
		return Deadline;
	}

	public void setDeadline(String deadline) {
		Deadline = deadline;
	}
	
	
}
