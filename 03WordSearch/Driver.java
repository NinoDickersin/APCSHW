public class Driver{
    public static void main(String[]args){
	WordGrid a = new WordGrid(20,20);
	System.out.println(a.findWordList());
	a.addAllWords();
	System.out.println(a);
    }
}
