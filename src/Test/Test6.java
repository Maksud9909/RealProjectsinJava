package Test;

public class Test6 {
    public static void main(String[] args) {
        withoutend("Maksud");
    }
    public static void withoutend (String str){
        String firstPart = str.substring(0,1);
        String secondpart = str.substring(str.length()-1);
        String result = firstPart + secondpart;
        System.out.println(result);

    }
}
