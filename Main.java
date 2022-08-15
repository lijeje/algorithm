package Main;


public class Main {

    public static void main(String[] args) {
       String s = "aabababa";
       String part = "aba";


        while (s.contains(part)) {
           s = removeString(s, part);
        }
        System.out.println(s);
    }


    public static String removeString(String s, String part){

        s = s.replaceAll(part,"");// abab

        return s;
    }
}
