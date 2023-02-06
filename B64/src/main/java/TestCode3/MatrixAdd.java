package TestCode3;

import java.util.Random;

public class MatrixAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int c[][] = new int[3][3];
		
		Random rand = new Random();
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				a[i][j] = rand.nextInt(10);
				b[i][j] = rand.nextInt(10);
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}

}
