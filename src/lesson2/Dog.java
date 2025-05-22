package lesson2;

//DOG類別繼承Animal類別, 用extends關鍵字

public class Dog extends Animal{
    public Dog() {
        //super(); // 呼叫父類別建構子
        System.out.println("狗類別建構子");
    }


public void bark() {
    System.out.println("狗會叫:汪汪汪");
}

/* // 覆寫, 只能覆寫同類別
@Override
public void speak() {
    System.out.println("狗在汪汪汪叫");
} */
}