import java.util.*;
public class Algorithm {
   
   public static void main(String[] args) {
	   Scanner console = new Scanner(System.in);
	   
	  System.out.println("What did you get?");
	  int G = console.nextInt();
	  grade(G);
   }
   
   

public static void grade(int g){
	   if (g >= 0 && g <= 100){
		   if(g >= 90 && g <= 100){
			   System.out.println("Grade A");
		   } else{
			   if(g >= 80 && g <= 89){
				   System.out.println("Grade B");
			   } else{
				   if(g >= 70 && g <= 79){
					   System.out.println("Grade C");
				   } else{
					   if(g >= 60 && g <= 69){
						   System.out.println("Grade D");
					   } else{ 
						 System.out.println("Grade F");  
					   }
				   }
			   }
		   }
	   } else {
		 System.out.println("Error");  
	   }
   }
}
