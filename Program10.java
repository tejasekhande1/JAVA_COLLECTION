import java.util.*;
class arrayClassDemo{
	public static void main(String[]args){
		int[] numbers = {1,5,3,2,7,6,5,8,9};
		int index = Arrays.binarySearch(numbers,7);
		System.out.println(index);

		Arrays.sort(numbers);
		System.out.println(numbers);
		
		Arrays.fill(numbers,12);
		System.out.println(index);
	}
}
