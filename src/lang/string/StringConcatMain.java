package lang.string;

public class StringConcatMain {
    public static void main(String[] args) {
        String a = "hello";
        String b = " java";

        String result1 = a+b;
        String result2 = a.concat(b);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

    }
}
