package nested.inner;

public class InnerOuter {

    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    class Inner{
        private int nestedInstanceValue = 1 ;

        public void print(){
            System.out.println(nestedInstanceValue);

            System.out.println(outInstanceValue);

            System.out.println(InnerOuter.outClassValue);

        }
    }
}
