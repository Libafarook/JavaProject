package PlacementClass;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arr=new ArrayList();
		arr.add("ArrayList");
		arr.add("Hi");
		arr.add(1);
		arr.add('a');
		System.out.println(arr);
		
	
	ArrayList<String> arr1=new ArrayList<String>();
	arr1.add("Array");
	arr1.add("Obsqura");
	arr1.add("Java");
	System.out.println(arr1);
	
	ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
	list.add("Ravi");//Adding object in arraylist  
	list.add("Vijay");  
	list.add("Ravi");  
	list.add("Ajay");  
	System.out.println(list);

	arr1.remove(2);
	System.out.println(arr1);
	arr1.addAll(list);
	System.out.println(arr1);
	
	arr1.removeAll(list);
	System.out.println(arr1);
	System.out.println(list.get(0));
	System.out.println(list.size());
	
	boolean a=arr.contains('a');
	System.out.println(a);
	
	boolean b=list.contains("Ravi");
	System.out.println(b);
	
	
	Iterator itr=list.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	itr.remove();
	System.out.println(list);
	}
	
	
	
	
	

}


