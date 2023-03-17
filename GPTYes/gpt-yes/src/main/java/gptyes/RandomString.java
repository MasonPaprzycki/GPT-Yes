package gptyes;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.groupdocs.search.Index;


public class RandomString{
   
  


 
    

    static String[] getSynonyms(String word){
        ArrayList<String> listSynonyms = new ArrayList<String>();

   

        Index pass = new Index();

        String[] synonyms = pass.getDictionaries().getSynonymDictionary().getSynonyms(word);
        pass.close();
       
        


        for (String synonym : synonyms) {
            listSynonyms.add(synonym);
        

     
        }
        String[] stringArray = new String[listSynonyms.size()];
        stringArray = listSynonyms.toArray(stringArray);
     
        return stringArray;

    }

    static String getRandomSynonym(String word, int trueRandomNumber){
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

    static String getRandomString(String text, int trueRandomNumber){


        String[] sillyString = text.split(" ");
        for(String word: sillyString){
            word = getRandomSynonym(word, trueRandomNumber);
            System.out.println(word);

        }
        String end = String.join(" ", sillyString); 
        




        /*ArrayList<String> remove = new ArrayList<String>();
        remove.add("'");


        String[]doNotChange = {"is","the","why","are","he","she","they","them","him","her","his","to","a","it","it's"};
        List<String>doNotChangeList  = Arrays.asList(doNotChange);


        String[] textRawArray = text.split("");
        ArrayList<String>textRawArrayList = new ArrayList<String>(Arrays.asList(textRawArray));
        textRawArrayList.removeAll(remove);
        String[] stringArray = new String[textRawArrayList.size()];
        stringArray = textRawArrayList.toArray(stringArray);

        String joinedString = String.join(" ",stringArray);

        String[] sentences = joinedString.split(".");

        for(String sentence : sentences){
            String[] words =  sentence.split(" ");
            for(String word : words){
                if(!doNotChangeList.contains(word)){
                    word = getRandomSynonym(word,trueRandomNumber);
                }
               
            }
            sentence = String.join(" ", words);

        }
        String joined = String.join(".",sentences); */


        return end;
    }
    
  
      

  
}