public class Contains{

    public static boolean contains(int value, int[]c){
	for(int i = 0; i < c.length; i ++){
	    if (c[i] == value){
		return true;
	    }
	}
	return false;
    }


    public static boolean contains(int value, int[][]c){
	for(int i = 0; i < c.length; i ++){
	    if (contains(value, c[i])){
		return true;
	    }	 
	}
	return false;
    }

    public static void main(String[]args){
	int[][]c = {
	    {0,0,0,0},
	    {0,1,2,3}
	};
	int []a = new int[4];
	System.out.println(contains(2, c));
	System.out.println(contains(11, a));
    }
}
