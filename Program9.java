
// TREEMAP --> KEY UNIQUE --> DISPLAY IN ACCENDING ORDER

import java.util.*;
class treeMapDemo{
	public static void main(String[]args){
		TreeMap<Integer,String> hm = new TreeMap<>();
		hm.put(37,"TEJAS");
		hm.put(35,"TANVI");
		hm.put(36,"DATTA");
		System.out.println(hm);

		for(Map.Entry<Integer,String> e : hm.entrySet()){
			System.out.println(e);
//			System.out.println(e.getKey());
//			System.out.println(e.getValue());
		}

		for(String value : hm.values()){
//			System.out.println(value);
		}
	}
}

// containsValue() , containsKey() , isEmpty() , clear() , remove(key)
