package TestCode1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SecondMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = new ArrayList<Integer>();
		Random rand = new Random();
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the length of the array: ");
		
		int length = s.nextInt();

        for (int j = 0; j<10; j++)
        {
            numbers.add(rand.nextInt(100));
        }
        
        System.out.println(numbers);
        numbers.sort(Comparator.naturalOrder());         
        
        System.out.println("The second min number is " + numbers.get(1));
        System.out.println("The second max number is " + numbers.get(numbers.size()-2));
	}

}
