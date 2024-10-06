package lang.wrapper.test;

public class WrapperTest2 {
    public static void main(String[] args) {
        String[] array = {"1.5", "2.5", "3.0"};
        double result = 0;
        for (String s : array) {    //s는 array배열의 값을 하나씩 저장하는 변수명
            double num = Double.parseDouble(s);
            result += num;
        }

        System.out.println("sum = "+result);
    }
}
