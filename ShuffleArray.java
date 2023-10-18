import java.util.Random;

public class ShuffleArray{
	public static void shuffleArray(int[] arr){
		int n = arr.length;
		Random r = new Random();
		for (int i = n - 1; i > 0; i--) {
			int j = r.nextInt(i + 1);
			int temp = arr[i];	
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	public static void main(String[] args){
		int[] arr = {1, 2, 3, 4, 5,6,7};
		shuffleArray(arr);
		for (int i: arr) {
			System.out.print( i+" ");
		}
	}
}
