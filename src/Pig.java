import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pig {

    /*
    * Create a method "pigLatin" that takes a string consisting of one or more 
    * all-lowercase words separated by spaces. It should return a new string 
    * converted to "pig Latin," where each word has its first letter moved to 
    * the back and the letters "ay" are added to the end of the word. However, 
    * words starting with a vowel (a, e, i, o, or u) should not be altered.
    * 
    * Examples:
    *
    * pigLatin("something")  should return "omethingsay"
    * pigLatin("awesome")    should return "awesome" (words starting with a vowel should not be altered)
    * pigLatin("latin is a hard language")  should return "atinlay is a ardhay anguagelay"
    * pigLatin("y")  should return "yay"
    * pigLatin("e")   should return "e"
    */
    public static void main(String[] args) {
        // Test cases
        assertEqual(1, pigLatin("something"), "omethingsay");
        assertEqual(2, pigLatin("awesome"), "awesome");
        assertEqual(3, pigLatin("latin is a hard language"), "atinlay is a ardhay anguagelay");
        assertEqual(4, pigLatin("y"), "yay");
        assertEqual(5, pigLatin("e"), "e");
    }

    // Implement your solution here!
    public static String pigLatin(String sentence) {
        /*
         * psuedo code
         * scanner 
         * while the scanner has a next token
         * check to see if the token char.at (0) is a vowel and if so we will jsut add the token
         * otherwise we will take the first index char add it to itself
         * return the new string
         * 
         */
        String piglatin = "";
        Scanner scanner = new Scanner(sentence);
        List<String> list = new ArrayList<>();
        
        while (scanner.hasNextLine()) {
            String next = scanner.next();
            list.add(next);
        }
        for(String word : list){
            if (word.charAt(0) == 'a' ||
                word.charAt(0) == 'e' ||
                word.charAt(0) == 'i' ||
                word.charAt(0) == 'o' ||
                word.charAt(0) == 'u') {
                piglatin+= word + " ";
            } else {
                for(int i = 0; i< word.length()-1; i++){
                    piglatin+= word.charAt(i+1);
                }
                piglatin += (word.charAt(0) + "ay ");
                
            }
                
        }
        
        return piglatin.trim();
    }









    // Method to help with testing, you do not need to read this.
    public static void assertEqual(int testNumber, String actual, String expected) {
        if (!expected.equals(actual)) {
        System.out.println("Test " + testNumber + " failed! Expected: '" + expected + "', but got: '" + actual + "'");
        } else {
        System.out.println("Test " + testNumber + " passed!");
        }
    }
    }
  
  