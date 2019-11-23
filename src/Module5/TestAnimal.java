package Module5;

public class TestAnimal {

    public static void main(String[] args) {

        Cat c = new Cat();
        c.bark();  //Access all the methods from two interfaces --Multiple inheritance
        c.drink();
        c.eat();
        c.run();
        c.sleep();

        // create reference of interface Animal

        Animal a= new Cat();
        a.eat();
        a.sleep();
        a.run();
        // // create reference of interface Animal1
        Animal1 a1= new Cat();
        a1.bark();
        a1.drink();

    }
}
