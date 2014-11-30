import java.util.*;
public class Driver2{
    public static void main(String[]args){
	Random r = new Random();
	WordGrid a = new WordGrid(20,20);
	int i = 0;
	while (i < 100){
	    try{
	    a.add("banana", r.nextInt(21), r.nextInt (21), r.nextInt(9));
	    }catch(ArrayIndexOutOfBoundsException e){
		System.out.println("Array Index Out Of Bounds");
	    }
	    i ++;
	}
	System.out.println(a);
    }
}
