package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] vowels = {"a", "e", "i", "o", "u"};
		//2. print the third element in the array
		System.out.println(vowels[2]);
		//3. set the third element to a different value
		vowels[2] = "y";
		//4. print the third element again
		System.out.println(vowels[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for(int w = 0; w < vowels.length; w++) {
			vowels[w] = "spaghetti sauce";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int w = 0; w < vowels.length; w++) {
			System.out.println(vowels[w]);
		}
		//7. make an array of 50 integers
		int[] rNums = new int[50];
		//8. use a for loop to make every value of the integer array a random number
		for(int w = 0; w < rNums.length; w++) {
			Random generator = new Random();
			rNums[w] = generator.nextInt(1000);
		}
		//9. without printing the entire array, print only the smallest number on the array
		boolean smol = false;
		for(int i = 0; i<1000;i++) {
			for(int w = 0; w < rNums.length; w++) {
				if(smol) {
					
				}else {
					if(rNums[w] == i) {
						System.out.println(rNums[w]);
						System.out.println(w + 1);
						smol = true;
					}
				}
			}
		}
		System.out.println("\n");
		//10 print the entire array to see if step 8 was correct
		for(int i: rNums) {
			System.out.println(i);
		}
		//11. print the largest number in the array.
		boolean bigg = false;
		for(int i = 0; i<1000;i++) {
			for(int w = 0; w < rNums.length; w++) {
				if(bigg) {
					
				}else {
					if(rNums[w] == i) {
						System.out.println(rNums[w]);
						System.out.println(w + 1);
						smol = true;
					}
				}
			}
		}
		//12. print only the last element in the array
		//System.out.println("\n" + rNums[49]);
	}
}
