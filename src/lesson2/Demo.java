package lesson2;

public class Demo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.speak(); // 動物會叫

        Dog dog = new Dog();
        dog.speak(); // 動物會叫
        dog.bark(); // 狗會叫:汪汪汪

        Cat cat = new Cat();
        cat.speak(); // 動物會叫
        cat.meow(); // 貓會叫:喵喵喵 


    }
}
