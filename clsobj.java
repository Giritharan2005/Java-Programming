public class clsobj{
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2 =  new Student();
        s1.setValues("abc", 20,1);
        s2.setValues("xyz", 21,2);
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.roll_no);
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.roll_no);
    }
}
class Student{
    String name;
    int age;
    int roll_no;
    void setValues (String name, int age, int roll_no){
        this.name=name;
        this.age=age;
        this.roll_no=roll_no;
    }
}