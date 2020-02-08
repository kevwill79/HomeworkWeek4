package HomeworkWeek4.VideoGameIterator.src;

public class VideoGame {
	String nameOfGame;
	String genre;
	double price;
	
	public VideoGame(String nameOfGame, String genre, double price) {
		this.nameOfGame = nameOfGame;
		this.genre = genre;
		this.price = price;
	}
	
	public String getNameOfGame() {
		return nameOfGame;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String toString() {
		return (nameOfGame + ", " + genre + " $" + price);
	}
}
