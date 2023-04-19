package sungbok.submit03;

public class submit03 {

	public static void main(String[] args) {
			//1번 
			// 10의 팩토리얼 값을 구하시오.
		int ten = 1;
		for (int i = 10; i >= 1; i--) {
			ten *=i;
				
		}
		System.out.println(ten);
		
		long rst = 1;
		for (int i = 1; i <= 10; i++) {
			rst *= i;
		}
		System.out.println(rst);
		
		
		
		
		System.out.println("\n================================================================/n");
		
		long fif = 1l;
		for (int i = 15; i >= 1; i--) {
			fif *=i;
		}
		
		System.out.println(fif);
		
		long lrst = 1;
		for (int i = 1; i <= 15; i++) {
			lrst *= i;
		}
		System.out.println(lrst);
		System.out.println("\n================================================================/n");
		
		//2번
		// 월리를 찾아라. 
		
			String FindWally = "윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월리월리윌리울리윌리울리일리울리울리윌리일리";
			
			int count = 0;
			for (int b = 0; b < FindWally.length(); b += 2) {
				String str = FindWally.substring(b, b+2);
				if (str.equals("월리")) {
					count++;
				}
			}
			System.out.println("월리의 갯수 : " + count);
//			
//			
//			
//			System.out.println(FindWally.substring(58,60));
//			for(int i = 0; i< FindWally.length() -1; i++) {
//				System.out.println(i + ": " + FindWally(i,i+2);
//				String str = FindWally.substring(i, i+2);
//				
//				if(str.equals("월리"));
//					count++;
//			
//			}
//			
			
			
			System.out.println("\n===============================5=================================/n");
			
			//3번
			// 거꾸로 트리를 만들어 주세요 
			
//			String star = "*****";
//			System.out.println("star.substring(1): "+star.substring(1));
//			System.out.println("star.substring(2): "+star.substring(2));
//			System.out.println("star.substring(3): "+star.substring(3));
//			System.out.println("star.substring(4): "+star.substring(4));
			System.out.println("\n=================================5===============================/n");
			
			for(int i = 0; i < 5; i++) {
				String space = "*";

				for(int k = 0; k < 4-i ; k++) {
					space += "*";
				}
				String stars = " ";
				for(int k = 0; k < (i*2)+1; k++) {
					stars += " ";
				}
				System.out.println(space + stars);
			}
			
			System.out.println("\n================================================================/n");
//				for (int s = 0; s < 5; s--) {
//					String space2 = "";
//					for (int w = 5; w > s; w--) {
//						space2 += "-";
//
//						String stars2 = "";
//						for (int e = 0; e <= 1 + (s * 2); e++) {
//							stars2 += "*";
//							System.out.println(space2 + stars2);
//						}
//					}
//				
//			
//					String stars22 = "*****";
//					
//					// i가 			0 ,1 , 2, 3, 4 일때
//					// stars22 는	5 ,4 , 3, 2, 1 개
//					// stars22.substring(????) 의 결과가 5, 4, 3, 2, 1개
//					
//					for(int i = 0; i < 5; i++) {
//						System.out.println(stars22.substring(i));
//					}
//					
//					
					
					
				
			
			
			
			
			
			
			
					
			
			
			
			
			
			
		}
	}
	

