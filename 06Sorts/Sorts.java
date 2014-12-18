import java.util.*;
public class Sorts{
    public static void bubbleSort(int[]c){
	int x = 0;
	for(int n = c.length; n > 1; n --){
	    for(int i = 0; i < n - 1; i ++){
		if (c[i] > c[i + 1]){
		    x = c[i];
		    c[i] = c[i+1];
		    c[i+1] = x;
		}
	    }
	} 
    }
    public static void selectionSort(int[]c){
	int d, smallest, temp;
	for(int i = 0; i < c.length;i++){
	    smallest = c[i];
	    for(d = i + 1; d < c.length; d++){
		if (c[d] < smallest){
		    temp = smallest;
		    smallest = c[d];
		    c[d] = temp;
		}
	    }
	    c[i] = smallest;
	}
    }

    public static void insertionSort(int[]c){
	if (c.length > 1){
	    int temp = 0;
	    for(int i = 1; i < c.length; i ++){
		if (c[i] < c[i - 1]){
		    temp = c[i];
		    int j = i;
		    for(; j > 0 && temp < c[j - 1]; j --){
			c[j] = c[j - 1];
		    }
		    c[j] = temp;
		}
	    }
	} 
    }


    public static void initializeArray(int[]a){
	a[0] = 7;
	a[1] = 88;
	a[2] = 29;
	a[3] = 33;
	a[4] = 42;
	a[5] = 64;
	a[6] = 81;
	a[7] = 0;
	a[8] = 2;
	a[9] = 10;
    }

    public static void main(String[]args){
	int[] a = new int [10];
	int[] control = new int [10];
	initializeArray(control);
	Arrays.sort(control);
	System.out.println("Control:");
	for(int i = 0; i < a.length; i ++){
	    System.out.println(control[i]);
	}
	initializeArray(a);
	bubbleSort(a);
	System.out.println("Bubble:\n");
	for(int i = 0; i < a.length; i ++){
	    System.out.println(a[i]);
	}
	initializeArray(a);
	System.out.println("Selection:\n");
	selectionSort(a);
	for(int i = 0; i < a.length; i ++){
	    System.out.println(a[i]);
	}
	initializeArray(a);
	System.out.println("Insertion:\n");
	insertionSort(a);
	for(int i = 0; i < a.length; i ++){
	    System.out.println(a[i]);
	}
    }
}
