package sungbok.Project;

public class Run {
	
	public static void run() {
	String lane1 = "최성복. ";
	String lane2 = "박창연. ";
	String lane3 = "이자영. ";
	String lane4 = "백민기. ";

	while(true) {
		// 확률에 따른 전진
		// Math.random()은 0부터 1사이의 랜덤 소수 리턴
		// random에 0~7 중 랜덤한 숫자가 담긴다.
		int random = (int)(Math.random() * 5);
		
		// 1/8 확률
		if(random == 1) {
			lane1 += "~";
		}else if(random == 2) {
			lane2 += "~";
		}else if(random == 3) {
			lane3 += "~";
		}else if(random == 4) {
			lane4 += "~";

		
		// 콘솔창에 줄바꿈 20번해서
		// 기존 텍스트를 지움(안보이게)
		for(int i = 0; i < 5; i++) {
			System.out.println();
		}
		
		// 진행 상황 출력
		System.out.println(lane1 + "🦶" + "🦶");
		System.out.println("                 ");
		System.out.println(lane2 + "🦶" + "🦶");
		System.out.println("                 ");
		System.out.println(lane3 + "🦶" + "🦶");
		System.out.println("                 ");
		System.out.println(lane4 + "🦶" + "🦶");

		
		// 결승선 통과 처리
		if(lane1.length() == 30) {
			System.out.println("최성복 승리!!");
			break;
		}else if(lane2.length() == 30) {
			System.out.println("박창연 승리!!");
			break;
		}else if(lane3.length() == 30) {
			System.out.println("이자영 승리!!");
			break;
		}else if(lane4.length() == 30) {
			System.out.println("백민기 승리!!");
		}
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
}
}
