package ListConcept;
import java.util.ArrayList;



public class ArraylistConcept {

	public static void main(String[] args) {

		//int a[] = new a[3];///static arrar---size is fixed
		
		//dynamic array---Arraylist
		//1. can contain duplicate values
		//2. maintains insertion order
		//3. synchronized
		//4.allowa random access of values by passing the index number
		
		
		ArrayList ar = new ArrayList();
		
		ar.add(10);
		ar.add(12);
		ar.add(19);
		
		
		System.out.println(ar.size());//size of arraylist
		//System.out.println(ar.get(3));// to get the value from index
		
		
		ar.add(43);
		ar.add(43);
		System.out.println(ar.get(3));// to get the value from index
		
		System.out.println(ar.size());
		//to print all the values
		
		for(int i=0;i<ar.size();i++)
		{System.out.println(ar.get(i));
		
				
	}
		
		//non generic or generic
		//ArrayList<Integer> ar1= new Arraylist<Integer>();
		//ar1.add(199);
		//ar1.add("test");
		

	}
}