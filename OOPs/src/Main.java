class Pen {
    String color;
    String type;

    public String printInfo() {
//        System.out.println(this.color);
//        System.out.println(this.type);
        return color+" and "+type;
    }
}

class Student {
    String name;
    int age;
}

public class Main {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        Pen pen2 = new Pen();

        pen1.color = "red";
        pen1.type = "ball-pen";

        pen2.color = "blue";
        pen2.type = "gel-pen";

        System.out.println(pen1.printInfo());
        System.out.println(pen2.printInfo());
    }
}