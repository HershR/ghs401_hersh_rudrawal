
public class HiddenWord
{
    // instance variables - replace the example below with your own
    private String word;
    private String guess;
    public HiddenWord(String word)
    {
        this.word=word.toUpperCase();
    }
    public String getHint(String guess){
        guess.toUpperCase();
        String output="";
        for(int i=0;i<word.length();i++){
            if(guess.substring(i,i+1)==word.substring(i,i+1)){
                output+=guess.substring(i,i+1);
            }
            else if(guess.compareTo(word)==0){
                output+= "+";
            }
            else{
                output+= "*";
            }
            
        }
        System.out.println(guess);
        return output;
    }
    public String getWord(){
    
        return(word);
    }
    public String getGuess(){
        return(guess);
    }
}
/**public String getHint(String guess){
        guess.toUpperCase();
        String output="";
        for(int i=0;i<word.length();i++){
            int result=word.substring(i,i+1).compareTo(guess.substring(i,i+1));
            if(result==0){
                output+=word.substring(i,i+1);
            }else if(result!=0){
                
                for(int a =0;a<word.length();a++){
                    result=guess.substring(i,i+1).compareTo(word.substring(a,a+1));
                    if(result==0 && guess.substring(i,i+1)!=word.substring(i,i+1)){
                        output+="+";
                        break;
                    }else{
                        output+="*";
                        break;
                    }
                
                }
            }
            
        }
        return output;
    } **/