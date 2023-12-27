/*WAP in java
*1)Use Random Number Generating function.
 * 2)Use Random String Generating Function.
 * 3)Convert Integer to String(convert output of random number generating function)
 * 4)Convert Integer to Float(convert output of random number generating function)
 * 5)Convert String to Double(convert output of random string generator function)
 * 6)Wap to reverse a string using reverse().convert output of random string generator function)
 * 7)Wap to reverse the same original string without using reverse(). You may use other functions.convert output of random string generator function)
 * 8)Wap to convert a byte array into string using 3 different encodings of your choice. Print both the byte and String conversions.

output format of these codes:
random integer:
random string:
converting integer to string:
integer:
string:
converting integer to float:
integer:
float:
reversing:
original string: 
using reverse:
without using reverse():
converting byte to string:
byte:
string using encoding: */
 /* Author: barkha arora
 * SAP ID: 500105542
 * ROLL NO: R2142220462
 */

 
import java.util.Random;
import java.nio.charset.Charset;



public class wrapper1 {

    // Function to generate a random integer
    public static int generateRandomInteger() {
        Random random = new Random();
        return random.nextInt();
    }

    // Function to generate a random string
    public static String generateRandomString(int length) {
        String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder randomString = new StringBuilder(length);
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(CHARACTERS.length());
            randomString.append(CHARACTERS.charAt(index));
        }

        return randomString.toString();
    }

    public static void main(String[] args) {
        // 1) Random Integer
        int randomInt = generateRandomInteger();
        System.out.println("Random Integer:");
        System.out.println("Integer: " + randomInt);

        // 2) Random String
        String randomString = generateRandomString(10);
        System.out.println("\nRandom String:");
        System.out.println("String: " + randomString);

        // 3) Convert Integer to String
        String intToString = String.valueOf(randomInt);
        System.out.println("\nConverting Integer to String:");
        System.out.println("Integer: " + randomInt);
        System.out.println("String: " + intToString);

        // 4) Convert Integer to Float
        float intToFloat = (float) randomInt;
        System.out.println("\nConverting Integer to Float:");
        System.out.println("Integer: " + randomInt);
        System.out.println("Float: " + intToFloat);

        // 5) Convert String to Double
        double stringToDouble;
        try {
            stringToDouble = Double.parseDouble(randomString);
        } catch (NumberFormatException e) {
            stringToDouble = Double.NaN; // Set to NaN in case of invalid input
        }
        System.out.println("\nConverting String to Double:");
        System.out.println("String: " + randomString);
        System.out.println("Double: " + stringToDouble);


        // 6) Reverse a string using reverse()
        StringBuilder reversedString = new StringBuilder(randomString).reverse();
        System.out.println("\nReversing:");
        System.out.println("Original String: " + randomString);
        System.out.println("Using reverse(): " + reversedString);
        String reversedStringWithoutReverse = "";
        for (int i = randomString.length() - 1; i >= 0; i--) {
            reversedStringWithoutReverse += randomString.charAt(i);
        }
        System.out.println("\nWithout using reverse():");
        System.out.println("Original String: " + randomString);
        System.out.println("Reversed String: " + reversedStringWithoutReverse);
    }
}