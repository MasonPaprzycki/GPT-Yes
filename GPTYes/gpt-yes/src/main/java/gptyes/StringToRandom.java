package gptyes;

import com.groupdocs.search.Index;

/**
 * Hello world!
 *
 */
public class StringToRandom
{
    public static void main( String[] args )
    {
        String query = "show";
        String[] synonyms = new Index().getDictionaries().getSynonymDictionary().getSynonyms(query);

        System.out.println("Synonyms for " + query +":");

        for (String synonym : synonyms) {
        System.out.println(synonym);
        }
      
    }
}
