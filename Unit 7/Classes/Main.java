// In the board game Scrabble, each tile contains a letter, 
// which is used to spell words in rows and columns, and a score, 
// which is used to determine the value of words.

public class Main {
    public static void main(String[] args) {
        Tile tile = new Tile('A', 1);

        System.out.println("This is the letter " + tile.getLetter());
        System.out.println("This is the number " + tile.getValue());

        tile.setLetter('Z');
        tile.setValue(10);

        System.out.println("This is the new letter " + tile.getLetter());
        System.out.println("This is the new number " + tile.getValue());
    }
}