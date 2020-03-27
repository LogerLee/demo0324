package arr_sort;

class Data3 {
    int[] ints;
    float[] floats;
    String[] strings;

    Data3(int[] ints, float[] floats, String[] strings) {
        this.ints = ints;
        this.floats = floats;
        this.strings = strings;
    }
    //遍历方法
    public static void iterate(int[] arr, String str) {
        System.out.println(str);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("a[" + i + "]=" + arr[i] + " ");
        }
    }
    //输出int数组的最大值
    public static int coutmax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (max<arr[i]){//先固定第一个数为最大值，在与剩余的数作一轮比较
                max = arr[i];
            }
        }
        System.out.println("\r\nint数组a最大值="+max);
        return max;
    }
    //选择法对int数组a排序（从大到小）
    public static void sort1(int[] arr) {
        int temp = 0;
        String str = "\r\n从大到小排序后的int数组(选择法):";
        for (int i = 0; i < arr.length - 1; i++) {//先将a0和剩余的数比较，这其中最大的的调到第一位，再将a1和向后剩下的比较，这其中最大的的调到第二位
            for (int j = i + 1; j < arr.length; j++) {//arr.length=5
                if (arr[i] < arr[j]) {
                    temp = arr[j];   //一个等号是赋值
                    arr[j] = arr[i];//交换：首位相连
                    arr[i] = temp;
                }
            }
        }
        iterate(arr, str);
    }

    //冒泡法对int数组a排序（从小到大）
    public static void sort2(int[] arr) {//先把最小的调到最后
        int temp = 0;
        String str = "\r\n从小到大排序后的int数组(冒泡法):";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[i]>arr[j+1]){
                    temp = arr[j];   //一个等号是赋值
                    arr[j] = arr[j+1];//交换：首位相连
                    arr[j+1] = temp;
                }
            }
        }
        iterate(arr, str);//遍历（迭代）输出int数组
    }
    //输出String数组的长度
    public static void str_length(String[] arr) {
        System.out.println("String数组的长度=" + arr.length);
    }
    public static String cout(int[] arr) {
        String str="[";
        String str1="]";
        for(int x=0;x<arr.length;x++) {
            if(x==arr.length-1) {
                str+=arr[x]+str1;//str = str + arr[x]+str1
            }else {
                str+=arr[x]+",";//str = str + arr[x]+",",str每一次都在变
            }
        }
        System.out.println(str);
        return str;
    }
}
public class arr_about4 {
    public static void main(String[] args){
        int[] a = {12,16,125,56,2};
        float[] f = {1.2f,2.5f,5.6f};
        String str1 = "遍历int数组：";
        String[] s = {"I","love","runningman"};
        Data data = new Data(a,f,s);//实例化
        Data.iterate(a,str1);
        Data.sort1(a);
        Data.sort2(a);
        Data.coutmax(a);
        Data.str_length(s);
        Data.cout(a);
    }
}
