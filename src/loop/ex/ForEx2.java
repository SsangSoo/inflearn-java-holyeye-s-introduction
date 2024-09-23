package loop.ex;

public class ForEx2 {
    public static void main(String[] args) {
//        for(int count = 1, num = 2; count <= 10; num++) {
//            if(num % 2 == 1) {
//                continue;
//            }
//            System.out.println(num);
//            count++;
//        }

        int num = 2;
        for(int count = 1; count <= 10; count++) {
            System.out.println(num);
            num += 2;
        }

    }
}
