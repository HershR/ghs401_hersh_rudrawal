import java.util.ArrayList;
import java.util.List;
public class LogMessage
{
    // instance variables - replace the example below with your own
    private String messageId;
    private String description;
    
    public LogMessage(String message)
    {
        this.messageId=message.substring(0,(message.indexOf(":")));
        this.description=message.substring(message.indexOf(":")+1);
    }
    public boolean containsWord(String keyword){
        
        int y = this.description.indexOf(keyword);
        int x = this.description.indexOf(keyword) + keyword.length();
        if(this.description.contains(keyword) && this.description.length() == keyword.length()) {
            return true;
        }
        else if(y == 0 && this.description.substring(x+1, x + 2).equals(" ")) {
            return true;
        }
        else if( x == this.description.length() && this.description.substring( y - 1, y).equals(" ")) {
            return true;
        }
        else if(this.description.contains(" " + keyword + " ")) {
            return true;
            /*y = this.description.indexOf(keyword);
            x = this.description.indexOf(keyword) + keyword.length();
            if(y == 0 && this.description.substring(x+1, x + 2).equals(" ")) {
                return true;
            }
            else if( x == this.description.length() && this.description.substring( y - 1, y).equals(" ")) {
                return true;
            }
            else if(this.description.substring(y-1, y).equals(" ") && this.description.substring(x+1, x+2).equals(" ")) { 
                return true;
            }
            else {
                return false;
            }*/
        }
        else {
            return false;
        }
        
    }
    public List<LogMessage> removeMessage(String keyword){
        List<LogMessage> messageList = new ArrayList<LogMessage>();
        for(int i=0;i<messageList.size();){
            if(messageList.get(i).containsWord(keyword)==true){
                messageList.remove(i);
                i--;
            }
        }
        return messageList;
    }
    public String getMachineID()
      {
      return messageId;    
      } // end method getMachineID
    public String getDescription()
      {
      return description;    
      } // end method getDescription
    public String toString()
      {
         return messageId + ":" + description;
      }

}
