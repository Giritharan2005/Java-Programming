 class Parent{
    void display(){
        System.out.println("parent");
    }
}
class Child extends Parent{
    void show(){
        System.out.println("child");
    }
}
public class inheritance{
    public static void main(String[] args) {
        Child c=new Child();
        c.show();
        c.display();
    }
}


