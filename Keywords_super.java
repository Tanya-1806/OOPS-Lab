class Parent {
    int num = 50;
}


class Child extends Parent {
    int num = 100;

    void display() {
        System.out.println("Using this: " + this.num);
        System.out.println("Using super: " + super.num);
    }
}

class Keywords_super {

    public static void main(String[] args) {

        Child obj = new Child();
        obj.display();
    }
}
