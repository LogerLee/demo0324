package ListSetMap;

import java.util.LinkedList;
import java.util.List;

public class ListDemo3 {
    public static void main(String[] args) {
        List<String> aList = new LinkedList<String>();
        aList.add("123");
        aList.add("456");
        aList.add("789");
        aList.add("123456");

        //集合里面也可以装集合
        List<String> bList = new LinkedList<String>();//最开始是空的集合
        bList.addAll(aList);
        bList.forEach(temp->{
            System.out.println(temp);
        });
    }
}
