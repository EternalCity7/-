public class Main {
    public static void main(String[] args) {
        //int[] numbers = {64, 34, 25, 12, 22, 11, 90,75};
        //int[] numbers ={5,4,3,6,3,7,3,9,7};
        int[] numbers={1,9,4,3,5};
        System.out.println("排序前的数组：");
        printArray(numbers);

        //BubbleSort.bSort(numbers);
        //SelectionSort.sSort(numbers);
        //InsertSort.iSort(numbers);
        QuickSort.qSort(numbers,0,numbers.length-1);
        System.out.println("排序后的数组：");
//        printArray(CountSort.cSort(numbers));//计数排序
        printArray(numbers);
    }

    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
