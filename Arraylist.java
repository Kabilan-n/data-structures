interface Seq {
	public void append(int i);
	public void print();
	public boolean isEmpty();
	public int search(int i);
	public void delete();
}

public class Arraylist implements Seq {
	int [] a;
    int size=0;
    public Arraylist(){
        a=new int[5];
    }

    public Arraylist(int n){
        
        a=new int[n+5];
    }

    public Arraylist(int arr[]){
        a=arr;
        size=arr.length;
    }

    public void append(int n){
        if(size<a.length){
            a[size++]=n;
            
        }
        else{
            int temp[]=new int[2*a.length];
            for(int i=0;i<a.length;i++){
                temp[i]=a[i];
            }
            
            temp[a.length]=n;
            a=temp;
            size++;
        }
    }
    
   public  void delete(){
        a[--size]=0;
    }
    
    public int search(int n){
        int pos=-1;
        for(int i=0;i<size;i++){
            if(a[i]==n){
               pos=i;
               break;
            }
        }
        return pos;
    }
    
    void insert(int pos,int n){
        if(pos<size){
            
           for(int i=size;i>pos;i--){
               a[i]=a[i+1];
            }
            a[pos]=n;
            size++;
        }
        
    }
    
    public void print(){
        
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" "
            		+ "");
        }
        System.out.println();
    }
    
    public boolean isEmpty() {
		size=0;
		return false;
	}
    
    public static void main(String args[]){
        Arraylist a=new Arraylist();
        a.append(2);a.print();
        a.append(4);a.print();
        a.append(5);a.print();
        a.append(7);a.print();
        a.append(5);a.print();
        a.append(1);a.print();
        a.delete();a.print();
        a.delete();a.print();
        a.delete();a.print();
        a.delete();a.print();
        System.out.println(a.search(1));
    }

	
}


