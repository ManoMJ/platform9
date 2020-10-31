package kr.co.dmtlabs.platform.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Job_Result {
	@Id
	@GeneratedValue
	private String Result_Code;
	private String Task_Code;
	private String Board_Title;
	private String Board_Content;
	private String Result_File;
	private String Creator;
	private String Created_Date;
	private String Edited_Date;
	
	public Job_Result() {}

	public String getResult_Code() {
		return Result_Code;
	}

	public void setResult_Code(String result_Code) {
		Result_Code = result_Code;
	}

	public String getTask_Code() {
		return Task_Code;
	}

	public void setTask_Code(String task_Code) {
		Task_Code = task_Code;
	}

	public String getBoard_Title() {
		return Board_Title;
	}

	public void setBoard_Title(String board_Title) {
		Board_Title = board_Title;
	}

	public String getBoard_Content() {
		return Board_Content;
	}

	public void setBoard_Content(String board_Content) {
		Board_Content = board_Content;
	}

	public String getResult_File() {
		return Result_File;
	}

	public void setResult_File(String result_File) {
		Result_File = result_File;
	}

	public String getCreator() {
		return Creator;
	}

	public void setCreator(String creator) {
		Creator = creator;
	}

	public String getCreated_Date() {
		return Created_Date;
	}

	public void setCreated_Date(String created_Date) {
		Created_Date = created_Date;
	}

	public String getEdited_Date() {
		return Edited_Date;
	}

	public void setEdited_Date(String edited_Date) {
		Edited_Date = edited_Date;
	}
	
	
}
