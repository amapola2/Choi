package sungbok.submit11;

public class Foundation {
	private int number;
	private String title;
	private String startDay;
	private String main;
	
	public Foundation () {}

	public Foundation(int number, String title, String startDay, String main) {
		super();
		this.number = number;
		this.title = title;
		this.startDay = startDay;
		this.main = main;
	}

	@Override
	public String toString() {
		return "Foundation [number=" + number + ", title=" + title + ", startDay=" + startDay + ", main=" + main + "]";
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
