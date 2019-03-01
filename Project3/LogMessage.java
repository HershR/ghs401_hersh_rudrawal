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
        String x = " " + keyword + " ";
        String y = " " + this.description + " ";
        return y.contains(x);
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
