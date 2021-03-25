package LearnJava;

import java.util.Scanner;

public class Sumtwonumber {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
	    System.out.print("Input your first No: ");
	    int fNo = input.nextInt();
	    System.out.print("Input your last No: ");
	    int sNo = input.nextInt();
	    int sum = fNo + sNo ;
	    System.out.println();
	    System.out.println("Sum"+ " " + sum);
	}

}
