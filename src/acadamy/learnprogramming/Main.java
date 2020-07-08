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


        int myIntValue = 5/2;
        float myFloatValue = (float) 5/3f; // not a recommended use, use double or add f to the end
        double myDoubleValue = 5d/3d; //notice how this goes out farther decimal places


        System.out.println("myIntValue= "+ myIntValue);
        System.out.println("myFloatValue= "+ myFloatValue);
        System.out.println("myDoubleValue= " + myDoubleValue);
    }
}
