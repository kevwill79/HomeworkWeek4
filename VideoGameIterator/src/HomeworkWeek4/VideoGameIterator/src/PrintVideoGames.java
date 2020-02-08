package HomeworkWeek4.VideoGameIterator.src;

public class PrintVideoGames {
	PS4Games ps4 = null;
	PCGames pc = null;
	
	public PrintVideoGames(PS4Games ps4, PCGames pc) {
		this.ps4 = ps4;
		this.pc = pc;
	}
	
	public void print()
	{
		Iterator ps4It = ps4.createIterator();
		Iterator pcIt = pc.createIterator();
		
		print(ps4It);
		print(pcIt);
	}
	
	private void print(Iterator it)
	{
		while(it.hasNext())
		{
			VideoGame vg = (VideoGame)it.next();
			System.out.println(vg.getNameOfGame() + ", ");
			System.out.println(vg.genre + ", ");
			System.out.println(vg.price);
		}
	}
}
