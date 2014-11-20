public class WordGrid{
    private char[][]data;

    /**Initialize the grid to the size specified and fill all of the positions
     *with spaces.
     *@param row is the starting height of the WordGrid
     *@param col is the starting width of the WordGrid
     */
    public WordGrid(int rows,int cols){
	data = new char[rows][cols];
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
    public boolean spotCheck(char value, int r, int c){
	if (data[r][c] == ' ' || data[r][c] == value){
	    return true;
	}
	return false;
    }

    public boolean addWordHorizontal(String word,int row, int col){
	for (int i = 0; i < word.length(); i ++){
	    if (!this.spotCheck(word.charAt(i), row, col)){
		return false;
	    }else{
		col += 1;
	    }
	}
	col -= 1;
	for(int j = word.length() - 1; j >= 0; j--){
	    data[row][col] = word.charAt(j);
	    col -= 1;
	}
	return true;
    }

    public static void main(String[]args){
	WordGrid a = new WordGrid(5,5);
	a.clear();
	System.out.println(a);
	System.out.println(a.addWordHorizontal("swaq", 1, 1));
	//true
	System.out.println(a.addWordHorizontal("baby", 1, 0));
	//false
	System.out.println(a.addWordHorizontal("swaq", 1, 1));
	//true
	System.out.println(a.addWordHorizontal("apple", 4, 0));
	//true
	System.out.println(a);
	//swaq
	//apple
	a.clear();
	System.out.println(a);
    }

}