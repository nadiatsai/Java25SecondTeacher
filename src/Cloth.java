public class Cloth {
    public String color = "";
    public String size = "";
    public String logo = "";

    public Cloth(String logo,String color, String size){
        this.logo=logo;
        this.color=color;
        this.size=size;
    }

    public void showCloth(){
        System.out.println("Clothes type: " + this.logo +",color:" +this.color + ",size:"+this.size);
    }
}
