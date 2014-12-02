public class OrderedSuperArray extends SuperArray{

    public void add(String e){
	this.resize(this.size() + 1);
	int i = this.size();
	while(e.compareTo(this.get(i - 1)) <= 0)){
	this.set(i, this.get(i - 1));
	}
    }
    
    public void add(int index, String e){
	this.add(e);
    }
}