package sungbok;

import java.util.ArrayList;
import java.util.Collections;

public class submit09 {

	public static void main(String[] args) {
		
		product cold = new product("냉장고", 2000000);
		product tele = new product("TV", 1000000);
		product air = new product("에어컨", 800000);
		product com = new product("컴퓨터", 1300000);
		product blow = new product("선풍기", 100000); 
		
		System.out.println(cold);
		System.out.println(tele);
		System.out.println(air);
		System.out.println(com);
		System.out.println(blow);
		
		ArrayList<product> itemList = new ArrayList<>();
		
		itemList.add(cold);
		itemList.add(tele);
		itemList.add(air);
		itemList.add(com);
		itemList.add(blow);
		
		System.out.println("\n==========================정렬 풀이===========================================\n");
		
		Collections.sort(itemList,(prodA,prodB) -> prodA.getPrice() - prodB.getPrice());
		for(int i = 0; i < itemList.size(); i++) {
			System.out.println(itemList.get(i));
		}
		
		
		for(int a = 0; a < itemList.size() - 1; a++) {
			for(int b = 0; b < itemList.size() -1; b++) {
				// a > a+1 하면 오름차순
				// b < b+1 하면 내림차순
				if(itemList.get(b).price < itemList.get(b+1).price) {
					product t = itemList.get(b);
					itemList.set(b, itemList.get(b+1));
					itemList.set(b+1, t);
				}
			}
		}
		for(int i = 0; i < itemList.size(); i++) {
			System.out.println(" product " +  itemList.get(i));
		}
		
		System.out.println("\n==========================indexOf 소개==========================================\n");
		// indexOf()
		// ArrayList<String> ramen = ["신라면", "안성탕면", "진라면"]
		// ArrayList<Integer> number = [10, 20, 30]
		// ramen.indexOf("안성탕면") = 1
		
		// ArrayList<Product> itemList = [product객체(냉장고), product객체(TV),..............]
		// ArrayList.indexOf("TV")=

		System.out.println("\n===============================================================================\n");
		
		for(int i = 0; i <itemList.size(); i++) {
			if(itemList.get(i).getName().equals("TV")) {
				System.out.println(i);
			}
		}
		
		
		
		
		
		   int index = -1;
	        for (int i = 0; i < itemList.size(); i++) {
	            if (itemList.get(i).getName().equals("TV")) {
	                index = i;
	                break;
	            }
	        }

	        if (index != -1) {
	            System.out.println(index);
	        }
		
		
		
		
		
		
		
		
//		// 지혜
//		// 객체를 생성하면서 필드변수 값을 채우기
//		// 생성자의 파라미터 순서에 유의해서 필드 변수의 값을 넣는다.
//		NextStudent jihye = new NextStudent("지혜" , 28, 3, 40);
//		System.out.println(jihye.name);
//		System.out.println(jihye.age);
//		System.out.println(jihye.Level);
//		System.out.println(jihye.Exp);
		
	}
	
	
}
