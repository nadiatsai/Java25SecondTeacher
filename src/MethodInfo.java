       public class MethodInfo {
       public static void main(String[] args) throws Exception {
        // 沒有輸入參數 ＆ 沒有回傳值
        // sayHello1();

        // 有輸入參數 ＆ 沒有回傳值
        // sayHello2("Tom");
        // String inputName="David";
        // sayHello2(inputName);

        // 有輸入參數 ＆ 有回傳值
        // 需要用變數接回傳值
    //     String result = sayHello3("Jerry");
    //     System.out.println(result);    
    // }

    //
    String getResult = checkScore(90);
    System.out.println(checkScore(90));}

    public static String checkScore(int score) {
        String result = "";
        if (score >= 90) {
            return "超棒";
        } else if (score > 80) {
            return "很好";
        } else if (score > 60) {
            return "好";
        } else if (score < 60) {
            return "OK";
        }
        return " ";
    }
}
       


/*
 * 修飾 靜態? 回傳型態 方法名稱(輸入參數)
 * 
 * 修飾: public, private, protected
 * 靜態: static (靜態方法只能呼叫靜態方法)
 * 無回傳值: void(如果是int要return)
 * 方法名稱: sayHello1
 * 輸入參數: 無
 */
// public static void sayHello1() {
// System.out.println("Hi everyone");
// // void 可省略 return;
// //return;
// }

/*
 * 修飾 靜態? 回傳型態 方法名稱(輸入參數)
 * 
 * 修飾: public, private, protected
 * 靜態: static (靜態方法只能呼叫靜態方法)
 * 無回傳值: void
 * 方法名稱: sayHello2
 * 輸入參數: String name(需要型別)
 */
// public static void sayHello2(String name) {
// System.out.println("Hi " + name);
// // void 可省略 return;
// return;
// }

/*
 * 修飾 靜態? 回傳型態 方法名稱(輸入參數)
 * 
 * 修飾: public, private, protected
 * 靜態: static (靜態方法只能呼叫靜態方法)
 * 有回傳值: 型態為: String
 * 方法名稱: sayHello2
 * 輸入參數: String name
 */
// public static String sayHello3(String name) {
// return "Hi " + name;
// }

// }
