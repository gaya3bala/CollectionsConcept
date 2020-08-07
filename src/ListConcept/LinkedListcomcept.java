package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListcomcept {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll1 =  new LinkedList<Integer>();
		
		//add
		ll1.add(14);
		ll1.add(38);
		ll1.add(23);
		ll1.add(78);
		System.out.println("value of linkedlist:"+ll1);
		
		//addfirst
		ll1.addFirst(45);
		//addlast
		ll1.addLast(67);
		
		System.out.println("value of linkedlist:"+ll1);
		
		//get value
		System.out.println(ll1.get(2));
		
		//setvalue
		ll1.set(4, 39);
		System.out.println(ll1.get(4));
		System.out.println("value of linkedlist"+ll1);
		
		/*remove first and last
		ll1.removeFirst();
		ll1.removeLast();
		ll1.remove(2);
		ll1.remove();
		System.out.println("value of linkedlist"+ll1);
		*/
		
		//print all the values
		
		//using for loop
		System.out.println("****using for loop");
		for(int n=0;n<ll1.size();n++)
			
		    {System.out.println(ll1.get(n));
		
		    }
		//using advance for koop
		System.out.println("****using advance for loop");
		for(Integer value : ll1)
			System.out.println(value);
		
		//using iterator
		System.out.println("****using iterator");
		Iterator<Integer> it =ll1.iterator();
		while(it.hasNext())
		{ System.out.println((it.next()));
		
		}
		
		//while loop
		System.out.println("****using whileloop");
		int num=0;
		while(ll1.size()>num)
		{	System.out.println(ll1.get(num));
		num++; 
		}
		

	}

}
