package ListSetMap;

import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {
        Set<String> aSet = new HashSet<String>();//Set不可重复，无序，适合场景：身份证号码系统，手机号码系统，微信号系统
        aSet.add("123456");                                        //不适合场景：学生姓名
        aSet.add("123450");
        aSet.add("123450");//Set会自动去掉重复的
        aSet.add("aa");
        aSet.add("123");
        aSet.add("a");

        //Set的删除，只有根据内容删除（Object）,这是因为HashSet底层是哈希码(一种编码)，只要底层不是数组，都不会有下标
        aSet.remove("123450");//Set集合里不存在重复，返回一个boolean类型
        //Set集合没有修改，因为没有下标，只能先删除，再添加
        aSet.remove("aa");aSet.add("ab");
        //判空
        if (!aSet.isEmpty()){//如果为空，return true;
            System.out.println("Set集合aSet不为空");
        }
        //判断一个集合(List,Set)中是否包含指定元素，如果包含，此方法返回true，否则返回false。
        boolean abc = aSet.contains("abc");
        System.out.println("abc是否存在呢？"+abc);
        //遍历的语法与List相同，Set集合没法取单个元素（因为没有下标），只能取出所有
        aSet.forEach(temp->{
            System.out.println(temp);
        });
    }
}
