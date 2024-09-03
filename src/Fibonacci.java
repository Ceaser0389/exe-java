import java.util.Scanner;
//
public class Fibonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número:");
        int number = scanner.nextInt();

        if (verificaSeFibonacci(number)){
            System.out.println("O número: " + number + " pertence á sequência de Fibonacci");
        }
        else {
            System.out.println("O número: " + number + " não pertence á sequência de Fibonacci") ;
        }

        scanner.close();

    }

    public static boolean  verificaSeFibonacci(int number){
        if(number < 0){
            return false;
        }

        int a = 0;
        int b = 1;

        while(a < number){
            int prox = a + b;
            a = b;
            b = prox;
        }
        return  a == number;
    }

}
