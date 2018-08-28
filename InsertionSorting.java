import java.util.*;
import java.lang.*;
public class InsertionSorting {
public static void main(String arg[]){
	Random r=new Random();
	Scanner in=new Scanner(System.in);
	System.out.println("Enter size of Array : ");
	int n=in.nextInt();
	int ar[]=new int[n];
	System.out.println("Unsorted Array : ");
	for(int i=0;i<n;i++){
		ar[i]=r.nextInt(n)+1;
		//System.out.println(ar[i]+" ");
	}
	//Implementing insertion sort
	long startTime = System.nanoTime();
	for(int i=1;i<n;i++){
		int j=i-1,k=ar[i];
		while(j>=0 && ar[j]>k){
			ar[j+1]=ar[j];
			--j;
		}
		ar[j+1]=k;
	}
	long endTime   = System.nanoTime();
    		long totalTime = (endTime - startTime)/1000	;
			
	System.out.println("\nSorted Array : ");
	for(int i=0;i<n;i++){
	//System.out.print(ar[i]+" ");
	}
	System.out.println("Total Execution Time: "+totalTime);
}
}
