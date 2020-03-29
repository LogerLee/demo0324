package ListSetMap;

import java.util.ArrayList;
import java.util.List;

//泛型：给集合指定具体存放的数据类型，只能存放自定义数据类型(Integer,Character...)
public class Listfanxing {
    public static void main(String[] args) {//psvm
        //集合里面只能存放自定义数据类型(Integer,Character)，不能存放基本(int，char)数据类型
        List<String> aList = new ArrayList<String>();//aList集合只能存放String类型元素，<>为泛型
        aList.add("LLL");
        aList.add("III");//下标：1
        aList.add("SSS");
        aList.add("SSS");
        aList.add("SSS");
        aList.add("TTT");
        //删除某一个remove，删除全部clean
        aList.remove(1);//根据index删除
        aList.remove("SSS");//Object根据内容删除（已经指定泛型）,有重复时只删除一个
        //aList.clear();//清空集合中的所有元素
        //修改set
        aList.set(0,"UUU");
        //遍历forEach
        aList.forEach(temp->{
            System.out.println(temp);//sout
        });
        //List<String>集合转成object数组,LinkedList也有这个方法
        Object[] objects = aList.toArray();
        for (Object temp : objects){//temp是Object数据类型
            System.out.println(temp+"");//temp加上一个""，那么temp(其它数据类型)就成了String类型
        }
        //强转的话语法没错，但编译报错Exception in thread "main" java.lang.ClassCastException: [Ljava.lang.Object; cannot be cast to [Ljava.lang.String;
        //	at ListSetMap.Listfanxing.main(Listfanxing.java:30)
        //String[] objects = (String[]) aList.toArray();
//        List<Integer> bList = new ArrayList<Integer>();//源码里带<>的，都可以用泛型
//        bList.add(123);
    }
}
