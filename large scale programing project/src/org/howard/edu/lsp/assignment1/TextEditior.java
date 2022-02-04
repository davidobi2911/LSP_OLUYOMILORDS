package org.howard.edu.lsp.assignment1;
import java.util.Scanner;

public class TextEditior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner getInput = new Scanner(System.in);
	    String name;
	    String exit = "Goodbye";
	    System.out.println("String? ");
	    name = getInput.nextLine();
	    while(!(name.equals(exit))){

	  
	    String[] arr = name.split(" ", -2);
	    System.out.println("Tokens: ");
	    int total = 0 ;
	    int product = 1;
	    for (String el : arr) {

	      System.out.println(el);
	      int num = Integer.parseInt(el);
	      total += num;
	      product *= num;
	    }
	  
	    String output = String.format("Sum: %s", total);
	    String output2 = String.format("Product: %s", product);

	    System.out.println(output);
	    System.out.println(output2);
	    System.out.println("String? ");
	    name = getInput.nextLine();
	    
	    }

	}
	}