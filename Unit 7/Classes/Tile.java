// In the board game Scrabble, each tile contains a letter, 
// which is used to spell words in rows and columns, and a score, 
// which is used to determine the value of words.

public class Tile {
    private char letter;
    private int value;

    public Tile(char letter, int value) {
        this.letter = letter;
        this.value = value;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void printTile(Tile tile) {
        System.out.println("Letter: " + tile.getLetter());
        System.out.println("Value: " + tile.getValue());
    }

    @Override
    public String toString() {
        return "Tile [letter=" + letter + ", value=" + value + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Tile other = (Tile) obj;
        return letter == other.letter && value == other.value;
    }
}