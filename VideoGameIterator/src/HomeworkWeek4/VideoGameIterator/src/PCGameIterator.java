package HomeworkWeek4.VideoGameIterator.src;

public class PCGameIterator implements Iterator {
		VideoGame[] games;
		int position = 0;
		
		public PCGameIterator(VideoGame[] games) {
			this.games = games;
		}
		
		public boolean hasNext() {
			if(position >= games.length || games[position] == null)
				return false;
			else
				return true;
		}
		
		public VideoGame next() {
			VideoGame nextGame = games[position];
			position += position;
			
			return nextGame;
		}
}
