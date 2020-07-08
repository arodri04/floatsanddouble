package acadamy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        
        float myMinFloat = Float.MIN_VALUE;
        float myMaxFloat = Float.MAX_VALUE;

        System.out.println("Float Min: "+ myMinFloat);
        System.out.println("Float Max: "+ myMaxFloat);


        double myMinDouble = Double.MIN_VALUE;
        double myMaxDouble = Double.MAX_VALUE;

        System.out.println("Double Min: "+ myMinDouble);
        System.out.println("Double Max: "+ myMaxDouble);


        int myIntValue = 5;
        float myFloatValue = (float) 5.25; // not a recommended use, use double or add f to the end
        double myDoubleValue = 5.25d;
    }
}
