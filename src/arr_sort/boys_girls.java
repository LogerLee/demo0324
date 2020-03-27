package arr_sort;

class Boys{
    int test;

    Boys(int a){
        test = a;//把传过来的a赋值给test
    }
    void showBoys(){
        System.out.println("测试="+test);
    }
}

public class boys_girls{
    Boys boys;
    void setBoys(int aa){
        boys = new Boys(aa);
    }
    void showB_G(){
        boys.showBoys();
    }
    public static void main(String[] args){
        boys_girls boys_girls = new boys_girls();
        boys_girls.setBoys(2);
        boys_girls.showB_G();
    }
}