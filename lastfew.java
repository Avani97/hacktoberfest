package ASS4;
import java.util.*;
public class lastfew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int M=s.nextInt();
		int[][] arr= {{11,12,13,14},{21,22,23,24},{31,32,33,34},{41,42,43,44}};
		//waveprint(arr);
		colwave(arr);
		/*int arr1[]=new int[N];
		int arr2[]=new int[M];
		for(int i=0;i<N;i++)
		{
			arr1[i]=s.nextInt();
		}
		for(int i=0;i<M;i++)
		{
			arr2[i]=s.nextInt();
		}*/
		//sumofarrays(arr1,arr2);
		/*for(int i=0;i<(sumofarrays(arr1,arr2)).length;i++)
		{
			System.out.print(sumofarrays(arr1,arr2)[i]+" ");
		}*/
		
		

	}
	public static int[] sumofarrays(int[] arr1,int[] arr2)
	{
		int sum[]=new int[arr1.length];
		int arr22[]=new int[arr1.length];
		for(int i=arr1.length-arr2.length,j=0;i<arr1.length;i++,j++)
		{
			arr22[i]=arr2[j];
		}
		int carry=0;
		for(int i=arr1.length-1;i>=0;i--)
		{
			sum[i]=(carry+arr1[i]+arr22[i])%10;
			carry=(carry+arr1[i]+arr22[i])/10;
		}
		if(carry==1)
		{
			int newsum[]=new int[arr1.length+1];
			for(int i=sum.length-1;i>=0;i--)
			{
				newsum[i+1]=sum[i];
			}
			newsum[0]=carry;
			return newsum;
			/*for(int i=0;i<newsum.length;i++)
			{
				System.out.println(newsum[i]);
			}*/
		}
		
		
		//sum[0]=(carry+arr1[0]+arr22[0]);
		return sum;
	}
	public static void waveprint(int[][] arr){
		
		for(int i=0;i<arr.length;i++){
			if(i%2==0){
				for(int j=0;j<arr[i].length;j++){
					System.out.print(arr[i][j]+", ");
				}
			}else{
				for(int j=arr[i].length-1;j>=0;j--){
					System.out.print(arr[i][j]+", ");
				}
			}
			
		}
		System.out.println("END");
	}
	public static void colwave(int[][] arr)
	{
		int i=0,j=0;
		while(j<4)
		{
			if(j%2==0)
			{
				for( i=0;i<arr.length;i++)
				{
					System.out.print(arr[i][j]+",");
					
				}
			}
			else
			{
				for(i=arr.length-1;i>=0;i--)
				{
					System.out.print(arr[i][j]+",");
				}
			}
			j++;
		}
		
	}
	
	
}
