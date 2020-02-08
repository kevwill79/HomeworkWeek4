package HomeworkWeek4.VideoGameIterator.src;

import java.util.ArrayList;

public class PS4Games {
ArrayList<VideoGame> ps4Games;
	
	public PS4Games() {
		ps4Games = new ArrayList<VideoGame>();
		
		addGame("No Man's Sky", "Action Adventure",  59.99);
		addGame("Madden 20 Deluxe Edition", "Sports",  79.99);
		addGame("FireWall Zero Hour", "FPS",  39.99);
		addGame("Kingdom Come Deliverance", "Action RP",  69.99);
	}
	
	public void addGame(String nameOfGame, String genre, double price)
	{
		VideoGame ps4Game = new VideoGame(nameOfGame, genre, price);
		ps4Games.add(ps4Game);
	}
	
	/*public ArrayList<VideoGame> getPS4Games() {
		return ps4Games;
	}*/
	
	public Iterator createIterator() {
		return new PS4GameIterator(ps4Games);
	}
}
