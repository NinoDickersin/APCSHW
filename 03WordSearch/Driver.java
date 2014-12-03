public class Driver{
    public static void main(String[]args){
	int rows = 20;
	int cols = 20;
	if(args.length == 2){
	    rows = Integer.parseInt(args[0]);
	    cols = Integer.parseInt(args[1]);
	}
	WordGrid a = new WordGrid(rows, cols);
	long seed = 0;
	if(args.length == 3){
	    seed = Long.parseLong(args[2]);
	}
	boolean answer = true;
	    if(args.length == 4 && Integer.parseInt(args[3]) == 1){
	    answer = false;
	}
	a.setSeed(seed);
	a.loadWordsFromFile("Words.txt", answer);
	System.out.println("Find these words:\n" + a.wordsInPuzzle());
	System.out.println(a);
    }
}
