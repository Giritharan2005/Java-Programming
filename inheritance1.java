class Grandpa {
    void land() {
        System.out.println("grandpa");
    }
}

class Parent extends Grandpa {
    void car() {
        System.out.println("parent");
    }
}

class Child extends Parent {
    void toy() {
        System.out.println("child");
    }
}

public class inheritance1 {
    public static void main(String[] args) {
        Child c = new Child();
        Parent p = new Parent();

        c.toy();   
        c.car();   
        c.land();  
        p.land();  
    }
}
