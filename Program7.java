
// LINKEDHASHSET
// REAL TIME EXAMPLE ?
// SEQUENCE SAME

import java.util.*;
class linkedHashSetDemo{
	public static void main(String[]args){
		Set<Integer> hs = new LinkedHashSet<>();
	//	LinkedHashSet<Integer> hs = new LinkedHashSet<>();
		hs.add(10);
		hs.add(32);
		hs.add(52);
		hs.add(67);
		hs.add(43);
		System.out.println(hs);
		hs.remove(52);
		System.out.println(hs.contains(43));
		System.out.println(hs.isEmpty());                 // BOOLEAN
		System.out.println(hs.size());
		hs.clear();
	}
}
