
public class Songs
{
      private int cost;
      private String artist;
      private String title;
      private boolean good;
      private int lengthInSec;
      public Songs (int cost, String artist, String title, boolean good, int lengthInSec){
          this.cost = cost;
          this.artist = artist;
          this.title = title;
          this.good = good;
          this.lengthInSec=lengthInSec;
      }
      public int getLengthInSec(){
          return this.lengthInSec;
      }
      public void setLengthInSec( int newSeconds ){
          this.lengthInSec=newSeconds;
      }
      public String convertToMinSec(){
        
        int mins = ((int)((this.lengthInSec)/60)); 
        int seconds=this.lengthInSec- (mins*60);
        String output=("Length: " + mins+":" + seconds);
        return output;
      }
      public String toString()
      {
          String output = "How much : " +this.cost + "\nArtist: " + this.artist + "\nTitle: " + this.title + "\nGood or Bad: " + this.good + "\nLength "+this.lengthInSec+"\nEnd of Constructor\n";
          return output;
      }
}
