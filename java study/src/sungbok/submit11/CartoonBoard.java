package sungbok.submit11;

public class CartoonBoard extends Foundation{
	int number;
	String title;
	String startDay;
	String main;
	String image;
	public CartoonBoard(int number, String title, String startDay, String main, String image) {
		super();
		this.number = number;
		this.title = title;
		this.startDay = startDay;
		this.main = main;
		this.image = image;
	}
	
	public CartoonBoard() {}

	@Override
	public String toString() {
		return "CartoonBoard [number=" + number + ", title=" + title + ", startDay=" + startDay + ", main=" + main
				+ ", image=" + image + "]";
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	

}
