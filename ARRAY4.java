//Count frequency of each element in the array
// Bruteforce aooroach Time Complexity:-  O(N²)

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sz = sc.nextInt();
		int arr[] = new int[sz];
		for(int i=0;i<sz;i++){
		    arr[i] = sc.nextInt();
		}
		boolean visited[] = new boolean[sz];
		
		for(int i=0;i<sz;i++){
		    if(visited[i]==false){
    		    int count = 1;
    		    for(int j=i+1;j<sz;j++){
    		        if(arr[j]==arr[i]){
    		            count++;
    		            visited[j] = true;
    		        }
    		    }
    		    System.out.println(arr[i]+" : "+count);
		    } else {
		        continue;
		    }
		}
	}
}
