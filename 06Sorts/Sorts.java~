public class Sorts{
    public static void bubble(int[]c){
	int x = 0;
	for(int n = c.length; n > 1; n --){
	    for(int i = 0; i < n - 1; i ++){
		if (c[i] < c[i + 1]){
		    x = c[i];
		    c[i] = c[i+1];
		    c[i+1] = x;
		}
	    }
	} 
    }
    public static void selectionSort(int[]c){
	int d, j;
	int smallest;
	int temp;
	for(int i = 0; i < c.length;i++){
	    smallest = c[i];
	    d = i + 1;
	    j = i;
	    for(;d < (c.length - 1);d++){
		if (c[d] < smallest){
		    smallest = c[d];
		    j = d;
		}
	    }
	    temp = c[i];
	    c[i] = smallest;
	    c[j] = temp;
	}
    }

    public static void insertionSort(int[]c){
	int e = 0;
	for(int i = 1; i < c.length; i ++){
	    if(c.length > 1 && c[i] > c[i + 1]){
		e = c[i];
		int j = i;
		for (;j >= 1 && e > c[j + 1]; j --){
		    c[j] = c[j - 1];
		}
		c[j] = e;
	    }
	} 
    }

    public static void main(String[]args){
	int[] a = new int [10];
	for(int i = 0; i < a.length; i ++){
	    System.out.println(a[i]);
	}
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
	bubble(a);
	for(int i = 0; i < a.length; i ++){
	    System.out.println(a[i]);
	}
    }
}