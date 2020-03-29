package arr_sort.Test_basic.thisandsuper;

class Student{
    String name;int id;
    Student(String n,int id){
        name = n;
        this.id = id;
    }
}
class UniversityStudent extends Student{
    String school;
    UniversityStudent(String name,int id,String school){
        //super用于两种情况：1.获取父类的变量数据和调用弗雷中的方法
        //                  2.直接调用父类的构造方法
        super(name,id);//这句话的意思是：直接调用父类的构造方法
        this.school = school;
    }
}
public class TestUniversityStudent {
    public static void main(String args[]){
        UniversityStudent universitystudent = new UniversityStudent("ABBA",1,"UCLA");
        System.out.println("name:"+universitystudent.name+" , "+"id:"+universitystudent.id+" , "+"school:"+universitystudent.school);
    }
}
