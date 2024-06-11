import java.util.Scanner;

public class ConversaoWrapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira um valor numérico
        System.out.print("Digite um valor numérico: ");

        // Lê o valor numérico do console e armazena em uma variável do tipo primitivo
        int valorPrimitivo = scanner.nextInt();

        // Converte o valor primitivo para o tipo Wrapper correspondente
        Integer valorWrapper = Integer.valueOf(valorPrimitivo);

        // Imprime o valor primitivo e o valor Wrapper
        System.out.println("Valor primitivo: " + valorPrimitivo);
        System.out.println("Valor Wrapper: " + valorWrapper);

        // Fecha o Scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
