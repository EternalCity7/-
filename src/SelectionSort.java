public class SelectionSort {
    public static void sSort(int[] numbers){//小->大
        for (int i = 0; i < numbers.length-1; i++) {
            int minNumber=numbers[i];
            int minPosition=i;
            for (int j = i+1; j < numbers.length; j++) {
                if(numbers[j]<minNumber){
                    minNumber=numbers[j];
                    minPosition=j;
                }
            }
            int temp=numbers[i];
            numbers[i]=minNumber;
            numbers[minPosition]=temp;
        }
    }
}
