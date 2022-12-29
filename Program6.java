
// HASHSET ---> DUPLICATE NOT ALLOWED
// REAL TIME EXAMPLE ?
// SEQUENCE DIFF IN DIFF TIMES

import java.util.*;
class hashSetDemo{
	public static void main(String[]args){
		Set<Integer> hs = new HashSet<>();
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
