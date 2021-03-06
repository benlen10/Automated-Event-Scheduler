import java.util.Iterator;

public class Resource {
	private String name;
	private SortedListADT<Event> events;
	
	/**
	*		Resource constructor 
	*/
	Resource(String name){
		this.name = name;
		events = new IntervalBST<Event>();
	}
	
	/**
	*		Return the name
	*/
	public String getName(){
		return name;
	}
	
	/**
	*		Add event
	*/
	public boolean addEvent(Event e){
		if(e == null) return false;
		events.insert(e);
		return true;
	}
	
	/**
	*		Delete an event
	*/
	public boolean deleteEvent(long start){
		return events.delete(new Event(start, start, "", "", "", ""));
	}
	
	/**
	*		Return an iterator
	*/
	public Iterator<Event> iterator(){
		return events.iterator();
	}
	
}
