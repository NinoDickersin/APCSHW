public class SuperArray{
    private Object[] array;
    private int current;

    public SuperArray(){
	this(10);
    }

    public SuperArray(int size){
	array = new Object[size];
    }
    
    public String toString(){
	String s = "[ ";
	for (int i = 0; i < this.size(); i ++){
	    s += array[i] + " ";
	}
	s += "]";
	return s;
    }
    public void add(Object e){
	this.add(this.size(), e);
    }
    
    public void add(int index, Object e){
	if (index < 0 || index > this.size()){
	    throw new IndexOutOfBoundsException("Index out of bounds.");
	}
	this.resize(this.size() + 1);
	this.set(index, e);
    }

    public int size(){
	return array.length;
    }

    public void resize(int newCapacity){
	int a;
	Object[] newArray = new Object[newCapacity]; 
	if(this.size() > newCapacity){
	    a = newCapacity;
	}else{
	    a = this.size();
	}
	for(int i = 0; i < a; i ++){
	    newArray[i] = this.get(i);
	}
	array = newArray;
    }

    public void clear(){
	this.resize(0);
    }
    
    public Object get(int index){
	if (index < 0 || index >= this.size()){
	    throw new IndexOutOfBoundsException("Index out of bounds.");
	}
	return array[index];
    }
    
    public void set(int index, Object e){
	if (index < 0 || index >= this.size()){
	    throw new IndexOutOfBoundsException("Index out of bounds.");
	}	
	array[index] = e;
    }
    public Object remove (int index){
	if (index < 0 || index >= this.size()){
	    throw new IndexOutOfBoundsException("Index out of bounds.");
	}
	Object a = new Object();
	a = this.get(index);
	return a;
    }

    public static void main(String[]args){
	SuperArray a = new SuperArray();
	System.out.println(a);
	System.out.println(a.size());
	a.set(0, "Start");
	a.set(1, 1);
	a.set(2, 'b');
	a.set(3, 3.0);
	a.set(4, "4");
	System.out.println(a.get(0));
	System.out.println(a.get(4));
	a.resize(5);
	System.out.println(a.get(0));
	System.out.println(a.get(4));
	System.out.println(a.size());
	a.clear();
	System.out.println(a);
	a.add(0, "Yay!");
	System.out.println(a.get(0));
	System.out.println(a.size());
	System.out.println(a);
	a.remove(0);
	System.out.println(a);
	a.set(999, "LML");
	System.out.println(a);
    }
}
