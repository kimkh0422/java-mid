package lang.string.test;

public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";
        String result1 = str.substring(0,str.indexOf(ext));
        String result2 = str.substring(str.indexOf(ext));
        System.out.println("filename = "+result1);
        System.out.println("extName = "+result2);
    }
}
