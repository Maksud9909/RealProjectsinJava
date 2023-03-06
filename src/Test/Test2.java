package Test;

public class Test2 {
    public static void main(String[] args) {
        comboString("34","Maksud");
    }
    public static void comboString (String first,String second){
        if (first.length() > second.length()){
            String result = second + first + second;
            System.out.println(result);
        }else {
            String result = first + second + first;
            System.out.println(result);

        }
    }
}
