package gptyes;
import java.util.ArrayList;
import com.groupdocs.search.Index;

public class RandomString{

    private String[] returnSynonyms(String query){
        ArrayList<String> listSynonyms = new ArrayList<String>();
        String[] synonyms = new Index().getDictionaries().getSynonymDictionary().getSynonyms(query);


        for (String synonym : synonyms) {
            listSynonyms.add(synonym);
        

     
        }
        String[] stringArray = new String[listSynonyms.size()];
        stringArray = listSynonyms.toArray(stringArray);
        return stringArray;

    }

    private String getRandomSynonym(String word,int trueRandomNumber){
        return"j";
    }

    public String getRandomString(String inputString){

        return"j";
    }
    
    
   
      

  
}