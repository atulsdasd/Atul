package Learning;

public class MaxinArray {
public static void main(String[] args) {
	 int[] arr = new int[] {4,3,2,1,5,6,7,43589453,-5};
	 int sum=Integer.MIN_VALUE;
	 for(int i=0;i<arr.length;i++)
		sum=Math.max(sum, arr[i])	;
		 System.out.println(sum);

}
}
