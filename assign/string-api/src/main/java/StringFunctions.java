public class StringFunctions {

    public static String reverseString(String s){
        StringBuilder reversed_string = new StringBuilder();
        reversed_string.append(s);
        reversed_string.reverse();
        return String.valueOf(reversed_string);
    }
    public static int sizeofString(String s){
        return s.length();
    }
}
