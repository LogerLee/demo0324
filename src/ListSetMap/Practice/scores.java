package ListSetMap.Practice;

import sun.tracing.dtrace.DTraceProviderFactory;

import java.util.*;

public class scores {
    public static void main(String[] args) {
        System.out.println("请输入成绩：");
        //定义集合容器，用来存放数据
        List<Integer> scoresList = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);//System.in代表从键盘输入
        Float sum = 0F;
        //成绩录入
        for (int i = 0; i <5 ; i++) {
            Integer score = scanner.nextInt();//读取键盘输入的Integer值
            sum+=score;//累加器，sum = sum + score
            scoresList.add(score);
        }
        //找最高分，先排序，在集合里用Collections.sort(Lisr<E>);
        Collections.sort(scoresList);//Collections是工具类，不是接口Collection，工具类带——s
        int index = scoresList.size()-1;
        Integer maxScore = scoresList.get(index);//集合里的元素用自定义类型（Float，Integer等等）
        System.out.println("考试最高分："+maxScore);
        System.out.println("考试平均分："+sum/(index+1));

        //遍历排好序后的ArrayList
        System.out.println("成绩排序（从小到大）：");
        scoresList.forEach(temp->{
            System.out.print(temp+"\t");
        });
    }
}
