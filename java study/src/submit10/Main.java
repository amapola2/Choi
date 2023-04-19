package submit10;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Library library = Library.getInstance();
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("행동을 선택해주세요");
			System.out.println("");
			System.out.println(">>> ");
			
		}else if(command == 2) {
				// 책 대여
				System.out.println("책번호를 선택해주세요");
				System.out.println(">>> ");
				
				String name = scan.nextLine();
				
				// name을 포함하는 book객체들을 찾아서 
				// 가져오기
				ArrayList<Book> bookList = library.searchBook(name);
				
				if(bookList.size() == 0) {
					System.out.println("해당 책이 존재하지 않습니다.");
					}else if(searchList.size()==1) {
						library.borrowBook(searchList.get(0).getNo());
					}else {
						System.out.println("책 번호를 입력해주세요");
						System.out.println(">>> ");
						
						scan
						
			int command = Integer.parseInt(scan.nextLine);
			
		}else if(command == 3) {
				//책 목록
				library.showBookList();
		}else if(command == 4) {
				//책 검색
				System.out.println("책이름을 입력해주세요");
				System.out.println(">>> ");
				
				String name = scan.nextLine();
				
				
				
				
				
			}
		}
	}

    
}
