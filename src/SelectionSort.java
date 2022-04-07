public class SelectionSort {
    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int currentMinIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[currentMinIndex]) {
                    currentMinIndex = j;
                }
            }
            System.out.println("Swap " + list[i] + " with " + list[currentMinIndex]);
            int temp = list[currentMinIndex];
            list[currentMinIndex] = list[i];
            list[i] = temp;
        }
    }
}
