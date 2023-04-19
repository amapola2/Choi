package sungbok.Project;

import java.util.ArrayList;

public class InterviewRoomDB {

	private ArrayList<InterviewRoom> interviewList = new ArrayList<>();
		
		private InterviewRoomDB() {
			interviewList.add(new InterviewRoom("자격증이 있습니까???"));
			interviewList.add(new InterviewRoom("지원하신 회사에 대해서 알고계셨습니까???"));
			interviewList.add(new InterviewRoom("노예같이 일할수있습니까???"));
			interviewList.add(new InterviewRoom("주말에도 일할수 있습니까???"));
			interviewList.add(new InterviewRoom("넥스트IT 수료하셨습니까???"));
		}
		private static InterviewRoomDB instance = new InterviewRoomDB();
		
		public static InterviewRoomDB getInstance() {
			return instance;
			
		}
		public ArrayList<InterviewRoom> getinterviewList() {
			return interviewList;
		}
		

	
	
}
