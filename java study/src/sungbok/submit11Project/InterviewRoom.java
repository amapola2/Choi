package sungbok.Project;

import java.util.ArrayList;

public class InterviewRoom {
	
	String interviewList;

	public InterviewRoom(String interviewList) {
		super();
		this.interviewList = interviewList;
	}

	@Override
	public String toString() {
		return "면접실 [" + interviewList + "]";
	}

	public String getInterviewList() {
		return interviewList;
	}

	public void setInterviewList(String interviewList) {
		this.interviewList = interviewList;
	}

	public static ArrayList<InterviewRoom> getinterviewList() {
		// TODO Auto-generated method stub
		return null;
	}


	

}
