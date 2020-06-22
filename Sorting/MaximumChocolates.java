package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumChocolates {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			
			for(int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			
			Arrays.sort(a);
			int sum = 0;
			for(int i = n-1 ; i >= 0 ; i -= 2) {
				sum += a[i];
			}
			
			System.out.println(sum);
		}
	}

}
