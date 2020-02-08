package HomeworkWeek4.VideoGameIterator.src;

public class PCGames {
	VideoGame[] pcGames;
	int numOfGames = 0;
	static final int MAX_GAMES = 7;
	
	public PCGames() {
		pcGames = new VideoGame[MAX_GAMES];
		
		addGame("World Of WarCraft", "MMO",  59.99);
		addGame("Battlefleet Gothic: Armada 2", "Sports",  99.99);
		addGame("Spore", "Simulation",  19.99);
		addGame("Halo Infinite", "Action RP",  49.99);
	}
	
	public void addGame(String nameOfGame, String genre, double price)
	{
		VideoGame pcGame = new VideoGame(nameOfGame, genre, price);
		
		if(numOfGames >= MAX_GAMES)
			System.out.println("Can't add any more games!");
		else
		{
			pcGames[numOfGames] = pcGame;
			numOfGames += numOfGames;
		}
	}
	
	/*public VideoGame[] getPCGames() {
		return pcGames;
	}*/
	
	public Iterator createIterator() {
		return new PCGameIterator(pcGames);
	}
}
