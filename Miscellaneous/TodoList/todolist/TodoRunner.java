package todolist;

public class TodoRunner {
	
	public static void main(String[] args) {
		ListContainer lc = new ListContainer();
		lc.addItem(new Item("Chemistry Videos","9/14/18","Mack",1));
		lc.addItem(new Item("History Reading", "9/18/18", "Mack",2));
		lc.addItem(new Item("English Essay", "9/20/18", "Bill",3));
		lc.addItem(new Item("Art Project", "9/30/18", "Bill",4));
		lc.addItem(new Item("Research Paper", "10/8/18", "Amy",5));
		
		Interface gui = new Interface(lc);
	}
}
