import java.util.*;
class StringTokeniser{
    public static void main(String[] args) {
        String str = "Hello-World-I-belong-to-India";
        StringTokenizer st = new StringTokenizer(str,"-");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}