public class Student {
    private String name;
    private int score;

    
    
    /*     public Student(String name, int inputScore) {
            this.setName = name;
            this.setScore = (inputScore);
        } */
        public String getName() {
            return this.name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        public int getScore() {
            return this.score;
        }
    
        public void setScore(int inputScore) {
            if(inputScore>=0 && inputScore<=100){
                this.score = inputScore;
        }else{
            System.out.println("分數請輸入0~100");
        }
        }
    }