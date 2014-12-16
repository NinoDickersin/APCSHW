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

    public String toString(){
	String s = "[ ";
	for (int i = 0; i < this.length; i ++){
	    s += this[i] + " ";
	}
	s += "]";
	return s;
    }

    public static void main(String[]args){
	int[] a = new int [10];
	System.out.println(a);
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
	System.out.println(a);
    }
}