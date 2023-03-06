package Test;

public class Test3 {
    public static void main(String[] args) {
        nonStart("Maksud","Rustamov");
    }
    public static void nonStart (String a,String b){
        String result1 = a.substring(1);
        String result2 = b.substring(1);
        System.out.println(result1+result2);
    }
}
