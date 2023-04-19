package sungbok;

import java.util.Scanner;

public class submit4 {

	public static void main(String[] args) {

		// 01번
		// 로꾸꺼 로꾸꺼
		// 사용자에게 문자열을 입력받으시고 입력받은 문자열의 순서를 뒤집어서 출력하시오
		Scanner scan = new Scanner(System.in);
		System.out.println("거꾸로 뒤집을 문자열 입력:");
		String name = scan.nextLine();

		String str = "";

		for (int a = name.length(); a >= 1; a--) {

			String b = name.substring(a - 1, a);
			str = str + b;

		}
		
		str = "";
		System.out.printf("뒤집은 결과:");
		for (int a = name.length(); a >= 1; a--) {

			str = name.substring(a - 1, a);
			System.out.printf(str);

		}
		System.out.println("\n=======================풀이=================================\n");
		
		// 01번
		// 로꾸꺼 로꾸꺼
		// 사용자에게 문자열을 입력받으시고 입력받은 문자열의 순서를 뒤집어서 출력하시오
		
//		Scanner scan1 = new Scanner(System.in);
//		
//		System.out.println("거꾸로 뒤집을 문자열 입력: ");
//		String input = scan1.nextLine();
//		
//		// 한글자씩 잘라보기
//		String result = "";
//		// 로꾸거
//		// substring(2,3) -> 거
//		// substring(1,2) -> 꾸
//		// substring(0,1) -> 로
//		for(int i = input.length(); i >= 1; i++) {
//			String str1 = input.substring(i,i+1);
//			
//			System.out.println(str1);
//			// 로꾸거
//			result += str1;
//		}
//		System.out.println("뒤집은 문자열:" + result);
//		
//		
//		
//		
//		
//		
//		
//		// 2번
//		// 엘리베이터가 두 대 있는 빌딩에서 엘리베이터 버튼을 눌렀을 때, 한 대의 엘리베이터만 이동하는 프로그램을 구현해 봅시다.
//
//		// 1. 사용자가 현재 위치를 입력하면 사용자의 위치와 가까운 엘리베이터가 이동한다.
//		// 2. 사용자의 위치와 두 엘리베이터의 위치 차이가 동일하다면 위 층 엘리베이터가 내려온다.
//		// ex) 엘리베이터 A는 1층, B는 7층일때 사용자의 위치가 4층이면 엘리베이터 B가 내려온다.
//		// 3. 사용자의 위치로 엘리베이터의 위치를 바꿔준다.
//		// 4. 엘리베이터 프로그램을 종료하려면 q, exit 중 하나를 입력한다.
//		
//		
//		int a = 10;
//		int b = 4;
//		
//		outer:while(true) {
//			
//			System.out.println("\n==================희영빌딩 엘리베이터 ================\n");
//		
//		System.out.println("승강기 A의 현재위치는:" + a + "층");
//		System.out.println("승강기 B의 현재위치는:" + b + "층");
//		System.out.printf("몇층에 계신가요? [종료를 하시려면 q 또는 exit  입력]");
//		Scanner floor = new Scanner(System.in);
//		String z = floor.nextLine();
//		
//		 if (z.equals("q")) { 
//
//			System.out.println("종료하겠습니다");
//			break outer;
//			
//		} else if (z.equals("exit")) {
//			System.out.println("종료하겠습니다");
//			break outer;
//		}
//		 
//		System.out.println( z + "층에서 엘리베이터를 호출합니다.");
//		
//		int c = Integer.parseInt( z );
//	
//		if (Math.abs(c - a) > Math.abs(c - b)) {
//
//			System.out.println("승강기B가" + c + "층으로 이동하였습니다");
//			b = c; 
//		} else if (Math.abs(c - a) < Math.abs(c - b)) {
//			System.out.println("승강기A가" + c + "층으로 이동하였습니다");
//			a = c; 
//
//		} else {
//
//		}
//
//		}

		System.out.println("\n=======================풀이=================================\n");
		// 2번
		// 엘리베이터가 두 대 있는 빌딩에서 엘리베이터 버튼을 눌렀을 때, 한 대의 엘리베이터만 이동하는 프로그램을 구현해 봅시다.

		// 1. 사용자가 현재 위치를 입력하면 사용자의 위치와 가까운 엘리베이터가 이동한다.
		// 2. 사용자의 위치와 두 엘리베이터의 위치 차이가 동일하다면 위 층 엘리베이터가 내려온다.
		// ex) 엘리베이터 A는 1층, B는 7층일때 사용자의 위치가 4층이면 엘리베이터 B가 내려온다.
		// 3. 사용자의 위치로 엘리베이터의 위치를 바꿔준다.
		// 4. 엘리베이터 프로그램을 종료하려면 q, exit 중 하나를 입력한다.
		
		int elevatorA = 10; // 엘리베이터의 위치는 10층
		int elevatorB = 4;  // 엘리베이터의 위치는 4층
		
		
		while(true) {
			System.out.println("\n============== 희영빌딩 엘리베이터 ================\n");
			System.out.println("승강기 A의 현재 위치: " + elevatorA);
			System.out.println("승강기 B의 현재 위치: " + elevatorB);
			System.out.print("몇층에 계시나요?[종료는 q 또는 exit]: ");
			
			String inputText = scan.nextLine();
			
			if(inputText.equals("q") || inputText.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			int floor = Integer.parseInt(inputText);
			
			// 층수 차이 계산
			int diffA = Math.abs(elevatorA - floor); // 10 - 9 = 1
			int diffB = (elevatorB < floor) ? (floor - elevatorB) : (elevatorB - floor);
			
			if(diffA > diffB) {
				System.out.println("엘리베이터 B가 " + floor + "층으로 이동하였습니다.");
				elevatorB = floor;
			}else if(diffA < diffB) {
				System.out.println("엘리베이터 A가 " + floor + "층으로 이동하였습니다.");
				elevatorA = floor;
			}else {
				if(elevatorA > elevatorB) {
					System.out.println("엘리베이터 A가 " + floor + "층으로 이동하였습니다.");
					elevatorA = floor;
				}else {
					System.out.println("엘리베이터 B가 " + floor + "층으로 이동하였습니다.");
					elevatorB = floor;
				}
			}
			
		}
		
		
	}

}