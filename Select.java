public class Select {
    public static int menorElem(int[] arr, int k) {
        return quickSelect(arr, 0, arr.length - 1, k - 1);
    }

    private static int quickSelect(int[] arr, int low, int high, int k) {
        if (low == high)
            return arr[low];

        int pivIndex = high;
        pivIndex = particion(arr, low, high, pivIndex);

        if (pivIndex == k) {
            return arr[k];
        } else if (pivIndex > k) {
            return quickSelect(arr, low, pivIndex - 1, k);
        } else {
            return quickSelect(arr, pivIndex + 1, high, k);
        }
    }

    private static int particion(int[] arr, int low, int high, int piv) {
        int piValue = arr[piv];
        int pivIndex = low;

        for (int i = low; i < high; i++) {
            if (arr[i] < piValue) {
                swap(arr, i, pivIndex);
                pivIndex++;
            }
        }

        swap(arr, pivIndex, high);
        return pivIndex;
    }

    private static void swap(int[] arr, int i, int pivIndex) {
        int temp = arr[i];
        arr[i] = arr[pivIndex];
        arr[pivIndex] = temp;
    }
}