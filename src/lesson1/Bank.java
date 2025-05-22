package lesson1;
public class Bank {
    private String account;
    private int balance1 = 0;

    public Bank(String registerAccount, int inputBalance) {
        this.account = registerAccount;
        this.balance1 = inputBalance;
    }

    public void showBank() {
        System.out.println(this.account + "Balance: $" + this.balance1);
    }

    public String getAccount() {
        return this.account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

//更改帳號
    public void setAccount(String inputAccount, String newAccount) {
        if (inputAccount != this.account) {
            System.out.println("帳號錯誤，請重新輸入");
        } else {
            this.account = newAccount;
        }
    }

    


    // 回傳餘額
    public int getBalance1() {
        return this.balance1;
    }

    // 存錢/提款
    public void setBalance1(String account, String action, int balance1) {

        if(account != this.account){
            System.out.println("帳號錯誤，請重新輸入");
        }else{
            if (action =="deposit"){
                if(balance1>0){
                    this.balance1 = this.balance1 + balance1;
                }else{
                System.out.println("存款金額錯誤");
            }
        }

            if (action=="withdraw"){

                if(this.balance1>=balance1){
                    this.balance1 = this.balance1 - balance1;
                }else{
                    System.out.println("您的餘額不足，無法提款");
                }
            }

        }

    }}