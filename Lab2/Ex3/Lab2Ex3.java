//Lab2Ex3.java
//07/10/2020
//Jakub Dudrak

import java.util.Scanner;

public class Lab2Ex3{
	
	public static void main(String args[]){
	
		
	String name, address;
	float height, weight;
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter your name: ");
	name = input.nextLine();
	
	System.out.print("Enter your height: ");
	height = input.nextFloat();
	
	System.out.print("Enter your weight: ");
	weight = input.nextFloat();
	input.nextLine();
	
	System.out.print("Enter your address: ");
	address = input.nextLine();
	
	System.out.println("\n" + "\n" + "What you entered was: " + "\n**********************" 
		+ "\n" + "Name: " + name + "\n" + "Height: " + height + "\n" + "Weight: " + weight + "\n" + "Address: " + address);
	}
}