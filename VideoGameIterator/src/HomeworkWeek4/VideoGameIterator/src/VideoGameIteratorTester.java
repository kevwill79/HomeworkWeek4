package HomeworkWeek4.VideoGameIterator.src;

public class VideoGameIteratorTester {

	public static void main(String[] args) {
		PS4Games ps4g = new PS4Games();
		PCGames pcg = new PCGames();
		
		PrintVideoGames pvg = new PrintVideoGames(ps4g, pcg);
		pvg.print();
	}

}
