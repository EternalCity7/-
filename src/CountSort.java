public class CountSort {
    public static int[] cSort(int[] numbers) {//小->大
        int min=numbers[0],max=numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(min>numbers[i]){
                min=numbers[i];
            }
            if(max<numbers[i]){
                max=numbers[i];
            }
        }
        int count=max-min+1;
        int[] countNums=new int[count];
        for (int i = 0; i < numbers.length; i++) {
            countNums[numbers[i]-min]++;//countNums[i]-min表示新进来的值在count数组中的位置
        }
        int addUp=0;//addUp代表所有前面（包括这一格）的数量总和
        for (int i = 0; i < countNums.length; i++) {
            addUp+=countNums[i];
            countNums[i]=addUp;
        }
        int[] newNums=new int[numbers.length];
        for (int i = numbers.length-1; i >=0 ; i--) {
            newNums[countNums[numbers[i]-min]-1]=numbers[i];//这里标准算法写的需要-1，但是我感觉不用
            countNums[numbers[i]-min]--;
        }
        return newNums;
    }
}
