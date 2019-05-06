import java.io.*;
public class MagpieAlpha
{
    
    
    public String start(){
        return "Hey, lets talk";
    }
    public String getResponse(String statement) {
        statement = statement.toLowerCase();
        String response = "";
        if(statement.length() == 0) {
            response = "I didnt quiet get that";
        }
        else if(containsWord(statement, "how are you")==true) {
            response = "I am doing well, how are you?";
        }
        else if(containsWord(statement, "dog") ==true|| containsWord(statement, "cat")==true){
            response = "I like animals too!";
        }
        else if(containsWord(statement, "what is")==true) {
            response = "I dont know, what is " + whatIsPhrase(statement,"what is")+"?";
        }
        else if(containsWord(statement, "who is")==true) {
            response = "I dont know who" + whatIsPhrase(statement, "who is") + " is?";
        }else if(containsWord(statement,"i like")==true){
            response= likePhrase(statement,"i like")+"";
        }else{
            response=getRandom();
        }
        return response;

    }
    public boolean containsWord(String s, String w){
        s.trim();
        
        s=" "+s+" ";
        w=" "+w+" ";
        //String goal=" "+w+" ";
        //String sent=" "+s+" ";
        return s.contains(w);
    
    }
    public boolean containsWord2(String s, String[] w){
        s.trim();
        
        String[] words=new String[w.length];
        String sent=" "+s+" ";
        for(int i=0;i<w.length;i++){
            words[i]=" "+w[i]+" ";
        }
        
        for(int i=0;i<words.length;i++){
            if(!sent.contains(words[i])){
                return false;
            }
        }
        return true;
    
    }
    public String likePhrase(String statement, String keyPhrase){
        
        if(containsWord(statement,"you")){
            return "Yes";
        }
        return "Do you really like"+statement.substring(statement.indexOf(statement) + keyPhrase.length());
    }
    public String whatIsPhrase(String statement, String keyPhrase) {
                return statement.substring(statement.indexOf(statement) + keyPhrase.length());
    
    }
    public String getRandom(){
        String[] rand={"Ok", "Hmmm", "Intersenting", "Keep going"};
        int index= (int)(Math.random()*rand.length);
        return rand[index];
    }
}
