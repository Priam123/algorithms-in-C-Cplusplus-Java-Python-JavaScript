import java.util.Scanner;

/*
Sarah loves going to her favorite bakery, Zillycakes, with n dollars to buy cupcakes. 
Each cupcake has a flat cost of c dollars, and the store has a promotion where 
they give you 1 free cupcake for every m cupcake wrappers you trade in.

For example, if m = 2 and Sarah has n = 4 dollars that she uses to buy 4 cupcakes at c = 1 dollar apiece, 
she can trade in the 4 wrappers to buy 2 more cupcakes. Now she has 2 more wrappers that she can trade in for 1 more cupcake. 
Because she only has 1 wrapper left at this point and 1 < m, she was only able to eat a total of 7 cupcakes.
*/

public class Solution {

	static int maximumCupcakes(String trips){
		
		String[] words = trips.split(" ");
    
    //Denotes the amount of money (in dollars) Sarah can spend during that trip to Zillycakes
		int n = Integer.parseInt(words[0]);
    
    //Denotes the cost of a cupcake in dollars
		int c = Integer.parseInt(words[1]);
    
    //Denotes the number of wrappers that can be traded in for one new cupcake
		int m = Integer.parseInt(words[2]);

		int count=0, init_count=0, rem_count = 0;
		
		while(n>1){
			init_count = (int) Math.floor(n/c);
			count+=init_count;
			
			if(Math.ceil(n/c)-Math.floor(n/c)!=0)
				rem_count = (int)(n%c);
			
			n = init_count + rem_count ;
			c = m;
			
		}
		
		return count;
		
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String trial = scan.nextLine();
		System.out.println(maximumCupcakes(trial));
		scan.close();
		
	}

}
