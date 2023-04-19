package sungbok.Project;

import java.util.ArrayList;

import ch09_class.quiz.movie;
import ch09_class.quiz.movieDB;

public class AcademyDB {
	
	private ArrayList<Academy> qustionList = new ArrayList<>();
	
	private AcademyDB() {
		qustionList.add(new Academy("자바에서 반복문이란 다양한 종류의 반복문이 제공되며, \n 주로 for, while, do-while 반복문을 사용합니다. \n 이러한 반복문을 사용하면 특정한 작업을 여러 번 반복해서 수행할 수 있습니다. \n for 반복문은 주로 반복 횟수를 알고 있을 때 사용합니다.\n while 반복문은 주로 반복 횟수를 알 수 없을 때 사용합니다. \n do-while 반복문은 while 반복문과 유사하지만, 조건식을 먼저 검사하지 않고 반복 실행된 후에 조건식을 검사합니다. \n 따라서 do-while 반복문은 최소한 한 번은 실행됩니다. "));
		qustionList.add(new Academy("자바에서 메서드는 코드의 재사용성을 높이고 프로그램의 구조화를 용이하게 하기 위해 사용됩니다. \n 메서드는 입력값을 받아서 처리하고, 결과값을 반환하는 기능을 수행합니다.\n 접근제어자: 메서드가 호출될 수 있는 범위를 지정합니다. public, protected, private 등이 있습니다.\n" + 
				"static: 메서드를 정적 메서드로 선언할 때 사용합니다. 정적 메서드는 클래스 이름으로 바로 호출할 수 있습니다.\n" + 
				"반환타입: 메서드가 반환하는 값의 데이터 타입을 지정합니다. 반환값이 없을 경우 void를 사용합니다.\n" + 
				"메서드이름: 메서드의 이름을 지정합니다.\n" + 
				"매개변수: 메서드에 전달되는 입력값의 타입과 이름을 지정합니다. 매개변수가 없을 경우 비워둡니다.\n" + 
				"return 반환값: 메서드가 반환하는 값이 있을 경우 return 키워드를 사용하여 반환값을 지정합니다"));
		qustionList.add(new Academy("자바에서 배열(Array)은 동일한 타입의 여러 변수를 하나의 묶음으로 다룰 수 있게 해주는 데이터 구조입니다. 배열을 사용하면 인덱스를 사용하여 배열 내에서 원하는 요소에 직접 접근할 수 있습니다.\n" + 
				"\n" + 
				"배열은 선언 시 배열의 크기를 정해줘야 합니다. 배열의 크기는 변경할 수 없으므로, 배열에 저장할 요소의 개수를 알고 있어야 합니다."));
		qustionList.add(new Academy("자바에서 리스트(List)는 자료구조 중 하나로, 동적으로 크기가 변하는 배열과 같은 역할을 합니다. 리스트는 순서가 있는 일련의 객체 집합을 저장할 수 있으며, 원하는 위치에 요소를 삽입하거나 삭제할 수 있습니다.\n" + 
				"\n" + 
				"자바에서는 java.util 패키지에서 List 인터페이스를 제공합니다. 이 인터페이스는 ArrayList, LinkedList, Vector 등의 클래스에서 구현됩니다. 각 클래스는 내부적으로 요소를 저장하는 방법과 데이터의 접근 방법 등이 조금씩 다르며, 특정한 상황에서 성능 차이가 발생할 수 있습니다.\n" + 
				"\n" + 
				"List 인터페이스의 주요 메서드로는 다음과 같은 것들이 있습니다.\n" + 
				"\n" + 
				"add(E e): 리스트에 요소를 추가합니다.\n" + 
				"get(int index): 해당 인덱스에 있는 요소를 반환합니다.\n" + 
				"remove(int index): 해당 인덱스에 있는 요소를 삭제합니다.\n" + 
				"size(): 리스트의 크기를 반환합니다.\n" + 
				"리스트는 자료의 삽입과 삭제가 빈번히 일어나는 상황에서 매우 유용하게 사용됩니다. 예를 들어, 게시판에서 게시글 목록을 보여주거나, 쇼핑몰에서 상품 목록을 보여주는 등의 상황에서 리스트가 자주 사용됩니다."));
		qustionList.add(new Academy("자바에서 클래스(Class)란 객체 지향 프로그래밍(OOP)에서 가장 기본적인 개념 중 하나입니다. 클래스는 객체를 생성하기 위한 일종의 틀이나 청사진으로, 객체의 속성(attribute)과 기능(method)을 정의합니다.\n" + 
				"\n" + 
				"객체는 클래스를 이용하여 생성되며, 이 때 클래스에서 정의한 속성과 메소드를 그대로 상속받게 됩니다. 이를 통해 객체는 클래스에서 정의한 속성과 메소드를 사용할 수 있게 됩니다.\n" + 
				"\n" + 
				"자바에서 클래스는 클래스 이름, 속성, 생성자(constructor), 메소드로 이루어져 있습니다. 클래스 이름은 대문자로 시작하며, 일반적으로 클래스 내에서는 CamelCase를 사용하여 작성합니다.\n" + 
				"\n" + 
				"속성은 클래스에서 정의한 변수들을 의미합니다. 이 변수들은 클래스 내에서 생성된 객체의 속성으로 사용됩니다. 생성자는 클래스를 이용하여 객체를 생성할 때 호출되는 메소드로, 객체의 초기화를 담당합니다. 메소드는 클래스에서 정의한 함수들을 의미하며, 객체가 수행할 수 있는 작업들을 정의합니다."));
	}
		private static AcademyDB instance = new AcademyDB();
		
		public static AcademyDB getInstance() {
			return instance;
			
		}
		public ArrayList<Academy> getqustionList() {
			return qustionList;
			
		}


		
	
}
