package lang.wrapper;

public class MyIntegerMethodMain0 {
    public static void main(String[] args) {
        int value = 10;
        int i1 = conpareTo(value,5);
        int i2 = conpareTo(value,10);
        int i3 = conpareTo(value,20);
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
    }

    public static int conpareTo(int value, int target){
        if(value < target){
            return -1;
        } else if (value > target) {
            return 1;
        }else{
            return 0;
        }
    }
}
