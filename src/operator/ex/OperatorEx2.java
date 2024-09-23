package operator.ex;

public class OperatorEx2 {
    public static void main(String[] args) {
        // 다음 double 변수들을 선언하고 그 합과 평균을 출력하는 프로그램을 작성하세요.
        double val1 = 1.5;
        double val2 = 2.5;
        double val3 = 3.5;

        double doubleSum = val1 + val2 + val3;
        double doubleAverage = doubleSum / 3;

        System.out.println("doubleSum = " + doubleSum + ", doubleAverage = " + doubleAverage);
    }
}
