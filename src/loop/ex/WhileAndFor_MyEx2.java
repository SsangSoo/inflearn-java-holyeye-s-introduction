package loop.ex;

public class WhileAndFor_MyEx2 {
    public static void main(String[] args) {

        for(int count = 0, i = 1; count < 10; i++) {
            if(i % 2 == 1) {
                continue;
            }
            System.out.println(i);
            count++;
        }

        System.out.println();
        System.out.println("=================");
        System.out.println();

        int count = 0;
        int i = 1;
        while(count < 10) {
            if(i % 2 == 1) {
                i++;
                continue;
            }
            System.out.println(i++);
            count++;
        }
    }
}
