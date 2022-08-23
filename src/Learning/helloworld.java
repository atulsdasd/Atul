package Learning;

import java.util.Arrays;
import java.util.Scanner;

public class helloworld {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	 int[] arr = new int[] {4,3,2,1,5,6,7,43589453,-5};
	 Arrays.sort(arr);
	 
	 System.out.println(Arrays.toString(arr));
	 int maxi=Integer.MAX_VALUE;
	 for(int i=0;i<arr.length;i++)
		maxi=Math.min(maxi, arr[i]);
	 System.out.println("result= "+maxi);
	}

}
