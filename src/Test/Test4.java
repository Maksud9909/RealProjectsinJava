package Test;

public class Test4 {
    public static void main(String[] args) {
        left2("Hello");
    }
    public static void left2 (String str){
        String result = str.substring(2, str.length()) + str.substring(0,2);
        System.out.println(result);

    }
}
