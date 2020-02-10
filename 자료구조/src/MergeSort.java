import java.util.Arrays;

public class MergeSort {

	public static void merge(int[] arr, int left, int right) {

		if (left >= right)
			return;

		int mid = (left + right) / 2;
		merge(arr, left, mid);
		merge(arr, mid + 1, right);
		merge(arr, left, mid, right);
	}

	public static void merge(int[] arr, int left, int mid, int right) {

		int fIdx = left;
		int rIdx = mid + 1;
		int idx = left;

		int[] temp = new int[right + 1];
		while (fIdx <= mid && rIdx <= right) {
			if (arr[fIdx] < arr[rIdx])
				temp[idx++] = arr[fIdx++];
			else
				temp[idx++] = arr[rIdx++];
		}

		if (fIdx > mid)
			for (int i = rIdx; i <= right; i++)
				temp[idx++] = arr[i];

		if (rIdx > right)
			for (int i = fIdx; i <= mid; i++)
				temp[idx++] = arr[i];

		for (int i = left; i <= right; i++)
			arr[i] = temp[i];
	}

	public static void main(String[] args) {
		int[] arr = { -1, 2, 3, 1, 2, 3, 4, 5, 5, 7, 8, 9, 1, 2, -1, 2, 3, -3, -5 };
		merge(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
}
