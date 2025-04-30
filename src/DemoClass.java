public class DemoClass {
    public static void main(String[] args) {
        
        // 類別實作，Car1是實作的物件型別為Car型別的Car
        Car car1 = new Car("123", "blue");
        car1.showCarInfo();
      /*   car1.number="001";
        car1.color="黃色";
        car1.showCarInfo(); */

        Person person1 = new Person("Mary", 22);
        person1.showPersonInfo();

        Person person2 = new Person("Daniel", 18);
        person2.showPersonInfo();

        Cloth c1=new Cloth("NIKE","red","M");
        c1.showCloth();

        //開戶並存款20000
        Bank b1= new Bank("nadia",2000);
        //顯示帳戶餘額
        b1.showBank();

       
        b1.setBalance1("nadia","deposit",2000);
        int myBalance=b1.getBalance1();
        System.out.println("my balance is "+myBalance);
      
        b1.setBalance1("nadia","deposit",0);
        int myBalance1=b1.getBalance1();
        System.out.println("my balance is "+myBalance1);

        //帳號錯誤
        b1.setBalance1("nadi","deposit",0);
        int myBalance2=b1.getBalance1();
        System.out.println("my balance is "+myBalance2);

        //提款
        b1.setBalance1("nadia","withdraw",5000);        
        int myBalance3=b1.getBalance1();
        System.out.println("my balance is "+myBalance3);
 
//改成新帳號
        b1.setAccount("nadia","nadi");
        System.out.println(b1.getAccount());

        b1.setBalance1("nadi","deposit",2000);
        int myBalance4=b1.getBalance1();
        System.out.println("my balance is "+myBalance4);


        //不用建構子
     Student stu1= new Student();
        stu1.setName("Mary");       
        stu1.setScore(90);
        System.out.println(stu1.getName()+"的分數是"+stu1.getScore());

    }
}
