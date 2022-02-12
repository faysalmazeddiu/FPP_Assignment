package prog2_7;

public class Prog2_7 {
	
	    public static void main(String [] args) {
	        String outputValue = "";
	        outputValue += String.format("%20d %12d %12d %12d %n %n", RandomNumbers.getRandomInt(1, 99), RandomNumbers.getRandomInt(1, 99), RandomNumbers.getRandomInt(1, 99), RandomNumbers.getRandomInt(1, 99));
	        outputValue += String.format("%17s %2d %9s %2d %9s %2d %9s %2d %n","+", RandomNumbers.getRandomInt(1, 99), "+", RandomNumbers.getRandomInt(1, 99),"+", RandomNumbers.getRandomInt(1, 99), "+", RandomNumbers.getRandomInt(1, 99));
	        outputValue += String.format("%20s %12s %12s %12s %n %n %n %n","______", "______","______", "______");
	       
	        outputValue += String.format("%20d %12d %12d %12d %n %n", RandomNumbers.getRandomInt(1, 99), RandomNumbers.getRandomInt(1, 99), RandomNumbers.getRandomInt(1, 99), RandomNumbers.getRandomInt(1, 99));
	        outputValue += String.format("%17s %2d %9s %2d %9s %2d %9s %2d %n","+", RandomNumbers.getRandomInt(1, 99), "+", RandomNumbers.getRandomInt(1, 99),"+", RandomNumbers.getRandomInt(1, 99), "+", RandomNumbers.getRandomInt(1, 99));
	        outputValue += String.format("%20s %12s %12s %12s","______", "______","______", "______");
	        System.out.println(outputValue);
	    }
	
	
}
