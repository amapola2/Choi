package sungbok.Project;

import java.util.ArrayList;

public class Academy {
	private String Study;

	public Academy(String study) {
		super();
		Study = study;
	}

	@Override
	public String toString() {
		return "NextIT [강의내용=" + Study + "]";
	}

	public String getStudy() {
		return Study;
	}

	public void setStudy(String study) {
		Study = study;
	}

	public static ArrayList<Academy> getqustionList() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
