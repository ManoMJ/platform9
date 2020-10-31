package kr.co.dmtlabs.platform.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Resume {
	@Id
	@GeneratedValue
	private String Resume_Code;
	private String Member_Code;
	private int Age;
	private String 희망근무기간;
	private String 희망근무형태;
	private String 희망근무요일;
	private String 희망근무시간;
	private String 희망근무직종;
	private String 경력;
	private String 자격증;
	private String 자기소개서;
	private int 공개여부;
	
	public Resume() {}

	public String getResume_Code() {
		return Resume_Code;
	}

	public void setResume_Code(String resume_Code) {
		Resume_Code = resume_Code;
	}

	public String getMember_Code() {
		return Member_Code;
	}

	public void setMember_Code(String member_Code) {
		Member_Code = member_Code;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String get희망근무기간() {
		return 희망근무기간;
	}

	public void set희망근무기간(String 희망근무기간) {
		this.희망근무기간 = 희망근무기간;
	}

	public String get희망근무형태() {
		return 희망근무형태;
	}

	public void set희망근무형태(String 희망근무형태) {
		this.희망근무형태 = 희망근무형태;
	}

	public String get희망근무요일() {
		return 희망근무요일;
	}

	public void set희망근무요일(String 희망근무요일) {
		this.희망근무요일 = 희망근무요일;
	}

	public String get희망근무시간() {
		return 희망근무시간;
	}

	public void set희망근무시간(String 희망근무시간) {
		this.희망근무시간 = 희망근무시간;
	}

	public String get희망근무직종() {
		return 희망근무직종;
	}

	public void set희망근무직종(String 희망근무직종) {
		this.희망근무직종 = 희망근무직종;
	}

	public String get경력() {
		return 경력;
	}

	public void set경력(String 경력) {
		this.경력 = 경력;
	}

	public String get자격증() {
		return 자격증;
	}

	public void set자격증(String 자격증) {
		this.자격증 = 자격증;
	}

	public String get자기소개서() {
		return 자기소개서;
	}

	public void set자기소개서(String 자기소개서) {
		this.자기소개서 = 자기소개서;
	}

	public int get공개여부() {
		return 공개여부;
	}

	public void set공개여부(int 공개여부) {
		this.공개여부 = 공개여부;
	}
	
	
}
