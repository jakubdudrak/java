//Lab2Ex2A2.java
//07/10/2020
//

public class Lab2Ex2Formatted{
	
	public static void main (String args[]){
		
		String title, author, tt, aa, yy, pp, pr;
		Integer pages, year;
		Float price;
		
			title = "Harry Potter and the Prisoner of Azkaban";
			author = "J.K Rowling";
			pages = 317;
			price = 35.5f;
			year = 1999;
			
			String formatString = String.format("%-20s%s\n%-20s%s\n%-20s%d\n%-20s%d\n%-20s%.2f",
				
								"Title: ", title,
								"Author: ", author,
								"Year Published: ", year,
								"Number of Pages: ", pages,
								"Price: EUR", price);
				
				
		
		
		
				System.out.println(formatString);
		
		
	}
	
}