public class Driver{
    public static void main(String[]args){
	WordGrid a = new WordGrid(20,20);
	a.setSeed(1234);
	a.addAllWords();
	System.out.println(a.wordsInPuzzle());
	System.out.println(a);
    }
}
