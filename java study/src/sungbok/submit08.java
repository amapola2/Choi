package sungbok;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class submit08 {

	public static void main(String[] args) {
		
		//makeLotto를 ArrayList와 HashSet을 이용해서 만들어보세요

				//Hint
				//먼저 빈 HashSet을 하나 만들고, while문 내에서 빈 HashSet에 랜덤 로또 번호를 HashSet의 사이즈가 6개가 될 때까지 넣는다.
				//이후 HashSet을 ArrayList로 변환한 다음, 오름차순으로 ArrayList를 정렬하여 리턴한다.

		ArrayList<Integer> myLotto = makeLotto();
		System.out.println(myLotto);
		
		System.out.println("\n======================================================\n");
		
		//infoMap의 Key는 사용자의 아이디, Value는 사용자의 비밀번호라고 했을 때 아래와 같이 데이터를 추가해주세요.

		//HashMap<String, String> infoMap = new HashMap<>();
				
		//infoMap.put("a001", "1234a");
		//infoMap.put("b001", "1234b");
		//infoMap.put("c001", "1234c");
		//infoMap.put("d001", "1234d");
		//infoMap.put("e001", "1234e");


		//사용자가 아이디와 비밀번호를 파라미터로 넣었을때, 
		//infoMap의 Key(아이디)와 Value(비밀번호)와 비교하여

		//아이디와 비밀번호가 infoMap 내에 존재하는 데이터와 일치하면 로그인 성공 출력
		//아이디가 존재하지 않으면, 존재하지 않는 아이디입니다. 출력 
		//아이디는 존재하지만 비밀번호가 일치하지 않으면 비밀번호가 틀렸습니다. 출력
		System.out.println("\n======================================================\n");
		HashMap<String, String> infoMap = new HashMap<>();
		
		infoMap.put("a001", "1234a");
		infoMap.put("b001", "1234b");
		infoMap.put("c001", "1234c");
		infoMap.put("d001", "1234d");
		infoMap.put("e001", "1234e");
		
		Set<String> keys = infoMap.keySet();
		for(String key : keys) {
			System.out.println(key + ": " + infoMap.get(key));
		}
			
			// temp[0] = 아이디
			// temp[1] = 비번
	}
		System.out.println(infoMap);
		System.out.println("\n=========================풀이=============================\n");
		
		HashMap<String, String> infoMap = new HashMap<>();
		
		infoMap.put("a001", "1234a");
		infoMap.put("b001", "1234b");
		infoMap.put("c001", "1234c");
		infoMap.put("d001", "1234d");
		infoMap.put("e001", "1234e");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("아이디를 입력해주세요.");
		System.out.print(">>> ");
		String id = scan.nextLine();
		
		System.out.println("비밀번호를 입력해주세요.");
		System.out.print(">>> ");
		String pw = scan.nextLine();
		
		// 입력한 id가 key값 중에 존재하면 true,없으면 false
		infoMap.containsKey(id)
		// 입력한 id가 key값 중에 존재하면 value 리턴, 없으면 null리턴
		// 입력한 id가 key값 중에 존재하면 null이 아님 ,없으면 null리턴
		infoMap.get(id)
		
		if(infoMap.get(id) != null) {
			//id가 map안에 key값으로 존재
			
			// TODO 비밀번호 체크
			if(infoMap.get(id).equals(pw)) {
				System.out.println("로그인 성공");
			}else {
			}System.out.println("존재하지않는 비밀번호입니다.");
			}else {
			//id가 map안에 key값으로 존재하지않음
			System.out.println("존재하지않는 아이디입니다");
		
		
		
		
		
		
		
		
		
		System.out.println("\n=========================풀이=============================\n");
		
		
		
	public static ArrayList<Integer> makelotto(){
			HashSet<Integer> lottoSet = new HashSet<>();
			
			while(lottoSet.size() < 6) {
				// 랜덤 로또 번호를 lottoSet에 사이즈가 6이 될때까지 
				// 담는다.
				int rand = (int)(Math.random()*45) + 1;
				lottoSet.add(rand);
				
//				if(lottoSet.size() == 6) {
//					break;
//				}
					
			}
			// set의 값들을 ArrayList에 옮긴다.
			ArrayList<Integer> result = new ArrayList<>();
			result.addAll(lottoSet);
			for(Integer num : lottoSet) {
				result.add(num);
			}
			// 정렬
			Collections.sort(result);
			
			return result;
			
	}
			
		

//				public static ArrayList<String> makeSongList(String name 
//						, ArrayList<String> playList) {
//					
//					
//					ArrayList<String> result = new ArrayList<>();
//					for(int i = 0; i < playList.size(); i++) {
//						String[] temp = playList.get(i).split(": ");
//						
//						// temp[0] 제목
//						// temp[1] 가수
//						if(name.equals(temp[1])) {
//							result.add(temp[0]);
//						}
//					}
//					return result;
//				}
//				
				
				
				
				
				
				
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("아이디를 입력해주세요.");
			System.out.print(">>> ");
			String name = scan.nextLine();
			
			System.out.println("비밀번호 입력해주세요.");
			System.out.print(">>> ");
			String name1 = scan.nextLine();
			
			 if (!infoMap.equals) { 
					System.out.println("존재하지않는 아이디입니다");
					break outer;
				} else if (infoMap.equals) {
					System.out.println("존재하지않는 비밀번호 입니");
					break outer;
				}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
	
	
	
	public static ArrayList<Integer> makeLotto() {
		
		ArrayList<Integer> result = new ArrayList<>();
		
		HashSet<Integer> mylotto = new HashSet<Integer>();
		
		while (mylotto.size() < 6) {
			mylotto.add((int) (Math.random() * 45) + 1);
		}
		result.addAll(mylotto); 
		return result;
	

	}
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}



