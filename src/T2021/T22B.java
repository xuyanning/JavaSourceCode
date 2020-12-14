package T2021;

class MyException extends Exception{ }
public class T22B {
    public static void main(String args[]) {
        new ExceptionT().m();
    }
}
class ExceptionT{
    String[] strList = {"1024",null,"-1024"};
    int count= 0;
    public void m(){
        count = 0;
        for (String str:strList) {
            try {
                System.out.println(count++ + "正在处理字符串" + str);
                System.out.println("number = " + f(str));
            } catch (MyException e) {
                System.out.println("number = " + 0);
            } catch (Exception e) {
                System.out.println("未知错误");
            }
            System.out.println("********");
        }
    }
    public int f(String s) throws MyException {
        int number = 0;
        char ch=' ';
        try {
            for (int i = 0; i < s.length(); i++) {
                ch = s.charAt(i);
                int d = Integer.parseInt(ch + "");
                if (d == 0) continue;
                number = number * 10 + d;
            }
        }catch (NumberFormatException e){
            System.out.println("不能识别字符"+ch);
            throw new MyException();
        }finally {
            System.out.println(s+ "处理完毕");
        }
        return number;
    }
}