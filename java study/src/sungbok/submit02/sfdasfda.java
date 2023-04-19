package sungbok.submit02;

public class sfdasfda {

	public static void main(String[] args) {

		 
	
		
		
		
//		
//		System.out.println("hello world");
//		
//		
//		
//		
//		
//		int a = 1;
//				int b = 2;
//				System.out.println(a+b);
//				
//		int d = 5;
//		int f = 3;
//		System.out.println(d%f);
//		
//		
//		
//		
//		
//		int s = 7;
//				int q = 3;
//				System.out.println(s+q);
//		System.out.println(s-q);
//		System.out.println(s*q);
//		System.out.println(s/q);
//		System.out.println(s%q);
		//(조건) ? ("참") : ("거짓") 
		//(조건) ? ("참") : ((조건) ? ("참") : ((조건) ? ("참") : ("거짓"))) 
		int a = 10;
		int b = 15;
		
		
		
		System.out.println((a<b) ? ("<") :((a>b) ? (">") :("=")));
		
		
				
		
		String name  = "홍길동";
		int age      =  26;
		double height   = 177.9;
		String phone    = "010-7398-7332";
		String email = "gildong@gmail.com";
		
		System.out.println(("이름: ")+name);
		System.out.println(("나이: ")+age);
		System.out.println(("키: ")+height);
		System.out.println(("번호: ")+phone);
		System.out.println(("메일: ")+email);
		
		
		
		
		
		String enigma = "너오구늘리뭐너먹구지리"; 
		String enigma_one = enigma.replace("너","");
		String enigma_two = enigma_one.replace("구", "");
		
		
		
		System.out.println(enigma_two.replace("리", ""));
		
		
		
		int example = 278;
		String A = Integer.toString(example);
		String B = A.substring(0,1);
		String C = A.substring(1,2);
		String D = A.substring(2,3);
		
		int Q = Integer.parseInt(B);
		int W = Integer.parseInt(C);
		int E = Integer.parseInt(D);
	System.out.println(Q+W+E);
	
		

		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
