        
public class puzzleDriver
{
    public static void main(){
        HiddenWord puzzle = new HiddenWord("HARPS");
        System.out.println(puzzle.getHint("AAAAA")); //"+A+++"
        System.out.println(puzzle.getHint("HELLO")); //"H****"
        System.out.println(puzzle.getHint("HEART")); //"H*++*"
        System.out.println(puzzle.getHint("HARMS")); //"HAR*S"
        System.out.println(puzzle.getHint("HARPS")); //"HARPS"
        System.out.println(puzzle.getHint("HARPS"));
        System.out.println(puzzle.getWord());
        //System.out.println(puzzle.getGuess());
    }
}
