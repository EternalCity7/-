public class InsertSort {
    public static void iSort(int[] numbers) {//小->大
        for (int i = 1; i < numbers.length; i++) {//i左边是已经排好序的地方,i点是即将排好序的点
            int index=i-1;
            while(index>=0&&numbers[i]<numbers[index]){
                index--;
            }
            index++;
            int temp=numbers[i];
            for (int j = i; j > index; j--) {
                numbers[j]=numbers[j-1];
            }
            numbers[index]=temp;
        }
    }
}