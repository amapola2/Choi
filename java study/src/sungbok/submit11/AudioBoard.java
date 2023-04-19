package sungbok.submit11;

public class AudioBoard extends Foundation{
	int number;
	String title;
	String startDay;
	String main;
	String Audio;
	public AudioBoard(int number, String title, String startDay, String main, String audio) {
		super();
		this.number = number;
		this.title = title;
		this.startDay = startDay;
		this.main = main;
		Audio = audio;
	}
	
	public AudioBoard () {}

	@Override
	public String toString() {
		return "AudioBoard [number=" + number + ", title=" + title + ", startDay=" + startDay + ", main=" + main
				+ ", Audio=" + Audio + "]";
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

	public String getAudio() {
		return Audio;
	}

	public void setAudio(String audio) {
		Audio = audio;
	}
	
	

}
