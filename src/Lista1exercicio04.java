import java.util.Scanner;

public class Lista1exercicio04 {
    public static void main(String[] args) {
        Scanner entrada_do_usuario = new Scanner(System.in);
        System.out.println("Media aritimedica de quantos numeros quiser");

        System.out.println("Deseja calcular a media de quantos números? ");
        int n = entrada_do_usuario.nextInt();

        double soma = 0;
        int numero = 1;

        while (numero <= n){
            System.out.println("Digite o " + numero + " numero inteiro: ");
            int valor = entrada_do_usuario.nextInt();
            numero = numero + 1;
            soma = soma + valor;
        }

        double media = (soma)/n;
        System.out.println("A soma dos números acima é: " + soma);
        System.out.println("e a media desses números é: " + media);
    }
}

