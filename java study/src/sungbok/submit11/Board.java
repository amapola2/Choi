package sungbok.submit11;

public class Board extends Foundation{
	
	public Board() {
		this(1, "보드", "오늘", "쉬움");
	}
	
	public Board(int number, String title, String startDay, String main) {
		super(number, title, startDay, main);

	}
	
	

	@Override
	public String toString() {
		return "Board [number=" + number + ", title=" + title + ", startDay=" + startDay + ", main=" + main + "]";
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStartDay() {
		return startDay;
	}

	public void setStartDay(String startDay) {
		this.startDay = startDay;
	}

	public String getMain() {
		return main;
	}

	public void setMain(String main) {
		this.main = main;
	} 
	
	
	
}
