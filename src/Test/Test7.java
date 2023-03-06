package Test;

public class Test7 {
    public static void main(String[] args) {
        endsLy("Maksudl");
    }
    public static void endsLy (String str){
        if (str.endsWith("ly")){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
