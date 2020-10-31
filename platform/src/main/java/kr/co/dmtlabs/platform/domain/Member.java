package kr.co.dmtlabs.platform.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Member {
	@Id
	@GeneratedValue
	private String Member_Code;
	private String Member_ID;
	private String Member_Pass;
	private int Member_Role;
	private String Member_Team;
	private String Member_Tel;
	private String Member_Addr;
	private String Member_Email;
	private String Created_Time;
	private String Account_Info;
	private int Average_Score;
	private int Review_Cnt;
	
	public Member() {}

	public String getMember_Code() {
		return Member_Code;
	}

	public void setMember_Code(String member_Code) {
		Member_Code = member_Code;
	}

	public String getMember_ID() {
		return Member_ID;
	}

	public void setMember_ID(String member_ID) {
		Member_ID = member_ID;
	}

	public String getMember_Pass() {
		return Member_Pass;
	}

	public void setMember_Pass(String member_Pass) {
		Member_Pass = member_Pass;
	}

	public int getMember_Role() {
		return Member_Role;
	}

	public void setMember_Role(int member_Role) {
		Member_Role = member_Role;
	}

	public String getMember_Team() {
		return Member_Team;
	}

	public void setMember_Team(String member_Team) {
		Member_Team = member_Team;
	}

	public String getMember_Tel() {
		return Member_Tel;
	}

	public void setMember_Tel(String member_Tel) {
		Member_Tel = member_Tel;
	}

	public String getMember_Addr() {
		return Member_Addr;
	}

	public void setMember_Addr(String member_Addr) {
		Member_Addr = member_Addr;
	}

	public String getMember_Email() {
		return Member_Email;
	}

	public void setMember_Email(String member_Email) {
		Member_Email = member_Email;
	}

	public String getCreated_Time() {
		return Created_Time;
	}

	public void setCreated_Time(String created_Time) {
		Created_Time = created_Time;
	}

	public String getAccount_Info() {
		return Account_Info;
	}

	public void setAccount_Info(String account_Info) {
		Account_Info = account_Info;
	}

	public int getAverage_Score() {
		return Average_Score;
	}

	public void setAverage_Score(int average_Score) {
		Average_Score = average_Score;
	}

	public int getReview_Cnt() {
		return Review_Cnt;
	}

	public void setReview_Cnt(int review_Cnt) {
		Review_Cnt = review_Cnt;
	}
	
	
}
