import java.io.*;
import java.util.*;
public class WordGrid{
    private char[][]data;
    private ArrayList<String> words;
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
    /**Initialize the grid to the size specified and fill all of the positions
     *with spaces.
     *@param row is the starting height of the WordGrid
     *@param col is the starting width of the WordGrid
     */
    public WordGrid(int rows,int cols){
	data = new char[rows][cols];
	words = new ArrayList<String>(0);
	this.clear();
	this.wordsGet();
    }
    /**Gets a list of words from a .txt file and places them in the ArrayList "words".
     */

    public void wordsGet() throws FileNotFoundException{
	File infile = new File("Words.txt");
	System.out.println(infile.exists());
	System.out.println(infile.canRead());
	Scanner in = new Scanner(infile);
	while(in.hasNextLine()){
            words.add(in.nextLine());
	}
    }
    /**Set all values in the WordGrid to spaces ' '*/
    private void clear(){
	for (int i = 0; i < data.length; i ++){
	    for(int j = 0; j < data[i].length; j ++){
		data[i][j] = ' ';
	    }
	}
    }

    /**The proper formatting for a WordGrid is created in the toString.
     *@return a String with each character separated by spaces, and each row
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
    
    /**Reverses a given string.
     */

    public String reverseString(String str){
	String s = "";
	for(int i = 0; i < str.length() - 1; i ++){
	    s += str.substring(i, i+1);
	}
	return s;
    }
    
    // public boolean wordCheck(String word, int row, int col){
    // }

    /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from left to right, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned.
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
    
    public boolean addWordHorizontal(String word,int row, int col){
	for (int i = 0; i < word.length(); i ++){
	    if (!this.spotCheck(word.charAt(i), row, col)){
		return false;
	    }
	    col ++;
	}
	col --;
	for(int j = word.length() - 1; j >= 0; j--){
	    data[row][col] = word.charAt(j);
	    col --;
	}
	return true;
    }
    /** Adds a word in the downward vertical direction. */ 
    public boolean addWordVertical(String word, int row, int col){
	for (int i = 0; i < word.length(); i ++){
	    if (!this.spotCheck(word.charAt(i), row, col)){
		return false;
	    }
	    row ++;
	}
	row --;
	for(int j = word.length() - 1; j >= 0; j--){
	    data[row][col] = word.charAt(j);
	    row --;
	}
	return true;
    }
    /** Adds a word in the downward diagonal direction. */
    public boolean addWordDiagonalDown(String word, int row, int col){
	for (int i = 0; i < word.length(); i ++){
	    if (!this.spotCheck(word.charAt(i), row, col)){
		return false;
	    }
	    row ++;
	    col ++;
	    
	}
	row --;
	col --;
	for(int j = word.length() - 1; j >= 0; j--){
	    data[row][col] = word.charAt(j);
	    row --;
	    col --;
	}
	return true;
    }
    /** Adds a word in the upward diagonal direction. */
    public boolean addWordDiagonalUp(String word, int row, int col){
	for (int i = 0; i < word.length(); i ++){
	    if (!this.spotCheck(word.charAt(i), row, col)){
		return false;
	    }
	    row --;
	    col ++;
	    
	}
	row ++;
	col --;
	for(int j = word.length() - 1; j >= 0; j--){
	    data[row][col] = word.charAt(j);
	    row ++;
	    col --;
	}
	return true;
    }
    /** Gets a word from the ArrayList.
     */

    public String retrieve(int index){
	System.out.println(words);
	return words.get(index);
    }

    public static void main(String[]args){
	WordGrid a = new WordGrid(5,5);
	a.clear();
	System.out.println(a);
	System.out.println(a.retrieve(0));
	/*
	a.add(a.retrieve(0), 0, 0, 0);
	a.add(a.retrieve(1), 2, 2, 3);
	a.add(a.retrieve(2), 4, 4, 6);
	a.add(a.retrieve(3), 4, 4, 7);
	a.add(a.retrieve(4), 0, 0, 0);
	a.add(a.retrieve(9), 1, 1, 4);
	*/
	a.clear();
	System.out.println(a);
    }

}
