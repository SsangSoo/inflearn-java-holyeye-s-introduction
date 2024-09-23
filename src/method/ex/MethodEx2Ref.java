package method.ex;

public class MethodEx2Ref {

    public static void main(String[] args) {
        printMessage(3, "Hello, world!");
        System.out.println();
        printMessage(5, "java");
        System.out.println();
        printMessage(7, "hi");
    }

    public static void printMessage(int times, String message) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
}
