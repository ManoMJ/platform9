package kr.co.dmtlabs.platform.domain;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table
@Data
public class Project {
	@Id
	@Column
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	private String Project_Code;

	@Column
	private String Project_Name;

	@Column
	private String Creator;

	@Column
	private LocalDateTime Created_Time;

	@Column
	private String Owner;

	@Column
	private String Project_Desc;

	@Column
	private String Deadline;


	public Project() {}

	@Builder
	public Project(String Project_Code, String Project_Name, String Creator,
				   LocalDateTime Created_Time,
				    String Owner, String Project_Desc, String Deadline) {
		this.Project_Code = Project_Code;
		this.Created_Time = Created_Time;
		this.Project_Name = Project_Name;
		this.Creator = Creator;
		this.Owner = Owner;
		this.Project_Desc = Project_Desc;
		this.Deadline = Deadline;
	}


	
}
