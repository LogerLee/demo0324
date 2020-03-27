package arr_sort;

import java.lang.Math;

public class TestBG {

    public static int compare_income(int[] B_income,int[] G_income){
        for (int i = 0; i <B_income.length ; i++) {
            for (int j = 0; j <G_income.length ; j++) {
                if (B_income[i]>=G_income[j]*1.5){
                    int Bid = i+1;int Gid = j+1;
                    System.out.println("男："+Bid+"&"+"女："+Gid);
                }
            }
        }
        return 1;
    }

    public static int compare_years(int[] B_years,int[] G_years){
        for (int i = 0; i <B_years.length ; i++) {
            for (int j = 0; j <G_years.length ; j++) {
                int years_D_value = Math.abs(B_years[i]-G_years[j]);
                if (years_D_value<=3){
                    int Bid = i+1;int Gid = j+1;
                  System.out.println("男生："+Bid+"&"+"女生："+Gid);
                }
            }
        }
        return 1;
    }
    public static void main(String args[]){
         int[] Boys_years = {30,26,45,46,22};
         int[] Girls_years = {19,18,27,17,29};
        int[] Boys_income = {5000,6000,4000,6500,10000};
        int[] Girls_income = {4500,4200,6000,6800,9000};
        compare_years(Boys_years,Girls_years);
        compare_income(Boys_income,Girls_income);
    }
}
