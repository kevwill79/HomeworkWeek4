package HomeworkWeek4.VideoGameIterator.src;

public interface Iterator {
	boolean hasNext();	//Checks if there are more elements in the aggregate
	VideoGame next();	//Returns the next object in the aggregate
}
