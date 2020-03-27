package arr_sort;

public class arr_about {//包含main方法的类必须是public的
    /*
     * main()方法是Java应用程序的入口方法
     * 程序在运行的时候，第一个执行的方法就是main()方法
     * 方法的名字必须是main，方法必须是public static void 类型
     * 方法必须接收一个字符串数组的参数
     * */
    public static void main(String[] args){

        int[] a = {12,16,125,56,2};
        float[] f = {1.2f,2.5f,5.6f};
        char[] c = {'r','u','n','n','i','n','g','m','a','n'};//char是字符类型， String是字符串类型。
        String[] str = {"I","love","runningman"};
        fun1(str);//输出String数组的长度
        //fun2(a);//遍历（迭代）输出int数组
        fun3(a);//输出int数组的最大值
        fun4(a);//选择法对int数组a排序（从大到小）
        fun5(a);
        fun6(a);
    }

    private static String fun6(int[] arr) {
        String str="[";
        String str1="]";
        for(int x=0;x<arr.length;x++) {
            if(x==arr.length-1) {
                str+=arr[x]+str1;//str = str + arr[x]+str1
            }else {
                str+=arr[x]+",";//str = str + arr[x]+",",str每一次都在变
            }
        }
        System.out.println("\r\n"+str);
        return str;
    }

    //冒泡法对int数组a排序（从小到大）
    private static void fun5(int[] arr) {//先把最小的调到最后
        int temp = 0;
        String str = "\r\n从大到小排序后的int数组(冒泡法):";
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if (arr[i]>arr[j+1]){
                    temp = arr[j];   //一个等号是赋值
                    arr[j] = arr[j+1];//交换：首位相连
                    arr[j+1] = temp;
                }
            }
        }
        fun2(arr,str);//遍历（迭代）输出int数组
    }

    //选择法对int数组a排序（从大到小）
    private static void fun4(int[] arr) {
        int temp = 0;
        String str = "从大到小排序后的int数组(选择法):";
        for (int i = 0; i <arr.length-1 ; i++) {//先将a0和剩余的数比较，这其中最大的的调到第一位，再将a1和向后剩下的比较，这其中最大的的调到第二位
            for(int j = i+1;j<arr.length;j++){//arr.length=5
                if (arr[i]<arr[j]){
                    temp = arr[j];   //一个等号是赋值
                    arr[j] = arr[i];//交换：首位相连
                    arr[i] = temp;
                }
            }
        }
        fun2(arr,str);//遍历（迭代）输出int数组
    }


    //输出int数组的最大值
    private static int fun3(int[] arr) {
        int max = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (max<arr[i]){//先固定第一个数为最大值，在与剩余的数作一轮比较
                max = arr[i];
            }
        }
        System.out.println("int数组a最大值="+max);
        return max;
    }

    //遍历（迭代）int数组
    private static void fun2(int[] arr,String string) {//被static修饰的成员变量和成员方法独立于该类的任何对象。
        System.out.println(string);                     // 也就是说，它不依赖类特定的实例，被类的所有实例共享
        for (int i = 0; i <arr.length ; i++) {
            System.out.print("a["+i+"]="+arr[i]+" ");
        }
    }

    //输出String数组的长度
    private static void fun1(String[] arr) {
        System.out.println("String数组的长度=" + arr.length);
    }
    }