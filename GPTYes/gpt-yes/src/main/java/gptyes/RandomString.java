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
        for(int i =0; i<sillyString.length; i++){
            String var = getRandomSynonym(sillyString[i], trueRandomNumber);


            // for some reason it prints h5n1 even with this code thats really really weird 
            if(var!="h5n1"){
                sillyString[i] = var;
            }
          
            System.out.println(sillyString[i]);
        }
     
        String end = String.join(" ", sillyString); 
        

        return end;
    }
    
  
      

  
}