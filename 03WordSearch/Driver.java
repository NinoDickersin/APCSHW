public class Driver{
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
