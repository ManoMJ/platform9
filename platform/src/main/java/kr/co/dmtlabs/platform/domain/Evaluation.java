package kr.co.dmtlabs.platform.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Evaluation {
	@Id
	@GeneratedValue
	private String Eval_Code;
	private String Result_Code;
	private String Evaluatee;
	private String Evaluator;
	private double Score;
	private String Evaluated_Item;
	private String Creatred_Time;
	
	public Evaluation() {}

	public String getEval_Code() {
		return Eval_Code;
	}

	public void setEval_Code(String eval_Code) {
		Eval_Code = eval_Code;
	}

	public String getResult_Code() {
		return Result_Code;
	}

	public void setResult_Code(String result_Code) {
		Result_Code = result_Code;
	}

	public String getEvaluatee() {
		return Evaluatee;
	}

	public void setEvaluatee(String evaluatee) {
		Evaluatee = evaluatee;
	}

	public String getEvaluator() {
		return Evaluator;
	}

	public void setEvaluator(String evaluator) {
		Evaluator = evaluator;
	}

	public double getScore() {
		return Score;
	}

	public void setScore(double score) {
		Score = score;
	}

	public String getEvaluated_Item() {
		return Evaluated_Item;
	}

	public void setEvaluated_Item(String evaluated_Item) {
		Evaluated_Item = evaluated_Item;
	}

	public String getCreatred_Time() {
		return Creatred_Time;
	}

	public void setCreatred_Time(String creatred_Time) {
		Creatred_Time = creatred_Time;
	}
	
}
