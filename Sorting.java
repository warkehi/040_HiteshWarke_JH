import java.util.*;
class Sorting{
	static void insertionSort(int n,int[]a1){
		for(int i=1;i<n;++i){
			int key = a1[i];
			int j = i-1;
			while(j>=0 && a1[i]>key){
				a1[j+1] = a1[j];
				j = j-1;
				PrintArray(a1);
			}
				
			a1[j+1] = key;
			
			}	
	}
static void PrintArray(int[]arr)
{
	int size = arr.length;
	for(int i=0;i<size;++i){
		System.out.println(arr[i]+" ");
	}
	System.out.println();
	
}
public static void main(String args[]){
	int arr[] ={1,2,4,5,3};
	/*Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int arr[] = new int[n];
	for(int i=0;i<n;i++){
		arr[i] = sc.nextInt();
		
	}*/
	insertionSort(5,arr);
	PrintArray(arr);
	
}
}