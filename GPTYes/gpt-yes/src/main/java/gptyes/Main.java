package gptyes;

import gptyes.RandomString;




/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )

    {
        System.out.println("processing");
        String text = "I traveled to the park";
        int random = 123344;
        RandomString randomString = new RandomString();
        String print = randomString.getRandomString(text, random);
        System.out.println(print);
        
    }
}
