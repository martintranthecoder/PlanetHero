
import java.util.Scanner;
public class PlanetHero {
	public static void main(String[] args) {
		 System.out.println("Welcome to Planet Hero!\n");
	     String choice = "";
	     int points = 0;
	     String choicebig = "";
	     String choicemed = "";
	     String choicesmall = "";
	     Scanner input = new Scanner(System.in);
	     
	     do {
	    	 System.out.println("Choose a category to make an impact:\n");
	         System.out.println("1. Big Impact Actions");
	         System.out.println("2. Medium Impact Actions");
	         System.out.println("3. Small Impact Actions");
	         System.out.println("Q. Quit and Get Total Points");
	         System.out.print("\nEnter your choice: ");
	         choice = input.next();
	         
	        if (choice.equals("1")) {
	         do {
	        	 System.out.println("\nWhich BIG IMPACT action(s) will you pledge to take?\n");
	        	 System.out.println("1. Pledge to stop flying (100 pts)");
	        	 System.out.println("2. Join a climate action group (100 pts)");
	        	 System.out.println("3. Adopt a 100% plant-based diet (100 pts)");
	        	 System.out.println("4. Replace your furnace with a heat pump (80 pts)");
	        	 System.out.println("R. Return to main menu");
	        	 String choicebigpre = choicebig;
	        	 System.out.print("\nEnter your choice: ");
		         choicebig = input.next();
		         if(choicebig.equals(choicebigpre)) {
	        		 System.out.println("\nYou already made that pledge!");
	        		 System.out.println("Please select a new option or return to the main menu.");
	        	 }else if (choicebig.equals("1")) {
	        		 points += 100;
	        	 } else if (choicebig.equals("2")) {
	        		 points += 100;
	        	 }else if (choicebig.equals("3")) {
	        		 points += 100;
	        	 }else if (choicebig.equals("4")) {
	        		 points += 80;
	        	 }else {
	        		 System.out.println("\nReturning to main menu...\n");
	        	 }
	        	 
	        	
	         }	 
	        	 while(!choicebig.equalsIgnoreCase("R"));
	        }
	        	 if (choice.equals("2")) {
	        	 do {
	        		 System.out.println("\nWhich MEDIUM IMPACT action(s) will you pledge to take?\n");
	        		 System.out.println("1. Attend a climate rally (35 pts)");
	        		 System.out.println("2. Replace your lawn with a pollinator garden (40 pts)");
	        		 System.out.println("3. Check if your bank invests in dirty energy companies (40 pts)");
	        		 System.out.println("4. Buy only used clothes (50 pts)");
	        		 System.out.println("R. Return to main menu");
	        		 String choicemedpre = choicemed;
	        		 System.out.print("\nEnter your choice: ");
	        		 choicemed = input.next();
	        		 if(choicemed.equals(choicemedpre)) {
		        		 System.out.println("\nYou already made that pledge!");
		        		 System.out.println("Please select a new option or return to the main menu.");
		        	 }else if (choicemed.equals("1")) {
		        		 points += 35;
		        	 } else if (choicemed.equals("2")) {
		        		 points += 40;
		        	 }else if (choicemed.equals("3")) {
		        		 points += 40;
		        	 }else if (choicemed.equals("4")) {
		        		 points += 50;
		        	 }else {
		        		 System.out.println("\nReturning to main menu...\n");
	        	     }
	        		 
	        	 }
	        		 while(!choicemed.equalsIgnoreCase("R"));
	        	 }
	        		if (choice.equals("3")) {
	        		 do {
	        			 System.out.println("\nWhich LOW IMPACT action(s) will you pledge to take?\n");
		        		 System.out.println("1. Wash your clothes on the cold cycle and air dry them (30 pts)");
		        		 System.out.println("2. Bring a resuable mug to the coffee shop (10 pts)");
		        		 System.out.println("3. Compost your food waste (20 pts)");
		        		 System.out.println("4. Turn off the shower when soaping up (5 pts)");
		        		 System.out.println("R. Return to main menu");
		        		 String choicesmallpre = choicesmall;
		        		 System.out.print("\nEnter your choice: ");
		        		 choicesmall = input.next();
		        		 if(choicesmall.equals(choicesmallpre)) {
			        		 System.out.println("\nYou already made that pledge!");
			        		 System.out.println("Please select a new option or return to the main menu.");
			        	 }else if (choicesmall.equals("1")) {
			        		 points += 30;
			        	 } else if (choicesmall.equals("2")) {
			        		 points += 10;
			        	 }else if (choicesmall.equals("3")) {
			        		 points += 20;
			        	 }else if (choicesmall.equals("4")) {
			        		 points += 5;
			        	 }else  {
			        		 System.out.println("\nReturning to main menu...\n");
	        	         }
		        		 
	        		 }
		        		 while(!choicesmall.equalsIgnoreCase("R"));
	        		}
	         
	        
	                     
	        	 }
	        	 while(!choice.equalsIgnoreCase("Q"));
	     System.out.println("\nTotal points... " + points);
	     if(points >= 150) {
	    	 System.out.println("\n***You're a planetary superstar!***");
	     } else if (points >= 100) {
	    	 System.out.println("\n***You're a planetary hero!***");
	     } else if (points >= 50) {
	    	 System.out.println("\n***You're a planetary defender!***");
	     } else if (points > 0) {
	    	 System.out.println("\n***You're a friend to the planet!***");
	     } else {
	    	 System.out.println("\nThanks for considering planet.");
	     }
	        System.out.println("\nGoodbye!");

		input.close();
   }	
}
	     


