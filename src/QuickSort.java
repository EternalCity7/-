public class QuickSort {
    public static void qSort(int[] numbers, int left, int right) {//小->大
        if (right > left) {
            int i = left, j = right;
            int base = numbers[left], basePosition = left;
            while (j>i){
                while (j > i && numbers[j] >= base) {
                    j--;
                }
                if(j>i){
                    numbers[basePosition]=numbers[j];
                    basePosition=j;
                }
                while (j > i && numbers[i] <= base) {
                    i++;
                }
                if(j>i){
                    numbers[basePosition]=numbers[i];
                    basePosition=i;
                }else {
                    numbers[basePosition]=base;
                }
            }
            qSort(numbers,left,basePosition-1);
            qSort(numbers,basePosition+1,right);
        }
    }
}
