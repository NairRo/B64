package TestCode2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SameElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = new ArrayList<Integer>();
		Random rand = new Random();
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the length of the array1: ");
		
		int length = s.nextInt();

        for (int j = 0; j<length; j++)
        {
            numbers.add(rand.nextInt(10));
        }
        
        List<Integer> numbers1 = new ArrayList<Integer>();
		
		System.out.print("Enter the length of the array2: ");
		
		int length1 = s.nextInt();

        for (int j = 0; j<length1; j++)
        {
            numbers1.add(rand.nextInt(10));
        }
        
        List<Integer> common = new ArrayList<Integer>();
        
        for(int i: numbers) {
        	if(numbers1.contains(i) && !common.contains(i)) {
        		common.add(i);
        	}
        }
        
        System.out.println(numbers);
        System.out.println(numbers1);
        
        System.out.println("Common Elements" + common);
	}

}
