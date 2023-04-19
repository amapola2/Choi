package sungbok;

public class product {

	String name;
	int price;
	
	
	public product(String name, int price) {
		this.name = name;
		this.price = price;
		
	}

	// 시작전 toString 과 getter 와 setter를 만들고 시작하기 
	@Override
	public String toString() {
		return "제품명 :" + name + ", 가격=" + price + "";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	// toString()메소드
	// 단축키[Alt + Shift + s]
	// Generate toString()
//	@Override
//	public String toString() {
//		return "넥스트3월반 [이름=" + name + ", 나이=" + age + ", 레벨=" + Level + ", 경험치=" + Exp + "]";
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

//// 생성자(Constructor) 만들기
//// 단축키 [Alt + Shift + S]
//// 또는 마우스 우클릭 - Source
//// 이후 Generate Constructor using fields 클릭
//public NextStudent(String name, int age, int level, int exp) {
//	// this 현재 객체를 의미
//	this.name = name;
//	this.age = age;
//	this.Level = level;
//	this.Exp = exp;
//}

// toString()메소드
// 단축키[Alt + Shift + s]
// Generate toString()
//@Override
//public String toString() {
//	return "넥스트3월반 [이름=" + name + ", 나이=" + age + ", 레벨=" + Level + ", 경험치=" + Exp + "]";



