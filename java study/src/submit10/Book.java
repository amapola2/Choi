package submit10;

import ch09_class.HomepageMain.MemberDB;

public class Book {
    private int no;
    private String name;
    private boolean isBorrow;
	public Book(int no, String name, boolean isBorrow) {
		super();
		this.no = no;
		this.name = name;
		this.isBorrow = isBorrow;
	}
	@Override
	public String toString() {
		String state = +(isBorrow) ? ("대여중") : ("입고중");
		
		return "[책번호=" + no + ", 책제목=" + name + ", 대여상태=" + 대여상태: "]" 
		}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isBorrow() {
		return isBorrow;
	}
	public void setBorrow(boolean isBorrow) {
		this.isBorrow = isBorrow;
	}



   
}
