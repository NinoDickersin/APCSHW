import java.util.*;
public class Driver{
    public static void main (String[]args){
	if(args[0].equals("select")){
	    SuperArray a = new SuperArray(100000, true);
	    a.selectionSort();
	    System.out.println("Sorted!");
	}else if (args[0].equals("insert")){
	    SuperArray a = new SuperArray(100000, true);
	    a.insertionSort();
	    System.out.println("Sorted!");
	}else{
	    String[] a = new String[100000];
	    for(int i = 0; i < a.length; i ++){
		a[i] = "" + i;
	    }
	    Arrays.sort(a);
	    System.out.println("Sorted!");
	}


    }
}