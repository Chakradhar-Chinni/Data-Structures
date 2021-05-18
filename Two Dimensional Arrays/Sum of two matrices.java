                              //addition of two matrices
import java.io.*;
import java.util.*;
public class Matrix_Question
{
		public static void main(String[] args)
		{
			int r,c,i,j,sum;
			Scanner sc = new Scanner(System.in);
			r = sc.nextInt();
			c = sc.nextInt();
			int[][] mat1 = new int[r][c];
			int[][] mat2 = new int[r][c];
			for(i=0;i<r;i++)     //Scanning mat1
			{
				for(j=0;j<c;j++)
				{
					mat1[i][j] = sc.nextInt();
				}
			}
			
			for(i=0;i<r;i++) 	//Scanning mat2
			{
				for(j=0;j<c;j++)
				{
					mat2[i][j] = sc.nextInt();
				}
			}
			for(i=0;i<r;i++)
			{
				sum=0;
				for(j=0;j<c;j++)
				{
					sum = mat1[i][j]+mat2[i][j];
					System.out.print(sum);
				}
				System.out.print("\n");
			}
		}
}
