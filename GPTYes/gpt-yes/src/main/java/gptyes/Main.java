package gptyes;

import java.util.Scanner;






/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )

    {

        Scanner input = new Scanner(System.in);
        System.out.println("enter in a sentence to randomize:");

        String sentence = input.nextLine();

        System.out.println("enter in a true random number randomly tap on your number pad!");
        
        
        int trueRandomNumber =Integer.parseInt(input.nextLine());

        
        
  
     
        String print = RandomString.getRandomString(sentence, trueRandomNumber);

        System.out.println(print);
        
    }
}
