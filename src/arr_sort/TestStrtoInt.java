package arr_sort;

class Girls{
    String[] Girls_edu;
    Girls(String[] G_edu){
        Girls_edu = G_edu;
    }
    String[] post_Girls_edu(){
        return Girls_edu;
    }
}
public class TestStrtoInt {
    Girls girls;
    void setGirls(String[] Ge){
        girls = new Girls(Ge);
    }
    void get_cout_Girls(){
        String[] g_e = girls.post_Girls_edu();
        int[] g_e2={0,0,0,0,0};
        for (int i = 0; i <g_e.length ; i++) {
            //System.out.println("女生"+i+"的学历为："+g_e[i]);
            if (g_e[i] == "专科"){
                g_e2[i] = 1;
                System.out.println(g_e2[i]);
            }else {
                if (g_e[i] == "本科"){
                    g_e2[i] = 2;
                    System.out.println(g_e2[i]);
                }else{
                    if (g_e[i] == "研究生"){
                        g_e2[i] = 3;
                        System.out.println(g_e2[i]);
                    }
                }
            }
        }
        for (int i = 0; i <g_e2.length ; i++) {
            System.out.println(g_e2[i]);
        }
    }

    public static void main(String[] args){
        String[] Girls_edu = {"研究生","本科","专科","研究生","本科"};
        TestStrtoInt testStrtoInt = new TestStrtoInt();
        testStrtoInt.setGirls(Girls_edu);
        testStrtoInt.get_cout_Girls();
    }
}
