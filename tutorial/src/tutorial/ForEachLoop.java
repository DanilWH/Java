package tutorial;

public class ForEachLoop {

	public static void main(String[] args) {
		int[] arr = {3, 5, 2, 5, 7, 3};
		
		int count = 0;
		for (int element:arr) {
			System.out.println(element + ": " + count);
			count++;
		}

	}

}
