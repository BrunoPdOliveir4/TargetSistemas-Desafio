import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número para ser verificado");
        try{
            int number = scanner.nextInt();
            
            boolean resultado = fibonacci(number);

            System.out.println((resultado) ? "Está na sequência" : "Não está na sequẽncia");
        }catch(InputMismatchException e){
            System.out.println("O valor informado não é um número.");
        }

        scanner.close();
    }


    static boolean fibonacci(int number){
        int lastNumber = 0;
        int thisNumber = 1;

        do{
            int nextNumber = lastNumber + thisNumber;
            if(nextNumber == number) return true;

            lastNumber = thisNumber;
            thisNumber = nextNumber;
        }while(thisNumber < number);
        
        return false;
    }

}