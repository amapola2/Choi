package sungbok;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class submit07 {

	private static final Integer Array = null;

	public static void main(String[] args) {

		// Q1. 정수를 담을 수 있는 ArrayList 객체를 생성하고, 10부터 20 사이의 랜덤 숫자를 10개 담으시오.
		// (10도 나오고 20도 나올 수 있어야 함)


		ArrayList<Integer> intList = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			int Array = (int)(Math.random() * 10 ) + 11;
			intList.add(Array);
		}
		System.out.println(intList);
		
		System.out.println("\n=======================================문제 풀이================================================\n");
		
		ArrayList<Integer> intList4 = new ArrayList<>();
		
		// 10~20 => (int)(Math.random() * 11)<- 반복할 갯수) + 10 <- 시작점 
		// a~b => (int)(Math.random() * (b-a+1)) + a;
		
		
		for(int i = 0; i < 10; i++) {
			int rand = (int)(Math.random() * 11) +10;
			intList.add(rand);
		}
		System.out.println(intList);
		
		
		
		
		
		
		
		
		
		System.out.println("\n=======================================================================================\n");
		

		// Q1. 해당 정수형 리스트에서 중복된 숫자들을 제거한 후 출력하시오.
		
		ArrayList<Integer> intList1 = new ArrayList<>();
		int Array1 = (int) (Math.random() * 11) + 10;
		intList1.add(Array1);
		outer: while (true) {
			Array1 = (int) (Math.random() * 11) + 10;
			for (int i = 0; i < intList1.size(); i++) {
				if (intList1.get(i) == Array1) {
					continue outer;
				}
			}
			intList1.add(Array1);
			if (intList1.size() == 10) {
				break;
			}

		}
		System.out.println(intList1);
		
	}// 메인 	끝
		System.out.println("\n=======================================문제 풀이================================================\n");
		
	for(int i = 0; i < 10; i++) {
		int rand = (int)(Make.random() * 11) +10;
	
	
	
	public static int makeRandom(int a, int b) {
		return (int)(Math.random() * (b-a+1)) + a
	
		
				ArrayList<Integer> newList = new ArrayList<>();
		
	}
		System.out.println("\n=======================================문제 풀이 중복제거=========================================\n");
		
				for(int i = 0; i < intList.size(); i++) {
					// newList안에 현재의 intList.get(i) 가 존재하지
					// 않는 경우에만 추가해주기
					if(!newList.contains(intList.get(i))) {
						newList.add(intList.get(i));
					}
				}
		
			System.out.println("\n=======================================문제 풀이 중복제거=========================================\n");	
		// 중복제거 두번째 방법
		for(int i = 0; i < intList.size(); i++) {
			
			for(int k = intList.size()-1; k > i; k--) {
				if(intList.get(i) == intList.get(k)) {
					intList.remove(k);
				}
				
				
				
			}
		}
		
		
		System.out.println("\n=======================================================================================\n");
		
		
		// Q1. 중복을 제거한 정수형 리스트를 오름차순으로 정렬하여 출력하시오.
		
		
		
		
		Collections.sort(intList1);
		System.out.println(intList1);
	
		

		
		
		
		
		
		
		
		
		
		
		
		System.out.println("\n=======================================================================================\n");
		
		
		// Q1. 중복을 제거한 정수형 리스트를 내림차순으로 정렬하여 출력하시오.
		
		Collections.sort(intList1,Collections.reverseOrder());
		System.out.println(intList1);
		
		System.out.println("\n=======================================================================================\n");
		
		// Q. 02


		// 아내가 사고 싶은 물건  ["냉장고", "로봇청소기", "세탁기", "에어컨"] 을 리스트에 담아주세요.
				
		// 남편이 사고 싶은 물건 ["노트북", "TV", "에어컨", "플레이스테이션", "로봇청소기"] 을 다른 리스트에 담아주세요.

		// 1. 서로 사고 싶은 물건 목록을 새로운 리스트에 담아 콘솔에 출력해주세요(교집합)
		
		// Hint
		// 빈 리스트를 하나 만들고, 아내의 구매목록 리스트를 for문을 이용하여 순회하고, 
		// 각 구매 물품이 남편의 구매목록 리스트에 존재하는지 체크한다.
		// 만약 존재한다면 빈 리스트에 해당 물품을 저장한다.
		
		ArrayList<String> WWishList = new ArrayList<String>(Arrays.asList("냉장고", "로봇청소기", "세탁기", "에어컨"));
		ArrayList<String> MWishList = new ArrayList<String>(Arrays.asList("노트북", "TV", "에어컨", "플레이스테이션", "로봇청소기"));
		
		ArrayList<String> WishList = new ArrayList<String>();
		
		for(int i = 0; i < MWishList.size(); i++) {
			for(int n = 0; n < WWishList.size(); n++) {
				if(WWishList.get(n) == MWishList.get(i)) {
					WishList.add("사고싶은 목록" + MWishList.get(i));
					
			}
		}
			
	} System.out.println(WishList);
	System.out.println("\n====================================문제풀이===================================================\n");
	
		ArrayList<String> wipeList = new ArrayList<>();
		wipeList.add("냉장고")
		wipeList.add("로봇청소기")
		wipeList.add("에어컨")
		wipeList.add("세탁기")
		
		ArrayList<String> husList = new ArrayList<>();
		husList.add("TV")
		husList.add("노트북")
		husList.add("에어컨")
		husList.add("플스")
		husList.add("로봇청소기")
		
		// 서로 사고싶은목록
		
		ArrayList<String> wantBuy = new ArrayList<>();
		for(int i = 0; i < wipeList.size(); i++) {
		if(husList.contains(wipeList.get(i))) {
			wantBuy.add(wipeList.get(i));
		}
		}
		// 교집합을 위한 .retainAll()
		wantBuy.clear();
		wantBuy.addAll(wipeList); // 아내의 구매목록 전부를 담기
		wantBuy.retainAll(husList);
		syso
	
	
	
	
	// 2. 사고 싶은걸 다 산다고 했을때의 구매 목록을 새로운 리스트에 담아 콘솔에 출력해주세요(합집합)
	// Hint
	// 빈 리스트를 하나 만들고, 아내의 구매목록을 전부 담는다.
	// 이후 남편의 구매목록 리스트를 for문을 이용하여 순회하고, 
	// 남편의 구매 물품이 빈 리스트에 존재하지 않는다면 빈 리스트에 해당 물품을 추가한다.


		WishList = new ArrayList<String>();
		for(int w = 0; w < WWishList.size() ; w++) {
			WishList.add(WWishList.get(w));
		}
		
		
		
			for(int n = 0; n < MWishList.size(); n++) {
				if(WWishList.contains(MWishList.get(n))) {
					continue;
					
				}else {
					WishList.add(MWishList.get(n));
				}
				
			
		}
		
		System.out.println("사고싶은 목록" + WishList);
		
		System.out.println("\n====================================문제풀이===================================================\n");
		
		ArrayList<String> allBuy = new ArrayList<>();
		
		allBuy.addAll(wipeList);
		syso allBuy
		
		for(int i = 0; i < husList.size(); i++) {
			if(!allBuy.contains(husList.get(i))) {
				allBuy.add(husList.get(i));
			}
			
		}
		syso allBuy
		
		
		
		
		
		
		
		
		
		
		
		
//		// 로또 번호 (1~45 사이의 랜덤숫자)
//		int[] result = new int[6];
//		
//		// 중복 없이 로또 번호 6자리를 담기
//		int idx = 0;
//		outer: while(true) {
//			int rand = (int)(Math.random()*45) + 1;
//			
//			// rand가 result 배열 안에 없는 숫자라면
//			// 담기
//			for(int i = 0; i < result.length; i++) {
//				if(result[i] == rand) {
//					continue outer;
//				}
//			}
//			
//			result[idx] = rand;
//			idx++;
//			
//			if(idx == 6) {
//				break;
//			}
//		}
//		
//		// 오름차순 정렬
//		Arrays.sort(result);
//		
//		return result;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
}