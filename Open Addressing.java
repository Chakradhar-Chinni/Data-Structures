import java.util.*; 
import java.io.*;  

class MyHash
{
    int[] arr;
    int cap,size;   
    MyHash(int c)  //Constructor 
    {
       cap=c;  //Array Size
        size=0; //keeps track of count of inserted values in array, if (size == cap) then, array is completely filled with values.
        arr=new int[cap];
        for(int i=0;i<cap;i++) //'-1' indicates an empty block 
            arr[i]=-1;
    }
    
    int hash(int key){
        return key%cap;   //computing hash to get index
    }
    
    boolean insert(int key)
    {
        if(size==cap)
            return false;
        int i=hash(key);
        while(arr[i]!=-1 && arr[i]!=-2 && arr[i]!=key)
            i=(i+1)%cap;
        if(arr[i]==key)
            return false;
        else{
            arr[i]=key;
            size++;
            return true;
        }
    }
    boolean search(int key)
    {
        int h=hash(key);
        int i=h;
        while(arr[i]!=-1){
            if(arr[i]==key)
                return true;
            i=(i+1)%cap;
            if(i==h)
                return false;
        }
        return false;
    }
    boolean erase(int key)
    {
        int h=hash(key);
        int i=h;
        while(arr[i]!=-1){
            if(arr[i]==key){
                arr[i]=-2;     // '-2' represents a value has been deleted at that specific index
                return true;
            }
            i=(i+1)%cap;      //Moving to next index
            if(i==h)          //indicates array has traversed completely 
                return false;
        }
        return false;
    }
}

public class Main
{
	public static void main(String[] args) 
	{ 
	    MyHash mh = new MyHash(7);
	    mh.insert(49);
	    mh.insert(54);
	    mh.insert(63);
	    if(mh.search(63)==true)
	        System.out.println("Yes");
	    else
	        System.out.println("No");
	    mh.erase(63);
	    //should print no as 63 is erased 
	    if(mh.search(63)==true)
	        System.out.println("Yes");
	    else
	        System.out.println("No");
	} 
} 
