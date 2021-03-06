public class OrderedSuperArray extends SuperArray{

    public OrderedSuperArray(){
	super();
	for(int i = 0; i < this.size(); i ++){
	    super.set(i, "");
	}
    }
    public OrderedSuperArray(int size){
	super(size);
	for(int i = 0; i < this.size(); i ++){
	    super.set(i, "");
	}
    }

    public void add(String e){
	int index = size();
	while( index > 0 && get(index-1).compareTo(e) > 0 ){
	    index --;
	}
	super.add(index, e);
    }
    
    public void add(int index, String e){
	this.add(e);
    }

    public void set(int i, String e){
	super.set(i, e);
	while(i != 0 && e.compareTo(this.get(i - 1)) <= 0){
	    super.set(i, this.get(i - 1));
	}
	if(i + 1 != this.size() && e.compareTo(this.get(i + 1)) <= 0){
	    this.remove(i);
	    this.add(e);
	}
    }

    public int find(String target){
	int c = size()/2;
    }


    public static void main(String[]args){
	OrderedSuperArray a = new OrderedSuperArray(4);
	a.set(0,"apple");
	a.set(1,"banana");
	a.set(2,"carrot");
	a.set(3,"dragonfruit");
	System.out.println(a);
	a.add("avocado");
	System.out.println(a);
    }
}
