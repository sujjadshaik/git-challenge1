
public class Challenge1 {
	public static void main(String[] args) {
		int[][] forward = { { 1,2,3,4 }, { 3,4,5,6 }, { 6,9,0,2 }, { 5,7,3,5 }};
		//take user input instead
		int rows = forward.length;
		int cols = forward[0].length;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(revserEvenArray(forward)[i][j]);
				if (j < cols - 1)
					System.out.print(", ");
			}
			System.out.println();
		}

	}

	private static int[][] revserEvenArray(int[][] arr) {
		int rows = arr.length;
		int cols = arr[0].length;
		int[][] reverse = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = cols - 1; j >= 0; j--) {
				if (i % 2 ==0)
					reverse[i][cols - 1 - j] = arr[i][j];
				else
					reverse[i][j] = arr[i][j];

			}
		}
		return reverse;

	}
}
