package gptyes;
import java.util.ArrayList;
import com.groupdocs.search.Index;

public class RandomString{

    public String[] returnSynonyms(String query){
        ArrayList<String> listSynonyms = new ArrayList<String>();
        String[] synonyms = new Index().getDictionaries().getSynonymDictionary().getSynonyms(query);


        for (String synonym : synonyms) {
            listSynonyms.add(synonym);
        

     
        }
        String[] stringArray = new String[listSynonyms.size()];
        stringArray = listSynonyms.toArray(stringArray);
        return stringArray;

    }
    
    
   
      

    public RandomString(){
        
    }
}