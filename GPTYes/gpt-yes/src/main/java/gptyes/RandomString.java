package gptyes;
import java.util.ArrayList;
import com.groupdocs.search.Index;

public class RandomString{
    int trueRandomNumber;
    String text;
    

    private String[] getSynonyms(String word){
        ArrayList<String> listSynonyms = new ArrayList<String>();
        
        // close index list 

        String[] synonyms = new Index().getDictionaries().getSynonymDictionary().getSynonyms(word);


        for (String synonym : synonyms) {
            listSynonyms.add(synonym);
        

     
        }
        String[] stringArray = new String[listSynonyms.size()];
        stringArray = listSynonyms.toArray(stringArray);
        return stringArray;

    }

    private String getRandomSynonym(String word){
        String[] synonyms = getSynonyms(word);
        int length = synonyms.length;

        
        if(length>1){
            return synonyms[(trueRandomNumber %(length))-1] ;

        }
        else if(length==1){
            return synonyms[0];

        }
        else{
            return word;

        }
        
    }

    public String getRandomString(String inputString){

        return"j";
    }
    
    public RandomString(String text, int trueRandomNumber){
        text =text;
        trueRandomNumber = trueRandomNumber;
    }
   
      

  
}