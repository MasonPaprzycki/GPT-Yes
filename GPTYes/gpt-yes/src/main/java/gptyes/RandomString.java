package gptyes;

import com.groupdocs.search.Index;
// this api is not mine 
// I retrieved this api from 

public class RandomString{

   // this method manages complexity because it makes the flow of the program 
   // more simple and i have less steps i have to think through 
   
    static String getRandomSynonym(String word, int trueRandomNumber){
        Index pass = new Index();
        String[] synonyms = pass.getDictionaries().getSynonymDictionary().getSynonyms(word);
        pass.close();
        int length = synonyms.length;
        if(length>1){
            return synonyms[(trueRandomNumber %(length))] ;
        }
        else if(length==1){
            return synonyms[0];
        }
        else{
            return word;
        }
    }

    static String getRandomString(String text, int trueRandomNumber){
        // this list is meaningful because I am taking input from the user 
        //and i have to seperate each of the words and change them independently 
        String[] sillyString = text.split(" ");

        for(int i =0; i<sillyString.length; i++){
            if(!sillyString[i].equals("a")){
                sillyString[i] = getRandomSynonym(sillyString[i], trueRandomNumber);
            }
            System.out.println(sillyString[i]);
        }
        String end = String.join(" ", sillyString); 
        return end;
    }
}