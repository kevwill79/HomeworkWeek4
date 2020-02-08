package HomeworkWeek4.VideoGameIterator.src;

import java.util.ArrayList;

public class PS4GameIterator implements Iterator{
	ArrayList<VideoGame> games;
	int position = 0;
	
	public PS4GameIterator(ArrayList<VideoGame> games) {
		this.games = games;
	}
	
	public boolean hasNext() {
		if(position >= games.size())
			return false;
		else
			return true;
	}
	
	public VideoGame next() {
		VideoGame nextGame = games.get(position);
		position = position + 1;
		
		return nextGame;
	}
}
