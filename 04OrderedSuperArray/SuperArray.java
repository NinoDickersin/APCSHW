public class SuperArray{
    private String[] array;
    private int current;

    public SuperArray(){
	this(10);
    }

    public SuperArray(int size){
	array = new String[size];
    }
    
    public String toString(){
	String s = "[ ";
	for (int i = 0; i < this.size(); i ++){
	    s += array[i] + " ";
	}
	s += "]";
	return s;
    }
    public void add(String e){
	this.add(this.size(), e);
    }
    
    public void add(int index, String e){
	if (index < 0 || index > this.size()){
	    throw new IndexOutOfBoundsException("Index out of bounds.");
	}
	this.resize(this.size() + e.length());
	for (int i = this.size(); i > index; i --){
	    this.set(i - 1, this.get(i));
	}
	this.set(index, e);
    }

    public int size(){
	return array.length;
    }

    public void resize(int newCapacity){
	int a;
	String[] newArray = new String[newCapacity]; 
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
    
    public String get(int index){
	if (index < 0 || index >= this.size()){
	    throw new IndexOutOfBoundsException("Index out of bounds.");
	}
	return array[index];
    }
    
    public void set(int index, String e){
	if (index < 0 || index >= this.size()){
	    throw new IndexOutOfBoundsException("Index out of bounds.");
	}	
	array[index] = e;
    }
    public String remove (int index){
	if (index < 0 || index >= this.size()){
	    throw new IndexOutOfBoundsException("Index out of bounds.");
	}
	String a = new String();
	a = this.get(index);
	while(index < this.size() - 1){
	    array[index] = array[index + 1];
	    index++;
	}
	current--;
	if(current < array.length / 4){
	    resize(array.length / 2);
	}
	return a;
    }

    public static void main(String[]args){
	SuperArray a = new SuperArray();
	System.out.println(a);
	System.out.println(a.size());
	a.set(0, "Start");
	a.set(2, "b");
	a.set(4, "4");
	System.out.println(a.remove(2));
	System.out.println(a.get(0));
	System.out.println(a.get(4));
	a.resize(5);
	System.out.println(a.get(0));
	System.out.println(a.get(4));
	System.out.println(a.size());
	a.clear();
	System.out.println(a);
	System.out.println(a.size());
    }
}
