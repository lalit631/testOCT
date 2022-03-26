package Base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class test <G>{
	
	G a;
	
	public void demo() {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		
		test<String> h = new test<String>;
		
		h.a = 80;
		h.demo();		
		
		h.a = "Lalit";
		h.demo();
		
		h.a = "Thakre";
		h.demo();
		
		h.a = '@';
		h.demo();
		
		
		
		
		
		
		
		
		
		
		
		//only one null key supported in HashMap but multiple value is supported
//				//key   ,  value
//		HashMap<Character, String> hMap = new HashMap<Character, String>();
//		
//		hMap.put(null, "Velocity");
//		hMap.put('#', "null");
//		hMap.put('f', "Pune");
//		hMap.put('F', "Lalit");
//		hMap.put('d', "null");
//		
//		for(Map.Entry<Character, String> e : hMap.entrySet())
//{
//	System.out.println(" key = "  + e.getKey() + "Value = " + e.getValue());
//}
//System.out.println("---------------------------------");
//		
//		hMap.put('#', "Narkhed");
//		for(Map.Entry<Character, String> e : hMap.entrySet())
//		{
//			System.out.println(" key = "  + e.getKey() + "Value = " + e.getValue());
//		}
	

//		ArrayList<String> a = new ArrayList<String>();
//		
//		a.add("Velocity");
//		a.add("Lalit");
//		a.add("Batch");
//		a.add("120644");
//		
//	int size =	a.size();
//	System.out.println(size);
//	
//	
//	for(int i = 0 ; i< size ; i++)
//	{
//		System.out.println(a.get(i));
//		
//	}
//		a.remove(2);
//		
//		System.out.println("---------------------");
//	int sije = 	a.size();
//	System.out.println(sije);
//		
//		for(int i = 0 ; i< sije ; i++)
//		{
//			System.out.println(a.get(i));
//			
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
