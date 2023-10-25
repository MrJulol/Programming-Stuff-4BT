package A3;


class A {
    public A() {
        System.out.println("Hallo vom Konstruktor A");
    }
}

class B extends A {
    public B() {
        System.out.println("Hallo vom Konstruktor B");
    }
}

class C extends B {
    public C() {
        System.out.println("Hallo vom Konstruktor C");
    }
}

class main {
    public static void main(String[] args) {
        C c = new C();
    }

}
