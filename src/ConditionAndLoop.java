public class ConditionAndLoop {
    public static void main(String[] args) throws Exception {
        /*
         * 條件式
         * 
         * if (條件) {
         * 條件成立時執行的程式碼
         * } else {
         * 條件不成立時執行的程式碼
         * }
         * //
         */
        // int a = 2;
        // int b = 3;

        // if((a < b) && (b > a)) {
        // System.out.println("a 的確 <= b");
        // } else {
        // System.out.println("a 沒有 <= b");
        // }

        /*
         * else if
         * 
         * if (條件1) {
         * 條件1成立時執行的程式碼
         * } else if (條件2) {
         * 條件2成立時執行的程式碼
         * } else {
         * 條件1跟條件2都不成立時執行的程式碼
         * }
         */
        // int a = 2;

        // if(a == 2) {
        // System.out.println("a : 2");
        // } else if(a == 3) {
        // System.out.println("a : 3");
        // } else if(a == 4) {
        // System.out.println("a : 4");
        // } else {
        // System.out.println("a 為2,3,4以外的數字");
        // }

        // int a=59;

        // if (a==100){
        // System.out.println("超棒");
        // }else if(a>80){
        // System.out.println("很好");
        // }else if(a>60){
        // System.out.println("好");
        // }else if(a<60){
        // System.out.println("OK");
        // }

        /*
         * 簡化if else 寫法
         * (條件) ? 條件成立時執行的程式碼 : 條件不成立時執行的程式碼
         */
        // int a = 2;
        // int b = 3;

        // String min = (a < b) ? "A < B" : "B > A";
        // System.out.println(min);

        /*
         * 53,54 這兩行 效果等於以下寫法
         */
        // if(a < b) {
        // System.out.println("A < B");
        // } else {
        // System.out.println("B > A");
        // }

        /*
         * for 迴圈
         * for (初始值; 進入迴圈條件; 增量/減量) {
         * 條件成立時執行的程式碼
         * }
         */
        // for(int index = 0; index <= 10; index ++) {
        // System.out.println(index);
        // System.out.println(index+1);
        // }

        // for (int x = 2; x <= 9; x++) {
        // for (int y = 1; y <= 9; y++) {
        // if (x != y) {
        // System.out.print(x + "x" + y + "=" + x * y + " ");
        // }
        // }
        // System.out.println(); // 多這一段會換行
        // }

        // int ln = 7; 第n行
        // for (int x = 1; x <= ln; x++) {
        // // System.out.println("*");

        // for (int blank = 1; blank <= ln - x; blank++) {
        // System.out.print(" ");
        // }
        // for (int star = 1; star <= (2 * x) - 1; star++) {
        // System.out.print("*");
        // }
        // System.out.println("");
        // }

        /*
         * for 迴圈 將array所有元素印出來範例
         * 元素長度可以用 array.length 取得
         * 可用Debug 觀察 index 的變化
         */
        // 算陣列裡的總合
        // int sum=0;
        // int[] bingo = {7, 22, 89, 55};
        // for(int index = 0; index < bingo.length; index ++) {
        // sum=sum+bingo[index];
        // }
        // System.out.println(sum);

        //比較出最大值
        // int max = 0;
        // int[] bingo = { 7, 22, 89, 55, 88 };
        // for (int index = 0; index < bingo.length; index++) {
        //     if (bingo[index] > max) {
        //         max = bingo[index];
        //     }
        // }
        // System.out.println(max);

        /*
         * for 迴圈 減量範例
         * 這裡的 index 會從10開始，然後每次減1，直到 index <= 0 為止
         * 可用Debug 觀察 index 的變化
         */
        // for(int index = 10; index > 0; index --) {
        // System.out.println(index);
        // }

        /*
         * for each 迴圈
         * for (資料型態 單一變數名稱 : 陣列變數名稱) {
         * 條件成立時執行的程式碼
         * }
         * key value
         * { 
         *  "name":"t1"
         * }
         * {
         * "name":"t2"
         * }
         * 取出一整行
         */
        // String[] students = { "A1", "A2", "A3" };
        // for (String stu : students) {
        // System.out.println(stu);
        // }

        /*
         * 105 ~ 108 這幾行 效果等於以下寫法
         */
        // String[] students = { "A1", "A2", "A3" };
        // for (int index = 0; index <= students.length - 1; index++) {
        // System.out.println(students[index]);
        // }

    }
}
