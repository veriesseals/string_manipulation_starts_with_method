public class Main {
    public static void main(String[] args) {

        // Create a String
        String testString = "This is a test";

        // Check if the string starts with a specific prefix using startsWith() method
    	boolean result1 = testString.startsWith("test"); // false
    	boolean result2 = testString.startsWith("This"); // true


        // Print the results
        System.out.println("testString.startsWith(\"test\") : " + "The test result is: " + testString.startsWith("test") + " there for the result is: " + result1);

        System.out.println("testString.startsWith(\"This\") : " + "The test result is: " + testString.startsWith("This") + " there for the result is: " + result2);

    }
}
