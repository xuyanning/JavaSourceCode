package Exercise;

public class StringTest {
    public static void main(String[] args){
        String s = "Java2020";
        String s1 = s.substring(4);
        String s2 = Integer.parseInt(s1) + 1 + s.substring(0,4);
        String s3 = s1.toLowerCase().compareTo(s)>0?"Java":"2020";
        System.out.println(s1+"\n"+s2+"\n"+s3);
        for (int i = 0; i<s.length(); i++)
            System.out.print((char)(s.charAt(i)+1));
    }
}
