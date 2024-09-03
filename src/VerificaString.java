import java.util.Scanner;

public class VerificaString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe uma string: ");
        String entreString = scanner.nextLine();

        int count = 0;

        for( char c: entreString.toCharArray()){
            if(c == 'A' || c == 'a') {
                count ++;
            }
        }

        if (count > 0){
            System.out.println("A letra  'a' (maiúscula ou minúscula) aparece " + count + " vezes" +
                    " na string" );
        }else {
            System.out.println("A letra 'a' (maiúscula ou minúscula)  não foi encontrada na " +
                    "string" +
                    " " );
        }

        scanner.close();




    }
}
