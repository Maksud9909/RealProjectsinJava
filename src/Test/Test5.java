package Test;

public class Test5 {
    public static void main(String[] args) {
        end("Hello",false);
    }
    public static void end (String str,boolean front){
        if(front == true){
            String result = str.substring(0,1);
            System.out.println(result);
        }else {
            System.out.println(str.substring(str.length()-1));
        }
    }
}
