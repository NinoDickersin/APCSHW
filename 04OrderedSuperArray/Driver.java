import java.util.*;
public class Driver{
    public static void main (String[]args){
/**
	SuperArray a = new SuperArray(100);
	a.insertionSort();
	String[] b = new String[100];
	Random c = new Random(123);
	for(int i = 0; i < b.length; i ++){
	    b[i] = "" + (char)('a' + c.nextInt(26));
	}
	Arrays.sort(b);
	for(int i = 0; i < b.length; i++){
	    if( !(a.get(i) == b[i])){
		System.out.println("Sorted incorrectly.");
		break;
	    }
	}
*/
	SuperArray a = new SuperArray(10, true);
	a.insertionSort();
	System.out.println(a);
    }
}