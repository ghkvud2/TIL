import java.util.Arrays;

public class BasicSort {

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static int[] copy(int[] arr) {
		return Arrays.copyOf(arr, arr.length);
	}

	public static void bubble(int[] arr) {

		int[] temp = copy(arr);

		for (int i = temp.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++)
				if (temp[j] > temp[j + 1])
					swap(temp, j + 1, j);
		}
		System.out.println(Arrays.toString(temp));
	}

	public static void select(int[] arr) {

		int[] temp = copy(arr);

		for (int i = 0; i < temp.length - 1; i++) {
			int idx = i;
			for (int j = i + 1; j < temp.length; j++) {
				if (temp[idx] > temp[j])
					idx = j;
			}
			if (idx != i)
				swap(temp, i, idx);
		}
		System.out.println(Arrays.toString(temp));
	}

	public static void insert(int[] arr) {

		int[] temp = copy(arr);

		for (int i = 1; i < temp.length; i++) {

			int val = temp[i];
			int j = i - 1;

			for (; j >= 0; j--) {

				if (temp[j] > val)
					temp[j + 1] = temp[j];
				else
					break;
			}
			temp[j + 1] = val;
		}
		System.out.println(Arrays.toString(temp));

	}

	public static void main(String[] args) {
		int[] arr = { 5, 4, 3, 2, 1 };
		bubble(arr);
		select(arr);
		insert(arr);
	}
}
