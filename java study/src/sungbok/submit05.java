package sungbok;

public class submit05 {

	public static void main(String[] args) {
		// 1번 n층 짜리 트리를 출력할 수 있는 makeTree(int n) 메소드를 만들어서 실행시켜 주세요.

		maketree(5);

		String example = "로꾸꺼 로꾸꺼";
		String result = reversestr(example);
		System.out.println(result);

		String binaryString = makebinary(23);
		System.out.println(binaryString);

		String binaryString1 = Integer.toBinaryString(17);
		System.out.println(binaryString1); 
	}// main끝
		// 2번 로꾸꺼를 메소드로 만들어서 파라미터로 들어온 String 문자열에 대해 뒤집은 결과를 리턴하는 메소드를 만들어보세요.

	// 3번 십진수를 이진수(String 타입)로 리턴해주는 makeBinary(int 타입) 함수를 만들어보세요.
	// (자바에서 이진수, 16진수 등등은 문자열)
	// 17을 이진수로 변환 -> "10001"

	public static void maketree(int b) {

		// for문에 6번 실행
		// i가 0, 1, 2, 3, 4, 5 일때
		// 공백은 5, 4, 3, 2, 1, 0
		// 별(*)은 1, 3, 5, 7, 9, 11 다.

		for (int i = 0; i < b; i++) {
			String space = "";
			for (int k = 0; k < b - i; k++) {
				space += " ";
			}

			String stars = "";
			for (int k = 0; k < (i * 2) + 1; k++) {
				stars += "*";
			}

			System.out.println(space + stars);
		}

//		String star = "";
//		
//		for(int a = 0; a < 5; a++) {
//			star += "*";
//			System.out.println(star);
//		}

	}

	public static String reversestr(String example) {

		String a = "";
		for (int i = example.length(); i >= 1; i--) {
			String str = example.substring(i - 1, i);

			a += str;
		}
		return a;

	}

	public static String makebinary(int num) {
		// num에 17이 들어왔다.
		// 17을 2로 나눠서 나머지 1 / 몫은 8
		//  8을 2로 나눠서 나머지 0 / 몫은 4
		//  4를 2로 나눠서 나머지 0 / 몫은 2
		//  2를 2로 나눠서 나머지 0 / 몫은 1 
		//  1을 2로 나워서 나머지 1 / 몫은 0 (스탑)
		
		// 반복횟수와 기준이 애매하면 while(true)
		String result = "";
		while(num > 0) {
			result += num % 2;
			num = num / 2;
			
			if(num == 0) {
				break;
			}
		}
			
			return reversestr(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

		
		
	}
}