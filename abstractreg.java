abstract class A{
    void run(){
        System.out.println("non abstract method");
    }
    abstract void show();
}
class B extends A{
    void display(){
        System.out.println("normal method");
    }

   void show(){ 
    System.out.println("abstract method");
}
}
public class abstractreg{
  public static void main(String[] args) {
      B b = new B();
      b.display();
      b.run();
      b.show();
  }
}