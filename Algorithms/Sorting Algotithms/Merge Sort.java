import java.util.*;
class MergeSort
{
    public static void print(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void merge(int[] arr,int l,int m,int r)
    {
        int i,j,k;
        int n1 = m-l+1;
        int n2 = r-m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        
        for(i=0;i<n1;i++)
            L[i] = arr[l+i];
        for(i=0;i<n2;i++)
            R[i] = arr[m+1+i];
        i=0;j=0;k=l;
        while(i<n1 && j<n2)
        {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
        
    }
    public static void sort(int[] arr, int l,int r)
    {
        if(l<r)
        {
            int m = l+(r-l)/2;
            sort(arr,l,m);
            sort(arr,m+1,r);
            
            merge(arr,l,m,r);
        }
    }
    public static void main(String[] args)
    {
        MergeSort ob = new MergeSort();
        int[] arr = {12, 11, 13, 5, 6, 7};
        int n = arr.length;
        ob.sort(arr,0,n-1);
        ob.print(arr);
    }
}
