// Count frequency of each element in the array using HashMap
/*
    If order doesn't matter
    You can use HashMap instead of LinkedHashMap
    LinkedHashMap → maintains insertion order (extra cost) 
    HashMap → slightly faster

*/
/* extra cost means
It uses a doubly linked list for insertion
1. 🔸 Extra Memory
    Each element stores:
    Key
    Value
    Hash info
    👉 + 2 extra pointers (prev & next) for linked list
    
    So memory usage is higher than HashMap

2. 🔸 Extra Work During Operations
    
    In LinkedHashMap, it must:

    Insert into hash table
    Update linked list connections (prev/next)
    
    👉 That means more internal steps
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sz = sc.nextInt();
		int arr[] = new int[sz];
		for(int i=0;i<sz;i++){
		    arr[i] = sc.nextInt();
		}
		LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
		for(int i=0;i<sz;i++){
		    map.put(arr[i],map.getOrDefault(arr[i],0)+1);
		}
		//System.out.print(map);
		for(int key:map.keySet()){
		    System.out.println(key+" : "+map.get(key));
		}
	}
}
