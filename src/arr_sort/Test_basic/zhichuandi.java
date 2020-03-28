package arr_sort.Test_basic;

public class zhichuandi {
    public static void change(int aa){
        aa = 1111;
        System.out.println("交换方法里a="+aa);
    }
    public static void main(String[] args){
        int a = 11;
        //zhichuandi zcd = new zhichuandi();
        //zcd.change(a);//作用于在main里直接写change(a)相同
        change(a);//把a=11传给了void change()，可以想象成这句话有自己单独的一个{}，在这个单独的{}里，你们自己玩去吧，但在main{}里a还是=11
        System.out.println("调用交换方法后a="+a);
    }
}
