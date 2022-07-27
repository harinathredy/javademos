package multiplicationofmatrices;

import java.util.Iterator;

public class MultiplicationOfMatrices {
	public static void main(String[] args) {
		int m1[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int m2[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int r[][]=new int[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				r[i][j]=0;
				for(int k=0;k<3;k++) {
					r[i][j]=r[i][j]+m1[i][k]*m2[j][k];
				}
				System.out.print(r[i][j]+" ");
			}
			System.out.println();
		}
	}

}
