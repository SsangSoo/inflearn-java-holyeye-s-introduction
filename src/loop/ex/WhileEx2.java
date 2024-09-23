package loop.ex;

public class WhileEx2 {
    public static void main(String[] args) {
        int num = 2;
        int count = 1;
        while(count <= 10) {
            if(num % 2 == 1) {
                num++;
                continue;
            }
            System.out.println(num++);
            count++;
        }
    }
}
