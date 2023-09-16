public class Main {

    private static void countIt() {
        System.out.println("------\nThere are:Animals " +
                Animal.count() + "; Dogs " +
                Dog.count() + "; Cats " +
                Cat.count() + ".\n------");
    }

    public static void main(String[] args) {
        countIt();
        Dog d1 = new Dog();
        countIt();
        d1.run(120);
        d1.run(1200);
        d1.swim(50);
        d1.swim(5);
        (new Dog()).swim(10);
        countIt();
        Cat c1 = new Cat();
        countIt();
        c1.run(180);
        c1.run(1000);
        c1.swim(50);
    }
}
