package lesson1;
public class Person {
    public String name;
    public int age;
    

    // 建構子(STEP1給初始值)
    public Person(String inputName, int inputAge) {
        this.name = inputName;
        this.age = inputAge;
    }

    // STEP2方法(用this自己的屬性/方法)
    public void showPersonInfo() {
        System.out.println("Person Name: " + this.name + " & Age:" + this.age);
    }
}
