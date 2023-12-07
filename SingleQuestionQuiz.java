import java.util.Scanner;
public class SingleQuestionQuiz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        PrimeNumber p = new PrimeNumber(number);
        boolean b = p.Prime();
        System.out.println(b);
    }
}


class PrimeNumber {
    int n;
    public PrimeNumber(int number) {
        n = number;
    }

    public boolean Prime() {
        if(n == 1) {
            return true;
        }
        return false;
    }
}