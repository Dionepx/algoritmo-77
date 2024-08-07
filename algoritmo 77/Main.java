import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2;
        double quadrado_da_diferenca;

        System.out.println("Entre com o primeiro número: ");
        num1 = sc.nextInt();

        System.out.println("Entre com o segundo número: ");
        num2 = sc.nextInt();

        quadrado_da_diferenca = Math.pow(num1 - num2, 2);

        System.out.println("Quadrado da diferença é " + quadrado_da_diferenca);

        sc.close();
    }
}