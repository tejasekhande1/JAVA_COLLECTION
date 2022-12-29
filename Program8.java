
// HASHMAP --> KEY UNIQUE

import java.util.*;
class hashMapDemo{
	public static void main(String[]args){
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(35,"TEJAS");
		hm.put(36,"TANVI");
		hm.put(37,"DATTA");
		hm.put(36,"DATTA2");
		System.out.println(hm);

		for(Map.Entry<Integer,String> e : hm.entrySet()){
			System.out.println(e);
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}

		for(String value : hm.values()){
			System.out.println(value);
		}
	}
}

// containsValue() , containsKey() , isEmpty() , clear()
