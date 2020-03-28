package arr_sort.Test_basic;

public class yinyongchuandi {//包括数组和对象都是引用传递的
//关于数组的引用传值
    public static void yinyong_shuzu(int[] yy){
        int temp;
        temp = yy[0];yy[0] = yy[1];yy[1] = temp;//将yy[0]和yy[1]交换
    }
//关于对象的引用传值
public static class yinyongchuandi_duixiang {
    public String QQ = "Have I Found You ?";
}
    public static void yinyong_duixiang_change(yinyongchuandi_duixiang yy_dx) {
        yy_dx.QQ = "No,I haven't";
    }

    public static void main(String[] args){
        int[] yyy = {2,3};
        yinyong_shuzu(yyy);//方法调用时，传递的参数是按引用进行传递，其实传递的引用的地址，也就是变量所对应的内存空间的地址。
                            //数组的名称也是数组的首地址，传递前和传递后都指向同一个引用（也就是同一个内存空间），引用类型的传递后的修改会影响原来的值。
        System.out.println("值传递"+"第一个数："+yyy[0]+"第二个数："+yyy[1]);
        yinyongchuandi_duixiang yyy_dx = new yinyongchuandi_duixiang();//创建class yinyongchuandi_duixiang的对象
        yinyong_duixiang_change(yyy_dx);//把class yinyongchuandi_duixiang的对象作为形参传给change方法，因为是直接修改对应地址里的东西所以值就改变了
        System.out.println("引用传递后的值"+yyy_dx.QQ);
    }
}
