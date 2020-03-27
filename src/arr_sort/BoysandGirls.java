package arr_sort;

class Boys1{
    int[] Boys_years;
    int[] Boys_income;
    String[] Boys_edu;
    //int[] New_Boys_edu;
    Boys1(int[] B_years,int[] B_income,String[] B_edu){   //构造函数，接受main()传递过来的形参值
        Boys_years = B_years;
        Boys_income = B_income;
        Boys_edu = B_edu;
    }
    int[] post_Boys_years(){
        return Boys_years;
    }
    int[] post_Boys_income(){
        return Boys_income;
    }
    String[] post_Boys_edu(){
        return Boys_edu;
    }
}
class Girls1{
    int[] Girls_years;
    int[] Girls_income;
    String[] Girls_edu;
    //int[] New_Girls_edu;
    Girls1(int[] G_years,int[] G_income,String[] G_edu){
        Girls_years = G_years;
        Girls_income = G_income;
        Girls_edu = G_edu;
    }
    int[] post_Girls_years(){
        return Girls_years;
    }
    int[] post_Girls_income(){
        return Girls_income;
    }
    String[] post_Girls_edu(){
        return Girls_edu;
    }
}
public class BoysandGirls {
    Boys1 boys1;Girls1 girls1;
    void setBoys1(int[] By,int[] Bi,String[] Be){
        boys1 = new Boys1(By,Bi,Be);
    }
    void setGirls1(int[] Gy,int[] Gi,String[] Ge){
        girls1 = new Girls1(Gy,Gi,Ge);
    }
    void GetandCompare(){
        int[] b_y = boys1.post_Boys_years();int[] b_i = boys1.post_Boys_income();
        String[] b_e = boys1.post_Boys_edu();int[] b_e2 = {0,0,0,0,0};
        int[] g_y = girls1.post_Girls_years();int[] g_i = girls1.post_Girls_income();
        String[] g_e = girls1.post_Girls_edu();int[] g_e2 = {0,0,0,0,0};
        for (int i = 0; i <b_e.length ; i++) {
            //System.out.println("男生"+i+"的学历为："+g_e[i]);
            if (b_e[i] == "专科"){
                b_e2[i] = 1;
            }else {
                if (b_e[i] == "本科"){
                    b_e2[i] = 2;
                }else{
                    if (b_e[i] == "研究生"){
                        b_e2[i] = 3;
                    }
                }
            }
        }
        for (int i = 0; i <g_e.length ; i++) {
            //System.out.println("女生"+i+"的学历为："+g_e[i]);
            if (g_e[i] == "专科"){
                g_e2[i] = 1;
            }else {
                if (g_e[i] == "本科"){
                    g_e2[i] = 2;
                }else{
                    if (g_e[i] == "研究生"){
                        g_e2[i] = 3;
                    }
                }
            }
        }

        for (int i = 0; i <b_y.length ; i++) {//最终配对的判断
            for (int j = 0; j <g_y.length ; j++) {
                int years_D_value = Math.abs(b_y[i]-g_y[j]);
                if (b_i[i]>=g_i[j]*1.5&&years_D_value<=3&&b_e2[i]>g_e2[i]){
                    int Bid = i+1;int Gid = j+1;
                    System.out.println("男生："+Bid+"&"+"女生："+Gid);
                }
            }
        }
        //System.out.println(b_y.length);
    }
   // int[] b_y = boys1.post_Boys_years();int[] b_i = boys1.post_Boys_income();
   // int[] g_y = girls1.post_Girls_years();int[] g_i = girls1.post_Girls_income();

    public static void main(String[] args){
        int[] Boys_years = {30,26,45,46,22};
        int[] Girls_years = {19,18,27,17,29};
        int[] Boys_income = {5000,6000,4000,6500,10000};
        int[] Girls_income = {4500,4200,6000,4500,9000};
        //int[] Boys_edu = {0,1,0,1,2};
        //int[] Girls_edu = {1,0,1,1,1};
        String[] Boys_edu = {"本科","研究生","本科","专科","研究生"};
        String[] Girls_edu = {"研究生","本科","专科","研究生","本科"};
        BoysandGirls boysandgirls = new BoysandGirls();
        boysandgirls.setBoys1(Boys_years,Boys_income,Boys_edu);
        boysandgirls.setGirls1(Girls_years,Girls_income,Girls_edu);
        boysandgirls.GetandCompare();//得到class Boys里面return的Boys_years数组
    }
}