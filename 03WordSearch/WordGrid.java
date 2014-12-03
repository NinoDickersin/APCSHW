import java.io.*;
import java.util.*;
public class WordGrid{
    private char[][]data;
    private ArrayList<String> words;
    private Random rand;
    private ArrayList<String> successfulWords;
    private int[][] directionMap = {
	//0
	{0,1},
	//1
	{1,1},
	//2
	{1,0},
	//3
	{1,-1},
	//4
	{0,-1},
	//5
	{-1,-1},
	//6
	{-1,0},
	//7
	{-1,1}
	//8
    };
    /** Initializes the WordGrid to a specific size, initializes the words and     *successfulWords ArrayLists, sets all the coordinates of the WordGrid to
     *spaces, retrieves an ArrayList of words for use in the grid, and 
     *initializes the Random seed for the WordGrid.
     */
    public WordGrid(int rows,int cols){
	data = new char[rows][cols];
	words = new ArrayList<String>(0);
	successfulWords = new ArrayList<String>(0);
	rand = new Random();
	this.clear();
    }
    /**Sets the random seed of the Random object rand.
     */
    public void setSeed(long seed){
	rand = new Random(seed);
    }

    /**Gets a list of words from a .txt file(fileName) and places them in the 
     *ArrayList words. Runs addAllWords() to complete the wordGrid. The
     *boolean determines whether or not random letters are placed in the
     *wordGrid.
     */

    public void loadWordsFromFile(String fileName, boolean fillRandomLetters){
	String s = "a";
	try {
	    FileReader f = new FileReader(fileName);
	    BufferedReader b = new BufferedReader(f);
 
	    while(s != null) {
		s = b.readLine();
		if (s != null)
		    words.add(s);
            }
        }
	catch (IOException e) {}
	addAllWords();
	if(fillRandomLetters){
	    randomLetterer();
	}
    }

    /**Fills any empty spaces in the wordGrid with random letters.
     */

    public void randomLetterer(){
	for(int i = 0; i < data.length; i ++){
	    for(int j = 0; j < data[i].length; j++){
		if(spotCheck(i, j)){
		    data[i][j] = (char)('a' + rand.nextInt(26));
		}
	    }
	}
    }

    /**Sets all values in the WordGrid to spaces.
     */
    public void clear(){
	for (int i = 0; i < data.length; i ++){
	    for(int j = 0; j < data[i].length; j ++){
		data[i][j] = ' ';
	    }
	}
    }

    /**Returns a String with each character separated by spaces, and each row
     *separated by newlines.
     */
    public String toString(){
	String a = "";
	for (int i = 0; i < data.length; i ++){
	    for(int j = 0; j < data[i].length; j++){
		a += data[i][j] + " ";
	    }
	    a += "\n";
	}
	return a;
    }

    /**Checks to see if a char can be placed in a particular coordinate of the
     *word grid.
     */
    public boolean spotCheck(char value, int r, int c){
	if (data[r][c] == ' ' || data[r][c] == value){
	    return true;
	}
	return false;
    }
    //spotCheck with no given value(for randomLetterer())
    public boolean spotCheck(int r, int c){
	if(data[r][c] == ' '){
	    return true;
	}
	return false;
    }

    /**Attempts to add a specific string to the WordGrid. Returns true if the      *addition was successful. Returns false if the addition is unsuccessful.
     *Row and col determine the starting point of the word. Direction 
     *determines the manner in which the word travels across the grid using 
     *the slopes in directionMap.
     */
    public boolean add(String word, int row, int col, int direction){
	int colChange = directionMap[direction][0];
	int rowChange = directionMap[direction][1];
	for(int i = 0; i < word.length(); i ++){
	    if(!this.spotCheck(word.charAt(i), row, col)){
		return false;
	    }
	    col += colChange;
	    row += rowChange;
	}
	col -= colChange;
	row -= rowChange;
	for(int j = word.length() - 1; j >= 0; j--){
	    data[row][col] = word.charAt(j);
	    col -= colChange;
	    row -= rowChange;
	}
	return true;
    }

    /** Adds all the words from the ArrayList into the WordGrid.
     */

    public void addAllWords(){
	Boolean x;
	int row = data.length;
	int col = data[0].length;
	for(int i = 0; i < words.size(); i ++){
	    x = false;
	    for(int j = 0; !x && j < 5; j++){
		try{
		    x = this.add(words.get(i),rand.nextInt(row),rand.nextInt(col), rand.nextInt(9));
		}catch(ArrayIndexOutOfBoundsException e){}
		if(x){
		    successfulWords.add(words.get(i));
		}
	    }
	}
    }
    /** Returns all the words successfully placed in the WordGrid puzzle.
     *  Words appear in rows of length 6 each.
     */
    public String wordsInPuzzle(){
	String s = "";
	for (int i = 0; i < successfulWords.size(); i++){
	    s += successfulWords.get(i) + " ";
	    if (i != 0 && i % 6 == 0){
		s+="\n";
	    }
	}
	return s;
    }
}
