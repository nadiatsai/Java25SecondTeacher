package lesson1;
public class Car {
    // 屬性
    public String color;
    public String number;
    public int year = 0;

    // 建構子(STEP1給初始值)
    public Car(String inputNumber, String inputColor) {
        this.color = inputNumber;
        this.number = inputColor;
    }

    // STEP2方法(用this自己的屬性/方法)
    public void showCarInfo() {
        System.out.println("Car number " + this.number + " & Car color:" + this.color);
    }
}
