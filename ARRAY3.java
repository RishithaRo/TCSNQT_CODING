//Reversing an array in-place

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
		int start = 0;
		int end = sz-1;
		while(start<end){
		    int temp = arr[start];
		    arr[start] = arr[end];
		    arr[end] = temp;
		    start++;
		    end--;
		}
		
		for(int i=0;i<sz;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}
