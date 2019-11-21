package greak;

import java.util.Scanner;
//# equal sum and Xor 
public class sumofzor {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			System.out.println(countlop(n));
			System.out.println(bitcount(n));
	}
	public static int countlop(int n) {
		int c=0;
		for(int i=0;i<n;i++) {
			if((i+n)==(n^i))
				c++;
		}
		return c;
	}
	public static int bitcount(int n) {
		int c=0;
		while(n!=0) {
			if((n & 1)==0) {
				c++;
			}
			n=n>>1;
		}
		
		return 1<<c;
	}

}
