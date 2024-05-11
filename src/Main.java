public class Main {
    public static void main(String[] args) {
        int[] numbers = {64, 34, 25, 12, 22, 11, 90,75};

        System.out.println("排序前的数组：");
        printArray(numbers);

        //BubbleSort.bSort(numbers);
        SelectionSort.sSort(numbers);
        //InsertSort.iSort(numbers);

        System.out.println("排序后的数组：");
        printArray(numbers);
    }

    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
