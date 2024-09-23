package loop.ex;

public class NestedEx1 {
    public static void main(String[] args) {
        int result;

        for(int i=1; i <= 9; i++) {
            for(int j=1; j<=9; j++) {
                result = i * j;
                System.out.println(i + " * " + j + " = " + result);
            }
        }
    }
}
