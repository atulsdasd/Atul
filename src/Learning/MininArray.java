package Learning;

public class MininArray {
public static void main(String[] args) {
	int[] arr = new int[] {4,3,2,1,5,6,7,43589453,-5};
	 int sum=Integer.MAX_VALUE;
	 for(int i=0;i<arr.length;i++)
		sum=Math.min(sum, arr[i])	;
		 System.out.println("result = "+sum);
}
}
