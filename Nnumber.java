package Nnumber;

import java.util.Scanner;

public class Nnumber {

	  static int Number(int num){
	        if (num==0){
	            return 1;
	        }
	        Number(num-1);
	        System.out.print(num);
	        return 1;
	    }
	    public static void main(String[] args) {
			
			Scanner sc = new Scanner (System.in);
			int num = sc.nextInt();
		      Number(num);
		}
}
	