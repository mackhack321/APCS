package todolist;

public class Item {
	// instance variables
	
	private String text;
	private String duedate;
	private String owner;
	private int id;
	
	// constructor
	
	public Item(String t, String d, String o, int i)
	{
		text = t;
		duedate = d;
		owner = o;
		id = i;
	}
	
	// toString override
	
	public String toString() {return "\""+text+"\" due on "+duedate+" for "+owner+" with ID "+id;}
	
	// access methods
	
	public String getText() {return text;}
	public String getDueDate() {return duedate;}
	public String getOwner() {return owner;}
	public Object[] getArray() {return new Object[] {text,duedate,owner,id};}
	public int getId() {return id;}
}
