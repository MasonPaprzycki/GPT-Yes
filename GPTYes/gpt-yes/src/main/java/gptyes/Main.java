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

        
        
  
     
        String print = RandomString.getRandomString(sentence, 2);

        System.out.println(print);
        
    }
}
