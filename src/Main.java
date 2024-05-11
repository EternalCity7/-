public class Main {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("排序前的数组：");
        printArray(arr);

        //BubbleSort.bSort(arr);
        SelectionSort.sSort(arr);

        System.out.println("排序后的数组：");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
