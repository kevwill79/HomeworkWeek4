package HomeworkWeek4.VideoGameIterator.src;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.jupiter.api.Test;

class JUnitVideoGameIteratorTest {

	@Test
	void test() {
		ArrayList<VideoGame> game = new ArrayList<VideoGame>();
		PS4GameIterator ps4It = new PS4GameIterator(game);
		int position = 0;
		
		VideoGame m = new VideoGame("Madden 10", "sports", 59.99);
		game.add(m);
		
		PS4Games best = new PS4Games();
		PS4Games games = new PS4Games();
		
		PS4Games ps4g = new PS4Games();
		PCGames pcg = new PCGames();
		
		PrintVideoGames pvg = new PrintVideoGames(ps4g, pcg);
		pvg.print();
		
		m = (VideoGame)ps4It.next();
		
		assertNotNull(position);
		assertNotNull(games);
		assertNotEquals(position, game.size());
		assertNotNull(best);
		assertNotEquals(best, games);
		assertFalse(ps4It.hasNext());
		
		
	}

}
