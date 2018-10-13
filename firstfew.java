package ASS4;
import java.util.*;
public class firstfew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int M=s.nextInt();
		int arr1[]=new int[N];
		int arr2[]=new int[M];
		for(int i=0;i<N;i++)
		{
			arr1[i]=s.nextInt();
		}
		for(int i=0;i<M;i++)
		{
			arr2[i]=s.nextInt();
		}
		//System.out.println(intersection(arr1,arr2));
		
		//int ans[]=sum(arr1,arr2);
		//int ans[]=remove(arr,4);
		/*for(int i=0;i<N-1;i++)
		{
			System.out.print(ans[i]+" ");
		}*/
		//Arrays.sort(arr);
		//System.out.println(arr[N-1]);
		//System.out.println(findshit(arr,M,0,N-1));
		
	}
	public static int findshit(int[] arr,int M,int left,int right)
	{
		if(left<=right) {
			
		
		int mid=(left+right)/2;
		if(M>arr[mid])
		{
			findshit(arr,M,mid+1,right);
		}
		if(M<arr[mid])
		{
			findshit(arr,M,left,mid);
		}
		if(M==arr[mid])
		{
			return mid;
		}
		}
		return -1;
	}
	public static int[] reverse(int[] arr)
	{
		int arr1[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			arr1[i]=arr[arr.length-1-i];
		}
		return arr1;
	}
	public static int[] inverse(int[]arr)
	{
		int newarray[]=reverse(arr);
		int inverted[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			inverted[newarray[i]-1]=i+1;
	
		}
		return reverse(inverted);
	}
	public static int[] remove(int[] arr,int val)
	{
		int newarr[]=new int[arr.length-1];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==val)
			{
				for(int j=0;j<i;j++)
				{
					newarr[j]=arr[j];
				}
				if(i!=arr.length-1)
				{
					
					for(int j=i+1;j<arr.length;j++)
					{
						newarr[j-1]=arr[j];
					}
				}
				break;
				
			}
		}
		return newarr;
	}
	public static ArrayList<Integer> intersection(int[] arr1,int[] arr2)
	{
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<arr1.length;i++)

		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					arr2=remove(arr2,arr2[j]);
					list.add(arr1[i]);
					break;
				}
			}
		}
		return list;
	}
	
}
