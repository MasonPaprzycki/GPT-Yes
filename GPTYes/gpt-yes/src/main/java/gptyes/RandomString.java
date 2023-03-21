package gptyes;


import com.groupdocs.search.Index;


public class RandomString{

    public static final String no = "h5n1";
   
  


 
    

   
    static String getRandomSynonym(String word, int trueRandomNumber){
        Index pass = new Index();
       
        String[] synonyms = pass.getDictionaries().getSynonymDictionary().getSynonyms(word);
        pass.close();
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



            if(!sillyString[i].equals("a")){
                sillyString[i] = getRandomSynonym(sillyString[i], trueRandomNumber);
              
            }
          
            
          
            System.out.println(sillyString[i]);
        }
     
        String end = String.join(" ", sillyString); 
        

        return end;
    }
    
  
      

  
}