import java.util.*;

public class CollapseDuplicates{

    public static void collapseDuplicates(ArrayList<Integer> L){
	for (int i = 0; i < L.size() - 1; i ++){
	    if (L.get(i) == L.get(i+1)){
		L.remove(i + 1);
		i--;
	    }
	}
    }

    public static void main(String[]args){
	ArrayList<Integer> L;
	L = new ArrayList<Integer>();
	L.add(9);
	L.add(0);
	L.add(0);
	L.add(2);
	L.add(2);
	L.add(2);
	L.add(1);
	L.add(1);
	L.add(1);
	L.add(1);
	L.add(11);
	L.add(0);
	System.out.println(L);
	collapseDuplicates(L);
	System.out.println(L);
    }
}
