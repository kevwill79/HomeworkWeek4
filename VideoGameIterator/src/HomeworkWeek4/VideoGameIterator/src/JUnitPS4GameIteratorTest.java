package HomeworkWeek4.VideoGameIterator.src;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class JUnitPS4GameIteratorTest {

	@Test
	void test() {
		ArrayList<VideoGame> games = new ArrayList<VideoGame>();
		PS4GameIterator ps4It = new PS4GameIterator(games);
		int position = 0;
		
		VideoGame m = new VideoGame("Madden 10", "sports", 59.99);
		games.add(m);
		
		assertNotNull(position);
		assertNotNull(games);
		assertNotEquals(position, games.size());
	}

}
