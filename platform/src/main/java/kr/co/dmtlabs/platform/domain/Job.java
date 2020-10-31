package kr.co.dmtlabs.platform.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Job {
	@Id
	@GeneratedValue
	private String Job_Code;
	private String Project_Code;
	private String Job_Name;
	private String Job_Kind;
	private String Creator;
	private String Created_Time;
	private String Job_Desc;
	private int Worker_Required;
	private String Due_Date;
	private String Payment;
	private int View_Count;
	private int Apply_Count;
	
	public Job() {}

	public String getJob_Code() {
		return Job_Code;
	}

	public void setJob_Code(String job_Code) {
		Job_Code = job_Code;
	}

	public String getProject_Code() {
		return Project_Code;
	}

	public void setProject_Code(String project_Code) {
		Project_Code = project_Code;
	}

	public String getJob_Name() {
		return Job_Name;
	}

	public void setJob_Name(String job_Name) {
		Job_Name = job_Name;
	}

	public String getJob_Kind() {
		return Job_Kind;
	}

	public void setJob_Kind(String job_Kind) {
		Job_Kind = job_Kind;
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

	public String getJob_Desc() {
		return Job_Desc;
	}

	public void setJob_Desc(String job_Desc) {
		Job_Desc = job_Desc;
	}

	public int getWorker_Required() {
		return Worker_Required;
	}

	public void setWorker_Required(int worker_Required) {
		Worker_Required = worker_Required;
	}

	public String getDue_Date() {
		return Due_Date;
	}

	public void setDue_Date(String due_Date) {
		Due_Date = due_Date;
	}

	public String getPayment() {
		return Payment;
	}

	public void setPayment(String payment) {
		Payment = payment;
	}

	public int getView_Count() {
		return View_Count;
	}

	public void setView_Count(int view_Count) {
		View_Count = view_Count;
	}

	public int getApply_Count() {
		return Apply_Count;
	}

	public void setApply_Count(int apply_Count) {
		Apply_Count = apply_Count;
	}
}
