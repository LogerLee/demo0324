package ListSetMap;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo1 {
    //TreeSet底层是二叉树，有序（只对于实现了Comparable接口或者Comparator接口的类型是有序的）、不可重复

    public static void main(String[] args) {
        Set<Integer> aSet = new TreeSet<Integer>();//在Integer的源码里：public final class Integer extends Number implements Comparable<Integer>
                                                   //实现了Comparable接口，所以它能够排序，同样String(仅限英文)也可以
        aSet.add(20);
        aSet.add(-2);
        aSet.add(2);
        aSet.add(0);
        //删除只能按Object内容删除
        aSet.remove(2);
        System.out.println("在TreeSet下进行排序:");
        //TreeSet的修改同HashSet，只能先删除再添加
        aSet.forEach(temp->{
            System.out.print(temp+"\t");
        });
    }
}
