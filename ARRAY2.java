//Find the largest element in an array

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
		int max = arr[0];
		for(int i=0;i<sz;i++){
		    if(arr[i]>max){
		        max = arr[i];
		    }
		}
		System.out.print(max);
	}
}
