public class FrogCrossingRiver {
    public static void main(String[] args) {
        System.out.println("There are " + numberOfWays(11) + 
        		" ways for the frog to cross the river.");
    }

    public static int numberOfWays(int n) {
        
    	if (n <= 1 || n <= 2) {
    		
    		return n;
    	}
    	
        return numberOfWays(n - 1) + numberOfWays(n - 2);
    }
}