package ListSetMap;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void  main(String args[]){
        //数组的缺点：一旦创建长度是固定的，不能随便增减
        //List默认存放Object数据类型
        ArrayList aList = new ArrayList();//()没有数值，那就是默认长度为10，但是他也还是会自动扩容的，可以存放重复的元素
        //上面这句话也可以改成List aList = new ArrayList();但要导包import java.util.ArrayList;
                           //这说明List是父类型(声明类型)，ArrayList是子类型(实际类型)
        //ArrayList bList = new ArrayList(initialCapacity:100);
        //add()的参数是Object，所以可以是true , 1 , "a" , 3.14F
        aList.add(true); //下标为0
        aList.add("你好");//下标为1
        aList.add(123);//下标为2
        aList.add(3.14F);//下标为3
        aList.add(true);
        aList.add("你好");//ArrayList是有顺序，可以重复  LinkedList底层是链表
        aList.add(123);
        aList.add(3.14F);
        aList.add(true);
        aList.add("你好");
        aList.add(123);
        aList.add(3.14F);//下标为11

        //查询List集合
        Object o1 = aList.get(0);//通过get(int 下标index)取出元素
        System.out.println("o1="+o1);
        //遍历方法1
//        for (int i = 0; i <aList.size() ; i++) {//aList.size()取出List的长度
//            System.out.println(aList.get(i));
//        }
        //遍历方法2（高级for循环）
//        for ( Object temp : aList){//for(数据类型 变量名 ： 集合/数组),集合/数组里有X个元素，就自动循环X遍
//            System.out.println("temp="+temp);//这个temp就分别代表第X个元素
//        }
        //遍历方法3（lambda表达式，JDK1.8）lambda——希腊字母-入
        //集合.forEach(临时变量->{ 代码块 })，只能遍历集合
        aList.forEach(temp->{//lambda表达式能够自己判别数据类型，不用指定
            System.out.println(temp);
        });
    }
}
