package Test;

public class Test1 {
    public static void main(String[] args) {
        withoutEnd("hhh");
    }
    public static void withoutEnd(String str){
        int len = str.length();

        int a = 5;
        System.out.println(a);


        String result = str.substring(1,len-1); // мы взяли с длины отняли
        System.out.println(result);
    }
}
