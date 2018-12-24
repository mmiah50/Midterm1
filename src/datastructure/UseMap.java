package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		ArrayList<String> list = new ArrayList<String>();

		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");

		// Iterator to traverse the list
		//Iterator it = list.iterator();
		//while (it.hasNext())
		//System.out.print(it.next());

		//System.out.println();

		for(String name: list){
			System.out.print(name);
		}
	}
}

