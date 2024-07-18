import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro parametro");
        int primeiroParametro = scanner.nextInt();

        System.out.println("Informe o segundo parametro");
        int segundoParametro = scanner.nextInt();

        try {
            contar(primeiroParametro, segundoParametro);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }

    public static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
        
        if (primeiroParametro > segundoParametro) {
            throw new ParametrosInvalidosException();
        }

        int diferenca = segundoParametro - primeiroParametro;
        
        for (int i = 1; i <= diferenca; i++) {
            System.out.println("Imprimindo o numero " + i);
        }

    }

}
