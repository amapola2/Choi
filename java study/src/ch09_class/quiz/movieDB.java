package ch09_class.quiz;

import java.util.ArrayList;

public class movieDB {
	
	private ArrayList<movie> movieList = new ArrayList<>();
	
	// 싱글톤 패턴
	private movieDB() {
		movieList.add(new movie("신세계", "거 죽기 딱 좋은 날씨네", "이정재 황정민 박성웅", "ㅅㅅㄱ"));
		movieList.add(new movie("관상", "내가  왕 이 될상인가", "이정재 조정석 김혜수", "ㄱㅅ"));
		movieList.add(new movie("친구", "니가가라 하와이", "장동건 김광규", "ㅊㄱ"));
		movieList.add(new movie("태극기를 휘날리며", "돌아온다 했잖아요", "장동건 원빈 김수로", "ㅌㄱㄱㄹㅎㄴㄹㅁ"));
		movieList.add(new movie("타짜", "쏠수 있어", "김혜수 조승우 유해진 ", "ㅌㅉ"));
		movieList.add(new movie("범죄도시", "어째 내 라고만 생각하심까", "마동석 윤계상 박지환", "ㅂㅈㄷㅅ"));
		movieList.add(new movie("실미도", "날 쏘고 가라", "설경구 안성기 허준호", "ㅅㅁㄷ"));
		movieList.add(new movie("명량", "된다고 말하게", "최민식 류승룡 조진웅", "ㅁㄹ"));
		movieList.add(new movie("해적", "음파 음파", "유해진 김남길 손예진", "ㅎㅈ"));
		movieList.add(new movie("왕의남자", "너 거기있고 나 여기있지", "이준기 감우성 정진영", "ㅇㅇㄴㅈ"));
		movieList.add(new movie("광해", "푸드드드드득 뿌직", "이병헌 류승룡 한효주", "ㄱㅎ"));

		
	}
	private static movieDB instance = new movieDB();
	
	public static movieDB getInstance() {
		return instance;
		
	}
	public ArrayList<movie> getmovieList() {
		return movieList;
	}
	
	
	
}
