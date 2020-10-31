package kr.co.dmtlabs.platform.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Job_List {
	@Id
	@GeneratedValue
	private String Task_Code;
	private String Member_Code;
	private String Job_Code;
	private String Status;
	
	public Job_List() {}

	public String getTask_Code() {
		return Task_Code;
	}

	public void setTask_Code(String task_Code) {
		Task_Code = task_Code;
	}

	public String getMember_Code() {
		return Member_Code;
	}

	public void setMember_Code(String member_Code) {
		Member_Code = member_Code;
	}

	public String getJob_Code() {
		return Job_Code;
	}

	public void setJob_Code(String job_Code) {
		Job_Code = job_Code;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}
	
	
}
