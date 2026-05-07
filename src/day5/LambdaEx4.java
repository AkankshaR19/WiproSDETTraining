package day5;
interface mul {
    int mul(int a, int b);
}

public class LambdaEx4 {
    public static void main(String[] args) {

        mul m = (a, b) -> {
            return a * b;
        };

        System.out.println(m.mul(7, 9));
    }
}