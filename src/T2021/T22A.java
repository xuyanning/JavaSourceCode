package T2021;

public class T22A {
    public static void main(String[] args) {
        String[] codes = { "SD2020", null, "SD1015","SD202a" };
        for (int i = 0; i <= 4; i++) {
            try {
                System.out.println("解析编码"+ i+ "。。。" + codes[i]);
                analyseCode(codes[i]);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("没有代码可供解析了");
                break;
            } catch (Exception e) {
                System.out.println("未知异常");
            }
            System.out.println("----------");
        }
        System.out.println("全部解析完毕 ");
    }
    public static void analyseCode(String code) throws Exception {
        int syear=0;
        try {
            syear = Integer.parseInt(code.substring(2, 6));
            if (syear > 2100 || syear < 1901)
                throw new Exception();
            System.out.println("该编码正确");
        } catch (NullPointerException e) {
            System.out.println("编码为空" );
        } catch (NumberFormatException e) {
            System.out.println("年份格式解析错误 ");
        } finally {
            System.out.println("解析完毕。。。"+code);
        }
    }
}
