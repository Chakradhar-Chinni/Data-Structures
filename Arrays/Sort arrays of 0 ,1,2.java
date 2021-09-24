import java.util.*;
class Sort
{
	public static void main(String[] args)
	{                                          
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i,c1=0,c2=0,c3=0;
		int[] arr = new int[n];
		for(i=0;i<n;i++){
			arr[i] = sc.nextInt();                                          
		}
		
		for(i=0;i<n;i++)  {
			if(arr[i]==0) {
				c1++; }
			if(arr[i]==1){
				c2++;	}
			if(arr[i]==2) {
				c3++;	} 
		}
		System.out.println(c1+"::"+c2+"::"+c3);

		for(i=0;i<(n-c3-c2);i++) {
			arr[i] = 0;	}

		for(i=c1;i<(n-c3);i++) {
			arr[i] = 1;	}

		for(i=(n-c3)+1;i<n;i++) {
			arr[i] = 2;	}

		System.out.println("Array Elements:");
		for(i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
