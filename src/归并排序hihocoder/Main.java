package πÈ≤¢≈≈–Úhihocoder;
 

import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static long cnt = 0;
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		int n = in.nextInt();
		in.nextLine();
		int a[] = new int[n];
		for(int i = 0; i < n; i++)
		{
			a[i] = in.nextInt();
		}
		sort(a, 0, a.length-1);
//		System.out.println(Arrays.toString(a));
		System.out.println(cnt);
	}
	
	static int[] sort(int nums[], int low, int high)
	{
		int mid = (low + high)/2;
		if(low < high)
		{
			sort(nums, low, mid);
			sort(nums, mid+1, high);
			merge(nums, low, mid, high);
		}
		return nums;
	}
	
	static void merge(int nums[], int low, int mid, int high)
	{
		int i = low;
		int j = mid + 1;
		int k = 0;
		int temp[] = new int[high - low + 1];
		
		while(i <= mid && j <= high)
		{
			if(nums[i] <= nums[j])
			{
				temp[k++] = nums[i++];
			}
			else
			{
				temp[k++] = nums[j++];
				cnt += (mid - i + 1);
			}
			
		}
		while(i <= mid)
		{
			temp[k++] = nums[i++];
		}
		
		while(j <= high)
		{
			temp[k++] = nums[j++];
		}
		
		for(i = 0; i < k; i++)
		{
			nums[low + i] = temp[i];
		}
		
	}
	
}


/*

5
2 4 5 3 1


2 4


*/
       