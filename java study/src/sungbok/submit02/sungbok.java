package sungbok.submit02;

import java.util.Scanner;

public class sungbok {

	public static void main(String[] args) {

		
		
//		// Scanner 클래스로부터 객체 생성
//		
//				Scanner scan = new Scanner(System.in); 
//				
//				System.out.println("이름을 입력해주세요.");
//				System.out.print(">>> ");
//				String name = scan.nextLine();
//				
//				System.out.println("국어점수를 입력해주세요.");
//				System.out.print(">>> ");
//				int Hscore = Integer.parseInt(scan.nextLine());
//				
//				System.out.println("영어점수를 입력해주세요.");
//				System.out.print(">>> ");
//				int Escore = Integer.parseInt(scan.nextLine());
//		
//				System.out.println("수학점수를 입력해주세요.");
//				System.out.print(">>> ");
//				int Mscore = Integer.parseInt(scan.nextLine());
//				
////				double avg = (kor + eng + math)/300;
////				System.out.println("평균:%.2f", avg );
//		
//			    double A= (Hscore+Escore+Mscore)/3.00;
//			    
//			    
//				String grade="";
//				
//			    if (A >= 90) {
//					grade = "A";
//				} else if (A >= 80) {
//					grade = "B";
//				} else {
//					grade = "C";
//				}
//				
////			    Sting grade = ( avg>=90) ? ("a") : ((avg>=80)))
//			    
//		System.out.println("이름:" + name);
//		System.out.println("국어점수:" + Hscore);
//		System.out.println("영어점수:" + Escore);
//		System.out.println("수학점수:" + Mscore);
//		System.out.printf("평균:%.2f " , A);
//		System.out.println("");
//		System.out.println("등급:"+ grade);
//		
//		
//		
//		String idBack = "1231476";
//		String idBack_A = idBack.substring(0,1);
//		int B = Integer.parseInt(idBack_A)%2;
//		
//		
//		System.out.println((B == 1) ? ("남자") : ("여자"));
		
		
		
		
////		String idBack = "1231476";
//		
//		String first = idBack.substring(0,1);
//		
////		char start = idBack.charAt(0,1);
//		System.out.println(start);
//		
//		String strStart = start +"";
//		System.out.println(strStart);
//		
//		int num = Integer.parseInt(strStart);
//		
//		String gender = (num % 2 == 1) ? ("남") : ("여");
//		System.out.println(gender);
//		
		
		
		
		
	
	
		
		
		
		System.out.println("\n===============================\n");
		
		
		
		
			for (int e = 1; e > 9; e += 2) {
				System.out.println(e * 2);
				
			}
			for (int e = 9; e>= 0; e -= 2) {
				System.out.println(e * 2);
			}
		
		
		
			System.out.println("\n===============================\n");
			
	
			
			// for (int i = 0; 제어; 증가 감소 )
			//for( 변수선언; 증가나 감소에 따른 멈춤; 증가,감소)
			
			String star = "*";
			
			for (int i = 1; i <= 5; i++) {
				System.out.println(star);
				star += "**";
			}
		
			System.out.println(star);
			
			System.out.println("\n===============================\n");
			
			String star2 = star.replace("*","");
			for (int i = 1; i < 5; i++) {
				System.out.println(star2);			
			star2 += "***";
			
			
			}
			
			System.out.println("\n===============================\n");
			
			
			
			
			
			
			
			
//			int a= 1; 
//			System.out.println(a);
//			double b= 1.6;
//			System.out.println(b);
//			String c= "글씨";
//			System.out.println("글씨");
//			
//			System.out.println("println처럼 동작\n");
//			System.out.println("중간에 \n을 넣어보자");
//			
//			
//			System.out.println("1\t2\t3");
//			
//			System.out.println("개행문자는 \\\\n fadsf");
//			
//			System.out.printf("%d명이 수업을 듣고있습니다\n",24);
//			
//			System.out.printf("\n%d명이 %s을 듣고있습니다", 24,"수업");
//			
//			
//			System.out.printf("\n%012d장 표준 입출력\n",12);
//			System.out.printf("원주율 %.03f",3.1);
//			System.out.println("-------------------------");	
			
	Scanner scan = new Scanner(System.in);
				System.out.println("이름을 입력해주세요");
				System.out.println(">>>");
				
				String name = scan.nextLine();
				
				System.out.println(name + ": 좀 덥네요");
				System.out.println("에어컨 온도를 올려주세요");
				System.out.println(">>>");
				int temper  = Integer.parseInt(scan.nextLine());
				System.out.println("희망온도: "+temper);
				
				
				String name1 = scan.nextLine();
				
				System.out.println();
				
				System.out.println("희망온도 :냉방 난방을 선택해주세요");
				System.out.println(">>>");
				
				String 냉방 = scan.nextLine();
				System.out.println("모드 : 난방");

				
			
			
			
			
			
			
			
			
			
			
			
	}       

}
