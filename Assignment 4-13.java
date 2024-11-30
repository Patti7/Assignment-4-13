import java.util.Scanner;

public class VowelorConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a letter: ");
        char letter = input.next().charAt(0);

        letter = Character.toLowerCase(letter);

        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            System.out.println(letter + "is a vowel.");
         } else if ((letter >= 'a' && letter <= 'z')) {
            System.out.println(letter + "is a consonant.");
         } else {
            System.out.println(letter + "is not a valid letter.");
          }
    }
 }

      

