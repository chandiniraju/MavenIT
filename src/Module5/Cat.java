package Module5;

public class Cat implements Animal, Animal1{


    @Override
    public void eat() {
     System.out.println("Animal eating");
    }

    @Override
    public void run() {
        System.out.println("Animal running");
    }

    @Override
    public void sleep() {
        System.out.println("Animal sleeping");
    }

    @Override
    public void bark() {
        System.out.println("Animal1 barking");
    }

    @Override
    public void drink() {
        System.out.println("Animal1 drinking");
    }
}
