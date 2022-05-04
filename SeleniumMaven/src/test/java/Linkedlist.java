import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>ll = new LinkedList<String>();
		
		ll.add("A");
		ll.add("y");
		ll.add("A");
		ll.add("T");
		ll.add("H");
		ll.add("R");
		ll.addFirst("G");
		ll.addLast("I");
		ll.add(8, "@");
		ll.add("T");
		ll.add("E");
		ll.add("J");
		ll.add("A");
		ll.remove("H");
		System.out.println(ll);
		
		

	}

}

	 